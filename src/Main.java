import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafenizi giriniz");
        km = input.nextInt();

        System.out.println("Yaşınızı giriniz");
        yas = input.nextInt();

        if (km<0) {
            System.out.println("hatalı veri girdiniz");
        } else {
            System.out.println("işleme devam");

            double NormalTutar = km * 0.10;
            double yasindirimi;

            if (yas < 13) {
                yasindirimi = NormalTutar * 0.50;
                System.out.println("yaş indirimi : " + yasindirimi);
            } else if (12 < yas && yas < 25) {
                yasindirimi = NormalTutar * 0.10;
                System.out.println("yaş indirimi : " + yasindirimi);
            } else if (24 < yas && yas < 66) {
                yasindirimi = 0;
                System.out.println("yaş indirimi yok : " + yasindirimi);
            } else {
                yasindirimi = NormalTutar * 0.30;
                System.out.println("yaş indirimi : " + yasindirimi);
            }

            double indirimliTutar = NormalTutar - yasindirimi;
            System.out.println("indirim tutarı : " + indirimliTutar);


            int selecect = 0;

            System.out.println("1-gidis\n2-gidisdonus");
            System.out.println("Seçiniz:");
            selecect = input.nextInt();

            if (selecect == 1) {
                System.out.println("ek indirim uygulanmayacaktır");

                System.out.println("toplam tutar: " + indirimliTutar);
            } else if (selecect == 2){
                System.out.println("ek indirim uygulanmıştır");
                double gidisdonusindirimtutarı = indirimliTutar * 0.20;
                double toplamtutar = (indirimliTutar - gidisdonusindirimtutarı) * 2;
                System.out.println("toplam tutar: " + toplamtutar);
            } else
                System.out.println("hatalı veri girdiniz");


        }
    }
}