package pr;

import java.lang.reflect.Array;

public class AltSinif21 extends UstSinif2{
    private String adAltSinif21;
    private int sayiAltSinif21;
    @Override
    public void gosterMethod() {
        System.out.println("gosterMethod pr.AltSinif21");
    }

    @Override
    public void toplaMethod() {
        System.out.println("toplaMethod pr.AltSinif21");
    }

    @Override
    public String getAd() {
        return this.adAltSinif21;
    }

    @Override
    public void setAd(String ad) {
        ad +=" eklenen";
        this.adAltSinif21 = ad;
    }

    @Override
    public int getSayi() {
        return this.sayiAltSinif21;
    }

    @Override
    public void setSayi(int sayi) {
        this.sayiAltSinif21 = sayi;
    }

    @Override
    public Array getArrayy() {
        return super.getArrayy();
    }

    @Override
    public void setArrayy(Array arrayy) {
        super.setArrayy(arrayy);
    }

    double toplaU2Mothod(int tn11, int tn22, double tn3) {
        return tn11+tn22+tn3;
    }

    int toplaU2Mothod(int tn111, int tn222,double c, int r) {
        return tn111+tn222+(int)c+r;
    }
}
