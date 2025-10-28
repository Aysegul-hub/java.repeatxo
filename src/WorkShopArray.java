public class WorkShopArray {

    public static void main(String[] args) { //ÖRNEK
        int[] sayilar = new int[] { 1,2,5,7,9,0};
        int aranacak = 7;

        boolean varMi = sayiBul(sayilar,aranacak); //true.
        //true,9
        mesajVer(varMi , aranacak);


    }
    public static boolean sayiBul(int[] sayilar , int aranacak){
        boolean varMi = false;

        for (int sayi : sayilar){ //sayılardaki her sayıyı dolaş.
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        return varMi;
    }

    public static void mesajVer(boolean varMi , int aranacak){
        String mesaj = "";
        if ( varMi == true){
            mesaj = "Sayı mevcuttur : " + aranacak;
            System.out.println(mesaj);

        }else{
            mesaj ="Sayı mevcut değildir : " + aranacak ;
            System.out.println(mesaj);

        }
    }
}
