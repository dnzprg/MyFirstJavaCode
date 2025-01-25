public class VeriTipleri {
    public static void main(String[] args) {
         byte myByte =50;
         short myShort = 25000;
         int myInt = 150;
         long myLong = 10000000;
         float myFloat = 58.44f;
         double myDouble = 56.55;
         char myChar = '8' ;
         boolean myBoolean = true;

         int veriGenisletme = myByte;
        System.out.println(veriGenisletme);

        int veriDaraltma = (int) myDouble;
        System.out.println(veriDaraltma);

        int floatDaraltma = (int) myFloat;
        System.out.println(floatDaraltma);



    }
}
