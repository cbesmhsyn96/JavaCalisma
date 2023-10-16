package pr;

public abstract class SoyutSinif {
    public abstract void methodBir();
    private int sayi_1;
    private int sayi_2;
    static int a = 334;//Bu değer sonradan değiştirilebilir.

    public int getSayi_1() {
        return sayi_1;
    }

    public void setSayi_1(int sayi_1) {
        this.sayi_1 = sayi_1;
    }

    public int getSayi_2() {
        return sayi_2;
    }

    public void setSayi_2(int sayi_2) {
        this.sayi_2 = sayi_2;
    }

    public int toplaSoyutSinif(int aa,int bb){
        setSayi_1(aa);
        setSayi_2(bb);
        return getSayi_1()+getSayi_2();
    }
}