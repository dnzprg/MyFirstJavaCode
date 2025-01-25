public class SwitchCaseDemo {
    public static void main(String[] args) {

//        int sayi = 3;

//        if (sayi == 1) {
//            System.out.println("Verilen sayi 1 e eşittir.");
//        } else if (sayi == 2) {
//            System.out.println("Verilen sayi 2 ye eşittir.");
//        } else {
//            System.out.println("Sayi 1 e veya 2 ye eşit degildir.");
//      }
        int sayi =2;

        switch (sayi) {
            case 1:
                System.out.println("Verilen sayi 1 e eşittir.");
                break;
            case 2:
                System.out.println("Verilen sayi 2 ye eşittir.");
                break;
            default:
                System.out.println("Sayi 1 e yada 2 ye eşit değildir.");
        }
    }
}
