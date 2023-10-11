public class Araba {
    private String kasaTipi;
    private String model;
    private int kullanimKm;
    private int fiyat;
    private int kapi;

    public Araba(String kasaTipi, String model, int kullanimKm, int fiyat, int kapi) {
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanimKm = kullanimKm;
        this.fiyat = fiyat;
        this.kapi = kapi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }
    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getKullanimKm() {
        return kullanimKm;
    }
    public void setKullanimKm(int kullanimKm) {
        this.kullanimKm = kullanimKm;
    }
    public int getFiyat() {
        return fiyat;
    }
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    public int getKapi() {
        return kapi;
    }
    public void setKapi(int kapi) {
        this.kapi = kapi;
    }

    protected void arabayiSur(int kmKullan){
        this.kullanimKm = kmKullan+this.kullanimKm;
        System.out.println("Araba "+kmKullan+" km sürüldü.");
        System.out.println("Arabanın güncel km si :"+this.kullanimKm);
    }
    protected void satisFiyati(int guncelSatisFiyati){
        setFiyat(guncelSatisFiyati);
    }
}
