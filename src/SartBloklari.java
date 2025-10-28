public class SartBloklari {

    public static void main(String[] args) { //PascalCase ile yazılır classlar

        //YENİ KONU 01 - Şart blokları (If-else if -else)

        //Şart blokları uygulamalrı dallandırmak için kullanılan yapılardır. Bunlar if while switch case gibi şeylerdir.

        int puan = 55;
        //50 ve üzeri : geçti
        //40-49 : bütünleme
        //0-39 : kaldı

        if (puan >= 50) { //parantez içi booelandır true veya false döndürecek
            System.out.println("Geçti");

        } else if (puan >= 40 && puan < 50) { //&& "ve" operatörü ikisinin de doğru olması lazım.
            System.out.println("Bütünleme");

        } else if (puan >= 0 && puan < 40) {
            System.out.println("Kaldı");

        } else {
            System.out.println("Geçersiz değer girdiniz");

        }
    }
}
