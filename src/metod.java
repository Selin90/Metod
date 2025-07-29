public class metod {
    public static void main(String[] args) {
        //  yazSalam();
        //   yazAd("Anar");
        //   cemEt(5,5);
        //   cemEt(5,7);
        //   kvadrat(5);
        //   tamAd ("Selin", "Mammadaliyeva");
        //   ferq();
        //   yoxlaCutTek (10);
        //   enBoyuk(5,9,15);
        //   faktorial(5);


    // 1. Tapşırıq:Metodun adı `yazSalam` olsun. Heç bir parametr almasın. Sadəcə ekrana belə yazsın:
    // Salam, Java!
 /* public static void yazSalam() {
        System.out.println("Salam, Java!");
    } */

    //  2. Tapşırıq:Metodun adı `yazAd` olsun və `String ad` parametrini alsın. Məsələn:
    //  yazAd("Anar");Çıxış: Sənin adın: Anar
  /*  public static void yazAd(String ad){
        System.out.println("Sənin adın: " + ad);
    } */


    //  3. Tapşırıq:Metodun adı `cemEt` olsun. `int a, int b` parametrləri alsın və `System.out.println` ilə
    //  cəmini göstərsin.
  /*  public static void cemEt (int a, int b){
        System.out.println("Cem: " + (a+b));
    } */


    //4. Tapşırıq:Metod `int cemEt(int a, int b)` şəklində olsun. Ədədləri qəbul edib, cəmi geri qaytarsın.Nəticəni `main`də çap et.
/*public static int cemEt(int a, int b) {
    return a + b;
} */


    //5. Tapşırıq:Metod `int kvadrat(int n)` şəklində olsun. Verilən ədədin kvadratını hesablayıb return etsin.
/*public static int kvadrat(int n){
    return n*n;
} */


    //6. Tapşırıq:String tamAd(String ad, String soyad)` metodu yaz. İki parametr alıb ad və soyadı birləşdirsin, return etsin.
/*public static String tamAd(String ad, String soyad ){
    return ad+" "+soyad;
}  */


    // 7. Tapşırıq:Metod `int ferq()` olsun. Heç parametr almasın. `Scanner` ilə istifadəçidən 2 ədəd alıb fərqini qaytarsın.
/*public static int ferq(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("1-ci ədədi daxil edin: ");
    int eded1 = scanner.nextInt();

    System.out.println("2-ci ədədi daxil edin: ");
    int eded2 = scanner.nextInt();

    return eded1-eded2;
} */


    //8.Metod `String yoxlaCutTek(int n)` olsun. Ədəd cütdürsə “CÜT”, yoxsa “TƏK” sözünü
    // return etsin.
   /* public static String yoxlaCutTek (int n){
        if (n%2==0){
            return "CÜT";
        }else{
            return "TƏK";
        }
    } */


    //   9. Tapşırıq:Metod `int enBoyuk(int a, int b, int c)` olsun. Geri ən böyük ədədi qaytarsın
   /* public static int enBoyuk(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
            if (c > max) {
                max = c;
            }
        }
        return max; */




   /* public static int faktorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;

    }} */


  /*  Overloading sahe = new Overloading();
            int kvadratinSahesi = sahe.area(6);
            {
            System.out.println("Kvadratın sahəsi: " + kvadratinSahesi);
            int duzbucaqlininSahesi = sahe.area(6, 7);
            {
                System.out.println("Düzbucaqlının sahəsi: " + duzbucaqlininSahesi);
            }
            double daireninSahesi = sahe.area(9.5);
            {
                System.out.println("Dairənin sahəsi: " + daireninSahesi);
            }
        } */


     /*   Overloading mesaj = new Overloading();
        mesaj.sendMessage("Salam! ");
        mesaj.sendMessage("Hello", 4); */



     /*   Overloading cevirici = new Overloading();

        double metr = cevirici.convert(300);
        System.out.println("300 sm = " + metr + " m");

        double qram = cevirici.convert(1.5);
        System.out.println("1.5 kg = " + qram + " q");

        float temperatur = cevirici.convert("37.8");
        System.out.println("Temperatur: " + temperatur + " °C"); */

}}