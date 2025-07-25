import java.util.Scanner;

/*public class switchcase {
    public static void main(String[] args) {
      /* Scanner scanner = new Scanner(System.in);
        System.out.println("1,2 və ya 3 rəqəmindən birini daxil edin: ");
        int reqem = scanner.nextInt();

        switch (reqem){
            case 1:
                System.out.println("Rəng: Qırmızı");
                break;
            case 2:
                System.out.println("Rəng: Yaşıl");
                break;
            case 3:
                System.out.println("Rəng: Mavi");
                break;
            default:
                System.out.println("Doğru rəqəm daxil edin");
        } */



       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Rəqəm daxil edin: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Avtomobil növü: Sedan");
                break;
            case 2:
                System.out.println("Avtomobil növü: SUV");
                break;
            case 3:
                System.out.println("Avtomobil növü: Sport");
                break;
            case 4:
                System.out.println("Avtomobil növü: Elektrikli");
                break;

            default:
                System.out.println("Düzgün rəqəm daxil edin.");
        } */



        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Məhsulun kodunu daxil edin (A, B və ya C): ");
        String kod = scanner.next().toUpperCase();

        switch (kod){
            case "A":
                System.out.println("Su - 1.50 AZN");
                break;
            case "B":
                System.out.println("Çörək - 1 AZN");
                break;
            case "C":
                System.out.println("Süd - 2 AZN");
                break;
            default:
                System.out.println("Düzgün kodu daxil edin.");
        }
        scanner.close(); */



       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ayın nömrəsini daxil edin (1-12): ");
        int nomre = scanner.nextInt();

        switch (nomre){
            case 3: case 4: case 5:
                System.out.println("Fəsil: Yaz");
                break;
            case 6: case 7: case 8:
                System.out.println("Fəsil: Yay");
                break;
            case 9: case 10: case 11:
                System.out.println("Fəsil: Payız");
                break;
            case 12: case 1: case 2:
                System.out.println("Fəsil: Qış");
                break;
            default:
                System.out.println("Düzgün nömrə daxil edin.");

        } */



       /* Scanner scanner = new Scanner(System.in);
        System.out.println("İmtahan qiymətini daxil edin (A, B, C, D, F)");
        String point = scanner.nextLine().toUpperCase();

        switch (point){
            case "A":
                System.out.println("Əla");
                break;
            case "B":
                System.out.println("Çox yaxşı");
                break;
            case "C":
                System.out.println("Yaxşı");
                break;
            case "D":
                System.out.println("Qənaətbəxş");
                break;
            case "F":
                System.out.println("Kafi deyil");
                break;
            default:
                System.out.println("Yanlış imtahan qiyməti daxil edildi.");
        }
        scanner.close();  */




      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Seçiminizi daxil edin(1, 2, 3, 4)");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Balansa bax");
                break;
            case 2:
                System.out.println("Pul çıxar");
                break;
            case 3:
                System.out.println("Pul yatır");
                break;
            case 4:
                System.out.println("Kartı çıxar");
                break;
            default:
                System.out.println("Yanlış seçim");
        }
scanner.close(); */

  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Dil seçimi edin (AZ, EN, TR,)");
        String language = scanner.nextLine().toUpperCase();

        switch (language) {
            case "AZ":
                System.out.println("Salam");
                break;
            case "EN":
                System.out.println("Hello");
                break;
            case "TR":
                System.out.println("Merhaba");
            default:
                System.out.println("Tanımadım");
        } */



/*Scanner scanner = new Scanner(System.in);
System.out.println("İdman kodunu daxil edin: ");
String sport = scanner.nextLine().toUpperCase();

switch (sport){
    case "F":
        System.out.println("Futbol");
        break;
    case "B":
        System.out.println("Basketbol");
        break;
    case "V":
        System.out.println("Voleybol");
        break;
    case "T":
        System.out.println("Tennis");
    default:
        System.out.println("Düzgün idman kodu daxil edin.");
} */


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin: ");
        double a = scanner.nextDouble();

        System.out.println("İkinci ədədi daxil edin: ");
        double b = scanner.nextDouble();

        System.out.println("Operatoru daxil edin (+, -, *, /, %): ");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("Nəticə: " + (a + b));
                break;
            case "-":
                System.out.println("Nəticə: " + (a - b));
                break;
            case "*":
                System.out.println("Nəticə: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Sıfıra bölmək olmaz!");
                } else {
                    System.out.println("Nəticə: " + (a / b));
                }
                break;
            case "%":
                if (b == 0) {
                    System.out.println("Sıfıra bölmək olmaz!");
                } else {
                    System.out.println("Nəticə: " + (a % b));
                }
                break;
            default:
                System.out.println("Yanlış operator daxil edilib.");
        } */




       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Fakültə kodunu daxil edin (IT, M, H, BT): ");
        String kod = scanner.next().toUpperCase();

        switch (kod) {
            case "IT":
                System.out.println("İnformasiya Texnologiyaları – Proqramlaşdırma və sistemlər");
                break;
            case "M":
                System.out.println("Maliyyə – Bank işi, mühasibatlıq");
                break;
            case "H":
                System.out.println("Hüquq – Hüquqi tənzimləmə");
                break;
            case "BT":
                System.out.println("Biznes və Ticarət – Marketinq, idarəetmə");
                break;
            default:
                System.out.println("Naməlum fakültə – Tanınmayan kod");

        }
scanner.close(); */




    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();

        if (age >=18){
            System.out.println("Yetkin");
        }else{
            System.out.println("Uşaq");
        } */




      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Tam ədəd daxil edin: ");
        int number = scanner.nextInt();

        if (number % 2==0){
            System.out.println("Cütdür.");
        }else {
            System.out.println("Təkdir");
        }  */



      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("İmtahan balınızı daxil edin (0-100): ");
        int bal = scanner.nextInt();

        if (bal >= 0 && bal <= 100) {
            if (bal >= 50) {
                System.out.println("Keçdi");
            } else {
                System.out.println("Kəsildi");
            }
        } else {
            System.out.println("0-100 aralığında bal daxil edin.");
        }   */




     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("1-ci ədədi daxil edin: ");
        int a = scanner.nextInt();

        System.out.println("2-ci ədədi daxil edin: ");
        int b = scanner.nextInt();

        System.out.println("3-cü ədədi daxil edin: ");
        int c = scanner.nextInt();

        int max = (a > b)
                ? ((a > c)? a : c)
                : ((a > b)? b : c);

        System.out.println("Ən böyük ədəd: " + max); */




  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("İmtahan balını daxil edin: ");
        int bal = scanner.nextInt();

        if (bal >= 90 && bal <= 100) {
            System.out.println("Əla");
        } else if (bal >= 80 && bal <90) {
            System.out.println("Çox yaxşı");
        } else if (bal >= 70 && bal <80) {
            System.out.println("Yaxşı");
        } else if (bal >= 60 && bal <70) {
            System.out.println("Qənaətbəxş");
        } else if (bal >= 0 && bal <60) {
            System.out.println("Kafi deyil");
        } else {
            System.out.println("Yanlış bal daxil edilib.");
        }

    }
} */