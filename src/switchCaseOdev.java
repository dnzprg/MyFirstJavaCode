public class switchCaseOdev {
    // Haftanın 7 günü vardır.
    // Her gün için "Bugün günlerden -verilen gün- " konsola yazdır
    public static void main(String[] args) {

        int haftaninGunu = 7;

        switch (haftaninGunu) {
            case 1 -> System.out.println("Bugün günlerden Pazartesi");
            case 2 -> System.out.println("Bugün günlerden Salı");
            case 3 -> System.out.println("Bugün günlerden Çarşamba");
            case 4 -> System.out.println("Bugün günlerden Perşembe");
            case 5 -> System.out.println("Bugün günlerden Cuma");
            case 6 -> System.out.println("Bugün günlerden Cumartesi");
            case 7 -> System.out.println("Bugün günlerden Pazar");
        }
    }
}
