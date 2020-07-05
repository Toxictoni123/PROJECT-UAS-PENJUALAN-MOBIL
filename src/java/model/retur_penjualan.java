package model;

public class retur_penjualan {
    private String no_retur,tgl,kd_mobil,total,no_jual,no_faktur,no_pesan;
    
    public retur_penjualan(){
        
    }

    public retur_penjualan(String no_retur, String tgl, String kd_mobil, String total, String no_jual, String no_faktur, String no_pesan) {
       this.no_retur = no_retur;
       this.tgl = tgl;
       this.kd_mobil = kd_mobil;
       this.total = total;
       this.no_jual = no_jual;
       this.no_faktur = no_faktur;
       this.no_pesan = no_pesan;
    }

    public String getNo_retur() {
        return no_retur;
    }

    public void setNo_retur(String no_retur) {
        this.no_retur = no_retur;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
    
    public String getKd_mobil() {
        return kd_mobil;
    }

    public void setKd_mobil(String kd_mobil) {
        this.kd_mobil = kd_mobil;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNo_jual() {
        return no_jual;
    }

    public void setNo_jual(String no_jual) {
        this.no_jual = no_jual;
    }

    public String getNo_faktur() {
        return no_faktur;
    }

    public void setNo_faktur(String no_faktur) {
        this.no_faktur = no_faktur;
    }

    public String getNo_pesan() {
        return no_pesan;
    }

    public void setNo_pesan(String no_pesan) {
        this.no_pesan = no_pesan;
    }
        
    public String selectAll(){
        String sql = "select * from retur_penjualan";
        return sql;
    }
    
    public String select(){
        String sql = "select * from retur_penjualan where " 
                + "no_retur = '" + no_retur + "'";
        return sql;
    }
 
}
