public class Donguler {

    public static void main(String[] args) { //Döngüler birbirine benzeyen işlemleri defalarca yapabiliriz
        //örneğin 1 den 100 e kadar saymak istiyoruz bunu döngülerle yaparız.

        //YENİ KONU 03 - Döngüler ( for, while, do-while)

        //FOR DONGUSU:

        for (int i = 1; i<=10; i+=2){ // i diye tanımladık ama siz başka bir şey de yazabilirsiniz , önce tanımlıyoruz i yani index demek onu int diye sonra kaça kadar olacağını belirtip arttırıp ya da azaltıyoruz.
            System.out.println(i); // çıktısı 1 den 10 a kadar 2 şer arttırarak alt alta yazdırılacak, i = i+1 de i++ ya eşittir! ya da i+=2 mesela.

        }

        int sayi = 10;

        //WHILE DONGUSU:

        while ( sayi <= 100){ //while içine sadece koşul yazılır arttırma azaltma yapılmaz ve çalıştırılırsa sonsuz döngüye girer.
            System.out.println(sayi);
            sayi = sayi+10; // sayıyı 10 ar arttıracak.

        }

        //DO-WHILE DONGUSU:

        int sayi2= 11; //do-while 1 kere bile olsa çalıştırır şart geçersizken dahi. 11 i yazdıracak.
        do{
            System.out.println(sayi2);
            sayi = sayi + 10;

        }while(sayi2>100);



        //ORNEK YAPALIM:

        String urun = "Laptop";
        for(int index = 0; index<10; index++){ // 10 kere yazdırır
            System.out.println(urun + index); //Laptop1,Laptop2,...
        }











    }
}
