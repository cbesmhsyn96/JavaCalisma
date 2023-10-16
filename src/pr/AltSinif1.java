package pr;

public class AltSinif1 extends UstSinif{
    public void gosterMethodAltSinif2(){
        System.out.println("gosterMethodAltSinif2 çağırdı");
    }

    @Override
    public void methodBir() {
        System.out.println("Alt sınıf1 methodBir yazı");
    }

    @Override
    public void gosterMethod() {
        System.out.println("Alt sınıf1 gosterMethod yazı");
    }

    @Override
    public void toplaMethod() {
        System.out.println("Alt sınıf1 toplaMethod yazı");
    }

    @Override
    public void iclassesIki() {
        System.out.println("Alt sınıf1 iclassesIki yazı");
    }
}
