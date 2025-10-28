
public class ArrayList {

    public static void main(String[] args) { //YENİ KONU 06 - ArrayList

        String[] sehirler1 = new String[] { "Ankara","İstanbul","İzmir"};
        String[] sehirler2 = new String[] { "Antalya","Aydın","Marmaris"};

        sehirler1 = sehirler2;
        sehirler1[0] = "Adana";
        System.out.println(sehirler2[0]); //Adana döndürecek çünkü staktaki S1 in kendi heapteki eşiyle bağlantısı kopuyo ve S2 nin heapteki eşiyle bağlanıyor ve ikisi de aynı şeyi ifade ediyor.
        //bu yüzden S1 deki adana güncellemesi s2 nin de bağlı olduğu (heapteki yer) arreyin içini güncelliyor.


        sehirler1 = new String[4];
        sehirler1[3] = "Bursa";
        System.out.println(sehirler1[3]); // 1 yazsaydık istanbul dönmeyecekti çünkü new String[4] diyince heapte yeni bir alan açtık 4 karelik 3 indexlik ve içleri null değerinde çünkü önceki gibi süslü parantez içinde atamadık değerleri ve 3 e Bursayı atadık diğerleri null kaldı heapteki önceki yerle bağlantı koptu.


        //Ornek gösterim:
        int sayi1 = 100;
        int sayi2 = 99;
        sayi1 = sayi2;
        sayi2 = 110;
        System.out.println(sayi1); // sayi1 sayi2 ye eşitledikten sonra orda bağlantıları kopuyo bu iki sayının ve ondan sonra sayi2 yi ne kadar değiştirirsek değiştirelim o baştaki eşitliği koruyor sayi1.
        // sonuç 99 olacak





    }
    //Value types : boolean , int, double ...
    //Reference types : array,class,abstract class,interface
}
