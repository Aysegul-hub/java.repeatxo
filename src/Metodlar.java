public class Metodlar {

    public static void main(String[] args) {

        //YENİ KONU 04-Metodlar
        // Metodları aynı şeyi yazdığımız kodda kolayca güncelleyebilmek için yazarız.
        //Metod yazıp çağırmak her zaman daha temizdir karışıklığı önler.


        mesajVer("Ayşegül");
        mesajVer("Defne");
        mesajVer("Emir Ali");
        mesajVer("Deren");
        mesajVer("Mert Ege");
        mesajVer("Derin");
        mesajVer("Kutay");
        mesajVer("Murat");


        topla(6,3);

        hesapla();

        System.out.println(topla(6,3)); // çünkü return edince ekrana yazdır demiş olmuyoruz böyle belirtmek gerekir void olsa direkt çağırabiliriz.

       toplanIkiSayınınYüzdeOnu(10,90);

    }

    //bir fonksiyon yani bir metod sadece bir işlemi yapmalı yoksa green kod olmaz temiz kod olmaz.


    public static void mesajVer(String isim){
        System.out.println("Merhaba! " + isim);
    }

    public static void hesapla(){
        System.out.println("Hesaplandı.");
    }

    public static int topla(int sayi1 , int sayi2) { // içine yazdıklarımız parametrelerdir.
        int toplam = sayi1+sayi2;
        return toplam; // bu fonksiyonu başka bir metotta kullanacağımız için void değil int yaptık çünkü int döndürücez ve sys outu silip return yaptık bize değeri döndürebilsin diye.
        //return olanlar bir hesaplamanın sonucudur genelde.
    }

    // toplanan iki sayının % 10 unu bul
    public static void toplanIkiSayınınYüzdeOnu(int sayi1 , int sayi2) { // içine yazdıklarımız parametrelerdir.
        int toplam = topla(sayi1,sayi2);
        double sonuç = toplam * 10/100;
        System.out.println("Toplam : " + sonuç);
    }




















    //DRY - Do not Repeat Yourself
}
