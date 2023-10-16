package pr;

public class ManageSubClasses extends UstSinif{
    UstSinif ustSinif;

    public ManageSubClasses(UstSinif ustSinif) {
        this.ustSinif = ustSinif;
    }

    @Override
    public void gosterMethod() {
        this.ustSinif.gosterMethod();
    }

    @Override
    public void toplaMethod() {
        this.ustSinif.toplaMethod();
    }

    @Override
    public void methodBir() {
        this.ustSinif.methodBir();
    }

    @Override
    public void iclassesIki() {
        this.ustSinif.iclassesIki();
    }
}
