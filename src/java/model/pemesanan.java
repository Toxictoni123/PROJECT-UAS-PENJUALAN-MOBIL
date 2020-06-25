package model;

public class pemesanan {
    private String nopesan,tglpesan,pelanggan,kd_mobil,qty,subtotal;
    
    public pemesanan(){
        
    }
    
    public pemesanan(String nopesan, String tglpesan, String pelanggan, String kd_mobil, String qty, String subtotal) {
       this.nopesan = nopesan;
       this.tglpesan = tglpesan;
       this.pelanggan = pelanggan;
       this.kd_mobil = kd_mobil;
       this.qty = qty;
       this.subtotal = subtotal;
    }

    public String getNopesan() {
        return nopesan;
    }

    public void setNopesan(String nopesan) {
        this.nopesan = nopesan;
    }

    public String getTglpesan() {
        return tglpesan;
    }

    public void setTglpesan(String tglpesan) {
        this.tglpesan = tglpesan;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
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
    
    public String selectAll(){
        String sql = "select * from pemesanan";
        return sql;
    }
    
    public String select(){
        String sql = "select * from pemesanan where " 
                + "no_pesan = '" + nopesan + "'";
        return sql;
    }
    
    public String toDelete(){
        return "DELETE FROM pemesanan "
                + " WHERE no_pesan='" + nopesan + "'";
    }
    
    public String toInsert(){
        return "INSERT INTO pemesanan VALUES('"
                + nopesan + "','"
                + tglpesan + "','"
                + pelanggan + "','"
                + kd_mobil + "','"
                + qty + "','"
                + subtotal + "')";
    }
}
