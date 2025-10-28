public class Main {

    public static void main(String[] args) {
        CreditManager  credit = new CreditManager();
        credit.add();
        credit.calculate();

        MortgageManager mg = new MortgageManager();
        mg.add();

        CreditManager[] credits = new CreditManager[2]; // 2 elemanlı bir array oluşturduk.
        credits[0] = new MortgageManager(); //CreditManager inheritence görevi gördü kalıtım yani VehicleManager ve MortgageManager a tıpkı ebeveyni gibi bunlar reference type olduğu için birbirlerini tutarlar.
        credits[1] = new VehicleManager();

        for(int i = 0 ; i<credits.length;i++){ //burası polimorphism , kendi referansını değil 0. index için mortgageyi hesapladı sonra 1. indexli eleman için vehicle ı hesapladı bir konut bir araç kredisi hesapladı.CreditManager kafanızı karıştırmasın onun yeni bağlı oldukları new MortgagaManager ve new VehicleManager dır.
            credits[i].calculate();
        }
        //Bunun çıktısı Mortgage Kredi hesaplandı.
        //Bunun çıktısı Vehicle Kredi hesaplandı.

        //Bu bize neyi sağladı : Diyelim ki yarın yepyeni bir ürün geldi kredi ürünü kolayca ekleyebiliriz kodun okunabilirliği için çok önemli.

        /*SOLID nedir ? :
        OOP ilkelerini daha temiz, esnek ve bakımlı kolay hale getirmek için kullanılan 5 temel yazılım
        prensibinin baş harfleridir.

        S : Single Responsibility Prenciple , Tek Sorumluluk İlkesi
        O : Open/Closed Principle , Açık/Kapalı İlkesi
        L : Liskov Substitution Principle , Liskov'un Yerine Geçme İlkesi
        I : Interface Segregation Principle , Arayüz Ayrımı İlkesi
        D : Dependency Inversion Principle , Bağımlılığın Tersine Çevrilmesi İlkesi
         */




    }
}
