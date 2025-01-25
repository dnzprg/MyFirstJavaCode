public class OperatorlerOdev {
    // İki adet integer, 85 ve 45
    // Konsola değişkenleri kullanarak iki ayrı satırda sayilarin toplamini ve çarpımını yazdırın.
    // Örnek: "Sayiların toplamı 130 dur"
    // Eğer sayıların çarpımı 3000 den büyük ve 4000den küçükse, konsola sayıların çarpım değerini yazınız.

    public static void main(String[] args) {
        int a = 85;
        int b = 45;

        int toplam = a+b;
        int carpim = a*b;

        System.out.println("Sayilarin toplami " + toplam + " değerindedir.");
        System.out.println("Sayilarin çarpimi " + toplam + " değerindedir.");

        if (carpim > 3000 && carpim < 4000){
            System.out.println("Carpim degeri " + carpim);
        }
    }
}
