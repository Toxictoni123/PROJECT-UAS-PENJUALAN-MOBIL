function pesan(){
    document.getElementById("nopesan").value = document.getElementById("nopes").value;
}

function showEmp(emp_value){
    if(document.getElementById("emp_id").value != "-1"){
        xmlHttp = GetXmlHttpObject()
        if(xmlHttp == null){
            alert("Browser does not support HTTP Request")
            return
        }
        var url = "getmobil.jsp"
        url = url + "?emp_id=" + emp_value
        
        xmlHttp.onreadystatechange = stateChanged
        xmlHttp.open("GET", url, true)
        xmlHttp.send(null)
    } else{
        alert("Pilih Kode Mobil")
    }
}

function stateChanged(){
    document.getElementById("ename").value = "";
    document.getElementById("emp_id").value = "";
    if(xmlHttp.readyState == 4 || xmlHttp.readyState == "complete"){
        var showdata = xmlHttp.responseText;
        var strar = showdata.split(":");
        if(strar.length == 1){
            document.getElementById("emp_id").focus();
            alert("Pilih Kode Mobil");
            document.getElementById("ename").value = " ";
            document.getElementById("emp_id").value = " ";
        } else if(strar.length > 1){
            document.getElementById("ename").value = strar[1];
        }
    }
}

function GetXmlHttpObject(){
    var xmlHttp = null;
    try{
        xmlHttp = new XMLHttpRequest();
    } catch (e){
        try{
            xmlHttp = new ActiveXObject("Msxm12.XMLHTTP");
        } catch (e){
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    return xmlHttp;
}

function sumPesan(){
    var txtFirstNumberValue = document.getElementById('ename').value;
    var txtSecondNumberValue = document.getElementById('jml').value;
    var result = parseFloat(txtFirstNumberValue) * parseFloat(txtSecondNumberValue);
    if(!isNaN(result)){
        document.getElementById('subtotal').value = result;
    }
}



