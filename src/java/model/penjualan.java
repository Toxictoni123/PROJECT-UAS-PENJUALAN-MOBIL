package model;

public class penjualan {
    private String no,tgl,nof,total,nopes,kd_mobil,qty,subtotal,pelanggan;
    
    public penjualan(){
        
    }
    
    public penjualan(String no, String tgl, String nof, String total, String nopes, String kd_mobil, String qty, String subtotal, String pelanggan) {
       this.no = no;
       this.tgl = tgl;
       this.nof = nof;
       this.total = total;
       this.nopes = nopes;
       this.kd_mobil = kd_mobil;
       this.qty = qty;
       this.subtotal = subtotal;
       this.pelanggan = pelanggan;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getNof() {
        return nof;
    }

    public void setNof(String nof) {
        this.nof = nof;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNopes() {
        return nopes;
    }

    public void setNopes(String nopes) {
        this.nopes = nopes;
    }

    public String getKd_mobil() {
        return kd_mobil;
    }

    public void setKd_mobil(String kd_mobil) {
        this.kd_mobil = kd_mobil;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    
    public String getPelanggan(){
        return pelanggan;
    }
    
    public void setPelanggan(String pelanggan){
        this.pelanggan = pelanggan;
    }
    
    public String selectAll(){
        String sql = "select * from penjualan";
        return sql;
    }
    
    public String select(){
        String sql = "select * from penjualan where " 
                + "no_jual = '" + no + "'";
        return sql;
    }
    
    public String toDelete(){
        return "DELETE FROM sementara "
                + " WHERE kode='" + kd_mobil + "'";
    }
    
    public String toInsert(){
        return "INSERT INTO sementara VALUES('"
                + no + "','"
                + tgl + "','"
                + pelanggan + "','"
                + kd_mobil + "','"
                + qty + "','"
                + subtotal + "')";
    }
     
}
