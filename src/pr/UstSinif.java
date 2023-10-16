package pr;

public class UstSinif extends SoyutSinif implements IClasses,IClasses2{
    @Override
    public void gosterMethod() {
        System.out.println("Goster metod Ust sınıf");
    }

    @Override
    public void toplaMethod() {
        System.out.println("Topla metod Ust sınıf");
    }

    @Override
    public void methodBir() {
        System.out.println("methodBir üst sınıf");
    }

    @Override
    public void iclassesIki() {
        System.out.println("iclassesIki Ust sinif");
    }
}
