public class MethodParametreDemo {
    public static void main(String[] args) {

        konsolCiktisi( "Ata");
        konsolCiktisi("Egemen");
        toplamaIslemi(5,10);
        toplamaIslemi(100,256);
        sinavNotlari( "Alperen" , 100);

        System.out.println("--------------------");
        int carpmaSonucu = carpma(5,9);
        System.out.println(carpmaSonucu);

        System.out.println("-----------------");
        System.out.println(carpma(10,3));
        System.out.println(carpma(8, 9));
        System.out.println(toplamaIslemi(36,67,85));


    }
    private static void konsolCiktisi (String isim) {
        System.out.println("Merhaba Dünya!" + " ve merhaba " + isim);
    }

    private static int toplamaIslemi(int a, int b){
        return a+b;
    }
    private static int toplamaIslemi(int a, int b, int c) {
        return a + b + c;
    }
    // Konsola kisinin adini ve sinav notunu yazdiran bir method olusturun.
    // Method 2 adet parametre alsin, ad ve sinav notu

    private static void sinavNotlari(String ad, int not) {
        System.out.println(ad + " isimli ögrencinin Notu " + not);
    }

    private static int carpma(int a, int b){
        int carpmaSonucu = a*b;
        return carpmaSonucu;
    }
}
