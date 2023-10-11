import com.sun.source.doctree.SinceTree;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Araba hbAraba1 = new Hatchbag("C","Model1",0,1000000,4);
        System.out.println("--hbAraba1--");
        hbAraba1.arabayiSur(1000);
        hbAraba1.setFiyat(900000);
        System.out.println("Güncel fiyat :"+hbAraba1.getFiyat());
        Araba sedanAraba1 = new Hatchbag("D","Model2",0,2000000,4);
        System.out.println("--sedanAraba1--");
        sedanAraba1.arabayiSur(100);
        sedanAraba1.arabayiSur(300);
        sedanAraba1.setFiyat(1800000);
        System.out.println("Güncel fiyat :"+sedanAraba1.getFiyat());
        //Adi Soyadi Dersi Notu
        HashMap<String,String> ogrMap = new HashMap<>();
        ogrMap.put("Adı","Hüseyin");
        ogrMap.put("Soyadı","Akcan");
        ogrMap.put("Ders","Matematik");
        ogrMap.put("Notu","90");
        HashMap<String,String> ogr2Map = new HashMap<>();
        ogr2Map.put("Adı","Software");
        ogr2Map.put("Soyadı","Akcan");
        ogr2Map.put("Ders","Matematik");
        ogr2Map.put("Notu","100");
        HashMap<String,String> ogr3Map = new HashMap<>();
        ogr3Map.put("Adı","Network");
        ogr3Map.put("Soyadı","Yılmaz");
        ogr3Map.put("Ders","Fizik");
        ogr3Map.put("Notu","100");
        ArrayList<HashMap<String,String>> ogrList = new ArrayList<>();
        ogrList.add(ogrMap);
        ogrList.add(ogr2Map);
        ogrList.add(ogr3Map);
        for (HashMap<String, String> arrayList:ogrList){
            System.out.println(arrayList);
        }
    }
}
