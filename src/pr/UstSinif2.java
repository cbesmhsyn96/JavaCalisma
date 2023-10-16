package pr;

import java.lang.reflect.Array;

public class UstSinif2 implements IClasses{
    private String ad;
    private int sayi;
    private Array arrayy;
    static int statikNumber = 2323;
    private int tn1;
    private int tn2;

    protected int toplaU2Mothod(int tn1, int tn2){
        setTn1(tn1);
        setTn2(tn2);
        return getTn1()+getTn2();
    }

    @Override
    public void gosterMethod() {
        System.out.println("gosterMethod pr.UstSinif2");
    }

    @Override
    public void toplaMethod() {
        System.out.println("toplaMethod pr.UstSinif2");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public Array getArrayy() {
        return arrayy;
    }

    public void setArrayy(Array arrayy) {
        this.arrayy = arrayy;
    }

    public int getTn1() {
        return tn1;
    }

    public void setTn1(int tn1) {
        this.tn1 = tn1;
    }

    public int getTn2() {
        return tn2;
    }

    public void setTn2(int tn2) {
        this.tn2 = tn2;
    }

}
