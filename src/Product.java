 class Product { //classımız bu adı Product
   private String name ;
   private String decription;
   private double price;

   public String getName() {
       return name;
   }
    public void setName(String name){ //Kurallar gereği başta Stringi name olarak tanımladığımız için içerisi name oldu ve name = name durumuna geldi bloğun i.i o zaman başına this. koyarak ürünümüzü işaret ettik.
      this.name = name;
    }


    /* Main içine bunlar yazılmalı bu class için :

     public static void main(String[] args) { //YENİ KONU 07 - Classlar ve bir özellikleri de operasyon tutuyor olmalarıdır
        int[] sayilar = new int[]{1,2,3,};


        Product product1 = new Product();
        product1.setName("Laptop");

        Product product2 = new Product();
        product2.setName("Mouse");


                                         //new Product() , new Product()
        Product[] urunler = new Product[]{ product1 , product2 }; //üstteki int arrayle tamamen aynı , ürün dizisinin içinde iki tane ürün mevcut.

        for(int i=0; i< urunler.length;i++){  //length dediği arrayin uzunluğunu verir ve 2 ürün olduğu için 2 dir ama dahil değil 0,1 indexlerini döndürecek.
            System.out.println(urunler[i].getName()); // Laptop ve Mouse yi alt alta yazdırır.
        }

    }
     */





}
