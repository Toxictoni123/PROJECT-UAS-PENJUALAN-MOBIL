package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.user;
        
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String proses=request.getParameter("proses");
        if(proses.equals("logout")){
            HttpSession sesi=request.getSession();
            sesi.invalidate();
            response.sendRedirect("index.jsp");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String proses = request.getParameter("proses");
        
        if(proses.equals("login")){
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            String hak_akses = request.getParameter("hak_akses");
            String id = request.getParameter("id");
            if(pass == null || pass.equals("")){
                response.sendRedirect("index.jsp");
            }else{
                user pm = new user();
                List<user> datalogin = new ArrayList<user>();
                
                datalogin = pm.LoginUser(user, pass);
                if(datalogin.isEmpty()){
                    response.sendRedirect("index.jsp");
                }else{
                    HttpSession session = request.getSession(true);
                    session.setAttribute("username", datalogin.get(0).getId_user());
                    session.setAttribute("id", datalogin.get(0).getId());
                    session.setAttribute("hak_akses", datalogin.get(0).getHak_akses());
                    if(datalogin.get(0).getHak_akses().equals("Admin")){
                        response.sendRedirect("beranda.jsp");
                    }
                    else if(datalogin.get(0).getHak_akses().equals("User")){
                        response.sendRedirect("beranda2.jsp");
                    }
                }
            }
        }
    }
}
