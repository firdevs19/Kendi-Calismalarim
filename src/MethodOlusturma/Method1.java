package MethodOlusturma;

public class Method1 {

    static String tarih = "19 Mayis 2021";
    String host ="Firdevs Okur";


    public static void main(String[] args) {

        //deneme();
        deneme(3);
        Method1 obj = new Method1();
        //obj.deneme("Firdevs");






    }

    public static void deneme(){
        Method1 obj = new Method1();

        System.out.println("Deneme metodu calisti.\nBugunun tarihi : " + tarih );



        System.out.println("Sitenin sahibi : " + obj.host );
    }

    public static void deneme(int sayi){

        Method1 obj = new Method1();


        System.out.println("Parametreli deneme methodu calisti. \n"
                + "Girilen sayi : " + sayi);

        System.out.println("Sitenin sahibi : " + obj.host );


    }

    public  void deneme(String isim){

        System.out.println("String parametreli method calisti. \nBugunun tarihi : " + tarih + "\nMerhaba : " + isim);


        System.out.println("Sitenin sahibi : " + host );

    }

}
