package MethodOlusturma;

public class Arrays {



    public static void main(String[] args) {

        //Aşağıdakilerden hangisi yanlıştır?
               // A) public static void main(String[] args) {

            String str = "Cok calis, mutevazi ol";
            String strArray[] = str.split(",");
           System.out.println(Arrays.toString(strArray));

        //Output [Cok calis, mutevazi ol]
       // B) public static void main(String[] args) {
            //String str = "Cok calis, mutevazi ol";
           // String strArray[] = str.split(" "); // cift tirnak içinde space var
          //  System.out.println(Arrays.toString(strArray));

       // Output [Cok, calis,, mutevazi, ol]
        //C) public static void main(String[] args) {
           // String str = "Cok calis, mutevazi ol";
           // String strArray[] = str.split("X");
           // System.out.println(Arrays.toString(strArray));

        //Output [Cok calis, mutevazi ol]



        return;

    }

    private static boolean toString(String[] strArray) {
        return false;
    }


}
