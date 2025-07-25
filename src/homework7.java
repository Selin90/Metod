import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        // 1. Tam ədədləri massivə yaz və çap et
        // İstifadəçidən 5 ədəd tam ədəd daxil etməsini istəyin. Bu ədədləri bir `int` massivində
        // saxlayın və sonra hər birini ekrana çap edin
     /*   Scanner number = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + "-ci ədədi daxil edin: ");
            numbers[i] = number.nextInt();
        }
        System.out.println("Daxil etdiyiniz ədədlər:");
        for (int num : numbers) {
            System.out.println(num);
        }  */


   //   2. Massivin cəmini tap/İstifadəçidən 6 tam ədəd daxil etməsini istəyin və bu ədədləri `int` massivində saxlayın.
   //     Daha sonra massivdəki bütün ədədlərin cəmini hesablayıb ekrana çap edin.
      /*  Scanner scanner = new Scanner(System.in);
        int[] number = new int[6];
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println((i + 1) + "-ci ədədi daxil edin: ");
            number[i] = scanner.nextInt();
            sum += number[i];
        }
        System.out.println("Daxil edilən ədədlərin cəmi: " + sum); */


       // 3.Ən böyük ədədi tap
      //  İstifadəçidən 7 tam ədəd daxil etməsini istəyin və massivdə saxlayın. Daha sonra həmin
      // massivdəki ən böyük ədədi taparaq ekrana yazdırın
     /*   Scanner scanner = new Scanner(System.in);
        int [] number = new int[7];
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            System.out.println((i + 1) + "-ci ədədi daxil edin: ");
            number[i] = scanner.nextInt();
            if (number[i] > max) {
                max=number[i];
            }

        }
        System.out.println("Ən böyük ədəd: " + max); */




        // 4.Ədədlərin ortalamasını hesabla
      //  İstifadəçidən 4 tam ədəd daxil etməsini istəyin. Onların ortalamasını hesablayıb, ekrana göstərin

    /*    Scanner scanner = new Scanner(System.in);
        int[] number = new int[4];
        int sum = 0;
        for (int i = 0; i < number.length; i++){
            System.out.println((i+1) + "-ci ədədi daxil edin: ");
            number[i] = scanner.nextInt();
            sum += number[i];
        }
        double average = sum / 4.0;
        System.out.println("Ortalama: " + average); */



      //  5. Cüt ədədləri çap et
      //  İstifadəçidən 8 ədəd daxil etməsini istəyin və yalnız cüt olan ədədləri ekrana çap edin.
     /*   Scanner scanner = new Scanner(System.in);
        int[] number = new int[8];
        for (int i = 0; i < number.length; i++){
            System.out.println((i+1) + "-ci ədədi daxil edin: ");
            number[i] = scanner.nextInt();
        }
        System.out.println("Cüt ədədlər:");
        for (int n : number) {
            if (n % 2 == 0) {
                System.out.println(n);
        }}  */



        //6.Massivdə neçə tək ədəd var?
        // İstifadəçidən 10 tam ədəd daxil etməsini istəyin. Massivdə neçə tək ədəd olduğunu
        // tapıb çap edin.
    /*    Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        int tekEdedler = 0;
        for (int i = 0; i < number.length; i++){
            System.out.println((i+1) + "-ci ədədi daxil edin: ");
            number[i] = scanner.nextInt();
            if (number[i] % 2 != 0){
                tekEdedler++;

            }}
        System.out.println("Maasivdə" + tekEdedler + "tək ədəd var."); */




//7.Ədədləri tərsinə çap et
// İstifadəçidən 5 ədəd daxil edin və onları massivdə saxlayın. Daha sonra həmin ədədləri
// tərsinə (əks sıra ilə) ekrana çap edin.
     /*   Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            System.out.print((i + 1) + "-ci ədədi daxil edin: ");
            number[i] = scanner.nextInt();
        }
        System.out.println("Ədədlərin tərsi:");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);
        }  */



        // 8. Söz massivində uzunluğu 5-dən böyük olanları çap et
        // İstifadəçidən 6 söz daxil etməsini istəyin və yalnız uzunluğu 5-dən çox olan sözləri
        // ekrana çap edin.
   /*     Scanner scanner = new Scanner(System.in);
        String[] words = new String[6];

        for (int i = 0; i < words.length; i++) {
            System.out.print((i + 1) + "-ci sözü daxil edin: ");
            words[i] = scanner.nextLine();
        }
        System.out.println("Uzunluğu 5 simvoldan böyük olan sözlər:");
        for (String word : words) {
            if (word.length() > 5) {
                System.out.println(word);
            }} */


        //9.Ədədləri kvadrata yüksəlt
        // İstifadəçidən 5 tam ədəd daxil etməsini istəyin və hər birini kvadrata yüksəldib yeni
        // massivə yazın. Yeni massivdəki ədədləri çap edin.




        //10.Massivdə ədədin olub olmadığını yoxla
        // İstifadəçidən 6 ədəd daxil etməsini istəyin və əlavə olaraq bir ədəd soruşun. Həmin
        // ədəd massivdə varsa, 'tapıldı', yoxdursa, 'tapılmadı' yazdırın

      /*  Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + "-ci ədədi daxil edin: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("İstədiyiniz ədədi daxil edin: ");
        int eded = scanner.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == eded) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Tapıldı");
        } else {
            System.out.println("Tapılmadı");
        } */





    }
}
