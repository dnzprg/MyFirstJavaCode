public class TryCatchDemo {
    public static void main(String[] args) {

        int [] sayilar = {1, 5, 10, 545, 678};

        try{
            System.out.println(sayilar[5]);
        }catch(Exception e){
            e.printStackTrace();

        }

        System.out.println("Hata sonrasi konsola yazdir.");
    }
}
