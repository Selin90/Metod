import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        //1.1-dən 10-a qədər olan ədədləri çap et.

      /*  for (int i=1; i<=10; i++){
            System.out.println(i);
        } */



        //2. 10-dan 1-ə doğru tərsinə ədədləri çap et

     /*   for (int i =10; i>=1; i--){
            System.out.println(i);
        } */



        //3.1-dən 20-yə qədər olan tək ədədləri çap et.

     /*   for (int i=1; i<=20; i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        } */



       //4.1-dən 50-yə qədər 5-ə bölünən ədədləri çap et.

     /*   for (int i=1; i<=50; i++){
            if (i%5==0){
                System.out.print(i + " ");
            }
        }  */


        //5. 1-dən 10-a qədər olan ədədlərin kvadratlarını çap et.

    /*    for (int i=1; i<=10; i++){
            int kvadrat= i*i;
            System.out.print(kvadrat + " ");
        } */


        //6. 1-dən 5-ə qədər olan ədədlərin cəmini tap və ekrana yaz.

      /*  int cem=0;
        for (int i=1; i<=5; i++){
            cem +=i;
        }
        System.out.print(cem); */


        //7. İstifadəçidən 'n' ədədi daxil edin, 1-dən n-ə qədər olan ədədləri çap et.
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        int eded = scanner.nextInt();
        for (int i=1; i<=eded; i++){
            System.out.print(i + " ");
        }  */


        //8. 1-dən 10-a qədər ədədlərin cəmini və hasilini tap və yaz

      /*  int cem = 0;
        int hasil = 1;
        for (int i=1; i<=10; i++){
            cem +=i;
            hasil *=i;
        }
        System.out.println("Cem:" + cem);
        System.out.println("Hasil:" + hasil); */


        //9. Sadəcə 'for' ilə aşağıdakı ulduz formasını çap et

     /*   for (int i=1; i<=5; i++){
            for (int s=1; s<=i; s++){
                System.out.print("* ");
            }
            System.out.println();
        } */


        //10.1-dən 100-ə qədər olan ədədlər arasında həm 3-ə, həm də 5-ə bölünənləri tap və yaz.

     /*   for (int i=1; i<=100; i++){
            if (i%3==0&&i%5==0){
                System.out.print(i + " ");
            }
        } */



    }
}
