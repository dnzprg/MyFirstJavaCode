public class İlkString {
    public static void main(String[] args) {
        String ilkMetin = "Test Otomasyonu";
        String ikinciMetin = "Yazılım Test Uzmanı";
        System.out.println(ilkMetin);
        System.out.println(ikinciMetin);


        int metinUzunlugu = ilkMetin.length();
        System.out.println(metinUzunlugu);

        String kucukHarf = ilkMetin.toLowerCase();
        System.out.println(kucukHarf);

        String buyukHarf = ikinciMetin.toUpperCase();
        System.out.println(buyukHarf);

        System.out.println(kucukHarf + buyukHarf);
        System.out.println(kucukHarf + buyukHarf + metinUzunlugu);

        String yeniString = "En sevdigim \"film\" Matrix";
        System.out.println(yeniString);
    }
}