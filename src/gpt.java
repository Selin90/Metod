import java.util.Scanner;

public class gpt {
    public static void main(String[] args) {
     /*   //1. İstifadəçidən adını daxil etməsini istəyin və onu salamlayın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı daxil edin: ");
        String name = scanner.nextLine();
        System.out.println("Salam, " + name + "!");
    } */

        //2. İstifadəçidən yaşını daxil etməsini istəyin və doğum ilini hesablayın.
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();

        int currentYear = 2025;
        int birthDate = (currentYear - age);
        System.out.println("Doğum ili: " + birthDate);} */

        //3.İki tam ədəd daxil etdirin və onların cəmini hesablayın
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci tam ədədi daxil edin: ");
        int eded1 = scanner.nextInt();

        System.out.println("Ikinci tam ədədi daxil edin: ");
        int eded2 = scanner.nextInt();

        int total = (eded1 + eded2);
        System.out.println("Ədədlərin cəmi: " + total);} */

        //4.Boy (metr) və çəki (kq) daxil etdirin və BMI-ni hesablayın
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Boy: ");
        double boy = scanner.nextDouble();

        System.out.println("Çəki: ");
        double çəki = scanner.nextDouble();

        double total = (boy + çəki);
        System.out.println("BMI: " + total);} */


        //5.Əmək haqqını və vergi faizini daxil etdirin, təmiz maaşı hesablayın
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Əmək haqqı: ");
        double grossSalary = scanner.nextDouble();

        System.out.println("Vergi faizi: ");
        double taxRate = scanner.nextDouble();

        double netSalary = grossSalary - (grossSalary * taxRate / 100);
        System.out.println("Net salary: " + netSalary);}*/


        //6.İki ədəd daxil etdirin və fərqini tapın.
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin: ");
        int number = scanner.nextInt();

        System.out.println("Ikinci ədədi daxil edin: ");
        int number2 = scanner.nextInt();

        int total = (number - number2);
        System.out.println("Cavab; " + total); */


        //7.İstifadəçidən bir ədəd alıb onun kvadratını hesablayın
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ədəd: ");
        int number = scanner.nextInt();
        int square = number * number;

        System.out.println("Daxil etdiyiniz ədədin kvadratı: " + square);*/


        //8.E-mail daxil etdirin və @ simvolunun olub-olmadığını yoxlayın
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("E-mail daxil edin: ");
        String email = scanner.nextLine();

        System.out.println(email.contains("@"));*/


        //9.Tələbə adı və qiymətini daxil etdirin və keçib-keçmədiyini müəyyən edin.
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Tələbə adı: ");
        String name = scanner.nextLine();

        System.out.println("Qiymət: ");
        int point = scanner.nextInt();

        boolean passed = point >50;

        System.out.println("Imtahandan keçib " + passed); */


        //10.Daxil olunan ədədin tək yoxsa cüt olduğunu göstərin
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ədəd: ");
        int number = scanner.nextInt();
        System.out.println((number%2));*/


        //11. Sürət və vaxt daxil etdirin, məsafəni hesablayın
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Sürət (km/saat): ");
        double speed = scanner.nextDouble();

        System.out.println("Vaxt (saat)");
        double time = scanner.nextDouble();

        double distance = speed*time;

        System.out.println("Məsafə: " + distance + "km");*/


        //12.İstifadəçidən ailə vəziyyəti haqqında məlumat alın (true/false)
       /*Scanner scanner = new Scanner(System.in);
        System.out.println("Subaysınız?: (true/false)");
        boolean isSingle = scanner.nextBoolean();
        System.out.println("Məlumat: ");
        System.out.println("Subay: " + isSingle); */


        //13.Temperatur dəyəri daxil etdirin və onun müsbət və ya mənfi olduğunu göstərin
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Temperatur: ");
        int temp = scanner.nextInt();
        boolean müsbət = temp > 0;
        boolean mənfi = temp < 0;
        boolean sıfır = temp == 0;

        System.out.println("Temperatur müsbətdir " + müsbət);
        System.out.println("Temperatur mənfidir " + mənfi);
        System.out.println("Temperatur sıfırdır " + sıfır); */



        //14.Bank kartı nömrəsini daxil etdirin və onun 16 rəqəmli olub-olmadığını yoxlayın.
         /*Scanner scanner = new Scanner(System.in);
         System.out.println("Kart nömrəsi: ");
         int kardNumber = scanner.nextInt();

         boolean doğrudur = kardNumber == 16;

        System.out.println("Kart nömrəsi 16 rəqəmlidir " + doğrudur); */


        //15.Radius daxil etdirin və dairənin çevrəsini hesablayın
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Radiusu daxil edin: ");
        double radius = scanner.nextDouble();
        double cevre = 2 * Math.PI * radius;

        System.out.println("Dairənin çevrəsi: " + cevre); */


        //16.Sevdiyi rəngi soruşun və cavabı çap edin
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Sevdiyin rəng hansıdır? ");
        String color = scanner.nextLine();

        System.out.println("Sevdiyim rəng: " + color); */


        //17.İki ədəd daxil etdirin və onların hasilini göstərin
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin: ");
        int number = scanner.nextInt();

        System.out.println("İkinci ədədi daxil edin: ");
        int number2 = scanner.nextInt();

        int hasil = number * number2;
        System.out.println("Hasil: " + hasil); */


        //18. İmtahan verdiyi fənn sayını və hər birindən aldığı balı daxil etdirin, ortalamasını hesablayın.



        //19.İstifadəçidən bir ədəd alın və onun modulunu (Math.abs) göstərin.
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        System.out.println("Modul: " + Math.abs(eded)); */



        //20.Həftənin gününü daxil etdirin və istirahət günü olub olmadığını bildirin
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Həftənin gününü daxil edin: ");
        String gun = scanner.nextLine();
        boolean istirahət = gun.equals("Şənbə") || gun.equals("Bazar");

        System.out.println("İstirahət günü: " + istirahət); */

        //21.İstifadəçidən bir ədəd alıb onu 10-a bölərək nəticəni göstərin
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ədəd: ");
        int number = scanner.nextInt();

        System.out.println("Nəticə: " + number/10); */



        //22.İstifadəçidən bir simvol daxil etməsini istəyin və onu çap edin. SUAL
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Simvol daxil edin: ");
        String simvol = scanner.nextLine();

        System.out.println("Simvol: " + simvol); */


        //23.Ad və soyad daxil etdirin və tam adı birləşdirilmiş formada göstərin.
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ad: ");
        String name = scanner.nextLine();

        System.out.println("Soyad: ");
        String lastName = scanner.nextLine();

        System.out.println("Ad və soyadınız: " + name + lastName); */



        //24.Parol daxil etdirin və onun uzunluğunu yoxlayın
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Parol: ");
        String parol = scanner.nextLine();

        System.out.println(parol.length()); */





    }

}

