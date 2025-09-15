package com.mycompany.kantorpos.Model;

public class Paket {
    private String resi;
    private String pengirim;
    private String penerima;
    private String telepon;
    private String jenis;
    private String beratPaket;
    private String alamat;
    private String tanggalPengiriman;
    private String tanggalSampai;
    private String status;
    private String biayaPaket;

    // Constructor
    public Paket(String resi, String pengirim, String penerima, String telepon, 
                 String jenis, String beratPaket, String alamat, 
                 String tanggalPengiriman, String tanggalSampai, 
                 String status, String biayaPaket) {
        this.resi = resi;
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.telepon = telepon;
        this.jenis = jenis;
        this.beratPaket = beratPaket;
        this.alamat = alamat;
        this.tanggalPengiriman = tanggalPengiriman;
        this.tanggalSampai = tanggalSampai;
        this.status = status;
        this.biayaPaket = biayaPaket;
    }

    // Getter dan Setter
    public String getResi() { return resi; }
    public void setResi(String resi) { this.resi = resi; }

    public String getPengirim() { return pengirim; }
    public void setPengirim(String pengirim) { this.pengirim = pengirim; }

    public String getPenerima() { return penerima; }
    public void setPenerima(String penerima) { this.penerima = penerima; }

    public String getTelepon() { return telepon; }
    public void setTelepon(String telepon) { this.telepon = telepon; }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public String getBeratPaket() { return beratPaket; }
    public void setBeratPaket(String beratPaket) { this.beratPaket = beratPaket; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getTanggalPengiriman() { return tanggalPengiriman; }
    public void setTanggalPengiriman(String tanggalPengiriman) { this.tanggalPengiriman = tanggalPengiriman; }

    public String getTanggalSampai() { return tanggalSampai; }
    public void setTanggalSampai(String tanggalSampai) { this.tanggalSampai = tanggalSampai; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getBiayaPaket() { return biayaPaket; }
    public void setBiayaPaket(String biayaPaket) { this.biayaPaket = biayaPaket; }
}
