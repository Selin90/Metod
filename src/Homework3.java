import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Parolu daxil edin");
        String parol = input.nextLine();

        if (parol.equals("admin123")) {
            System.out.println("Giriş uğurlu");
        } else {
            System.out.println("Səhv parol");
        }}*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Balınızı daxil edin (0-100)");
        int bal = scanner.nextInt();

        if (bal >=90 && bal <=100) {
            System.out.println("Ela");
        } else if (bal >= 80 && bal<89) {
            System.out.println("Yaxshi");
        } else if (bal >= 70 && bal <=79) {
            System.out.println("Kafi");
        } else if (bal >=60 && bal <=69) {
            System.out.println("Zeif");
        } else if (bal >=0 && bal <=59) {
            System.out.println("Qeyri-kafi");
        } else
            System.out.println("Neticeni duzgun daxil edin"); */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Alış-veriş məbləğini daxil edin");
        int mebleg = scanner.nextInt();
        System.out.println("Vip müştərisinizmi? (True/False)");
        boolean isVip = scanner.nextBoolean();

        double endirimFaizi = 0;

        if (isVip) {
            endirimFaizi = 20;
        } else {
            if (mebleg >= 200) {
                endirimFaizi = 10;
            } else if (mebleg >= 100) {
                endirimFaizi = 5;
            } else {
                endirimFaizi = 0;
            }
        }
        double endirimMəbləği = mebleg * endirimFaizi / 100;
        double yekunMəbləğ = mebleg - endirimMəbləği;

        System.out.println("Endirim faizi: " + endirimFaizi + "%");
        System.out.println("Endirim məbləği: " + endirimMəbləği + " AZN");
        System.out.println("Yekun ödəniləcək məbləğ: " + yekunMəbləğ + " AZN");
    }*/



        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Elektrik miqdarı: ");
        int kVt = scanner.nextInt();

        double tarif = 0;

        if (kVt <= 100) {
            tarif = kVt * 0.10;
        } else if (kVt <300) {
            tarif = 100 * 0.10 + (kVt-100) * 0.15;
        }else
            tarif = 100 * 0.10 + 200 * 0.15 + (kVt - 300) * 0.20 ;
        System.out.println("Ümumi ödəniş: " + tarif + "AZN");
    } */



       /* Scanner scanner = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Fiqur növünü seçin:");
        System.out.println("1: Kvadrat");
        System.out.println("2: Düzbucaqlı");
        System.out.println("3: Dairə");
        System.out.print("Seçiminizi daxil edin: ");
        int secim = scanner.nextInt();

        if (secim == 1) {
            System.out.print("Kvadratın tərəfini daxil edin: ");
            double teref = scanner.nextDouble();
            double kvadratSahe = teref * teref;
            System.out.println("Kvadratın sahəsi: " + kvadratSahe);
        }

        if (secim == 2) {
            System.out.print("Uzunluğu daxil edin: ");
            double uzunluq = scanner.nextDouble();
            System.out.print("Eni daxil edin: ");
            double en = scanner.nextDouble();
            double duzbucaqSahe = uzunluq * en;
            System.out.println("Düzbucaqlının sahəsi: " + duzbucaqSahe);
        }

        if (secim == 3) {
            System.out.print("Dairənin radiusunu daxil edin: ");
            double radius = scanner.nextDouble();
            double dairəSahe = pi * radius * radius;
            System.out.println("Dairənin sahəsi: " + dairəSahe);
        } */




       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşıvızı daxil edin: ");
        int yas = scanner.nextInt();

        System.out.println("Aylıq gəlirivizi daxil edin: ");
        double gelir = scanner.nextDouble();

        System.out.println("İş təcrübəsini daxil edin: ");
        int tecrube = scanner.nextInt();

        System.out.println("Kredit reytinqivizi daxil edin: ");
        int reyting = scanner.nextInt();

        boolean kredit = (yas >=21 && yas <=65 && gelir >= 1000 && tecrube >=2 && reyting >=600);

        if (kredit){
            double kreditMeblegi = gelir * 36;
            System.out.println("Sizin kredit " + kreditMeblegi);
        } else {
            System.out.println("Size kredit dusmur");
        } */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Sizde hal tecilidir? (Beli/Xeyr)");
        String vezyet =  scanner.next();
        boolean hal = vezyet.equalsIgnoreCase("Beli");

        if(hal){
            System.out.println("derhal qebul olunsun");
        }else {
            System.out.println("Yasivizi daxil edin:");
            int age = scanner.nextInt();
            System.out.println("Hamilesiz (Beli/Xeyr):");
            String pregnantAnswer = scanner.next();
            boolean pregnant = pregnantAnswer.equalsIgnoreCase("Beli");
            if (pregnant){
                System.out.println("qebul saati 1 saat");
            } else if (age >= 65) {
                System.out.println("qebul saati 2 saat");
            } else if (age < 16) {
                System.out.println("qebul saati 3 saat");
            } else {
                System.out.println("qebul saati 5 saat");

            }


        } */


        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Qələbə faizini daxil edin (%): ");
        int qalebeFaizi = scanner.nextInt();

        System.out.print("Ortalama xalı daxil edin: ");
        double ortalamaXal = scanner.nextDouble();

        if (qalebeFaizi >= 70 && ortalamaXal >= 85) {
            System.out.println("Reytinq: Peşəkar");
        } else if (qalebeFaizi >= 50 && ortalamaXal >= 70) {
            System.out.println("Reytinq: Mütəxəssis");
        } else if (qalebeFaizi >= 30) {
            System.out.println("Reytinq: Orta");
        } else {
            System.out.println("Reytinq: Başlayan");
        }
*/



     /*   Scanner scanner = new Scanner(System.in);

        double bazaQiymet = 500;
        double yekunQiymet = bazaQiymet;

        System.out.print("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();
        if (yas < 25) {
            yekunQiymet += bazaQiymet * 0.30;
        } else if (yas > 60) {
            yekunQiymet += bazaQiymet * 0.20;
        }

        System.out.print("Sürücülük təcrübəniz: ");
        int tecrube = scanner.nextInt();
        if (tecrube < 3) {
            yekunQiymet += bazaQiymet * 0.25;
        }

        scanner.nextLine();
        System.out.print("Erazi (şəhər/kənd): ");
        String erazi = scanner.nextLine().toLowerCase();
        if (erazi.equals("şəhər")) {
            yekunQiymet += bazaQiymet * 0.15;
        } else if (erazi.equals("kənd")) {
            yekunQiymet -= bazaQiymet * 0.10;
        }

        System.out.print("Əvvəllər qəza etmisiniz? (bəli/xeyr): ");
        String qeza = scanner.nextLine().toLowerCase();
        if (qeza.equals("bəli")) {
            yekunQiymet += bazaQiymet * 0.40;
        }
        System.out.print("Premium paket istəyirsiniz? (bəli/xeyr): ");
        String premium = scanner.nextLine().toLowerCase();
        if (premium.equals("bəli")) {
            yekunQiymet += bazaQiymet * 0.05;
        }

        System.out.println("Yekun sığorta məbləği: " + yekunQiymet + " AZN");
    }
} */
    }
}