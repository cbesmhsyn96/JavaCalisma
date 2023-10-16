package pr;

public class Main {
    public static void main(String[] args) {
        UstSinif altSinif = new AltSinif2();
        ManageSubClasses manageClass = new ManageSubClasses(altSinif);
        manageClass.gosterMethod();
        manageClass.iclassesIki();
        manageClass.methodBir();
        manageClass.toplaMethod();
        ManageSubClasses.a = 2323;//Soyut sınıfta statik değer atandığı için burda yine değer atayabildik.
        //pr.ManageSubClasses.d = "Altını çizer çünkü statik değer arayüz sınıfında atandı";
        System.out.println("--------------------------------");
        UstSinif siniff = new UstSinif();
        System.out.println("siniff.toplaSoyutSinif(3,4) = "+siniff.toplaSoyutSinif(3,4));
        System.out.println("--------------------------------");
        System.out.println("pr.ManageSubClasses.a = " + ManageSubClasses.a);
        System.out.println("altSinif1.a = "+ altSinif.a);
        altSinif.a = 123123;
        System.out.println("pr.ManageSubClasses.a = "+ altSinif.a);
        AltSinif1 altSinif1 = new AltSinif1();
        altSinif1.a=333;
        System.out.println(altSinif1.a);
        System.out.println(UstSinif.a);
        UstSinif.a =23;
        System.out.println(UstSinif.a);
        AltSinif1 altSinif11 = new AltSinif1();
        System.out.println(altSinif11.a);
        System.out.println("-------");
        UstSinif2 sinif = new UstSinif2();
        sinif.statikNumber = 23333;
        AltSinif21 altSinif21 = new AltSinif21();
        System.out.println("altSinif21.statikNumber = "+sinif.statikNumber);//23333
        altSinif21.statikNumber = 22;
        AltSinif22 altSinif22 = new AltSinif22();
        System.out.println("pr.UstSinif2.statikNumber = "+UstSinif2.statikNumber);//22
        //Overload pratik
        System.out.println("altSinif21.toplaU2Mothod(1,2,4.2) = "+altSinif21.toplaU2Mothod(1,2,4.2));
        System.out.println("altSinif21.toplaU2Mothod(3,4) = "+altSinif21.toplaU2Mothod(3,4));
        System.out.println("altSinif21.toplaU2Mothod(3,3,1.1,5) = "+altSinif21.toplaU2Mothod(3,3,1.1,5));
    }
}