public class Overloading {

    // 1. printInfo() adlı metod yaz:
    // - Versiya 1: Yalnız adı çap et
    //- Versiya 2: Ad və yaşı çap et
    // - Versiya 3: Ad, yaş və universitet adını çap e
    /*    public static void printInfo(String ad) {
        System.out.println("Ad: " + ad);
    }
    public static void printInfo(String ad, int yas) {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
    }
    public static void printInfo(String ad, int yas, String universitet) {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Universitet: " + universitet);
    }
    public static void main(String[] args) {
        printInfo("Selin");
        printInfo("Anar", 30);
        printInfo("Gunay", 35, "Bakı Slavyan Universiteti");
    } */


// 2. multiply() metodu yaz:
//   - multiply(int a, int b): iki tam ədədi vur
//   - multiply(int a, int b, int c): üç tam ədədi vur
//   - multiply(double a, double b): onluq ədədləri vur

 /*   public static int multiply(int a, int b){
        return a*b;
    }
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }
    public static double multiply(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(4,5));
        System.out.println(multiply(6,7,9));
        System.out.println(multiply(7.2, 5.5));
    } */



    // 3. area() metodunu overload et:
    //   - area(int side): kvadratın sahəsini hesabla
    //   - area(int l, int w): düzbucaqlının sahəsini hesabla
    //   - area(double r): dairənin sahəsini hesabla

    //kvadrat
 /*   public int area(int a){
        return a*a;
    }
    //duzbucaqli
    public int area(int uzunluq, int en){
        return uzunluq*en;
    }
    //daire
    public double area(double radius){
        return Math.PI*radius*radius;
    }  //Netice mainde  */


    //4. sendMessage() metodu yaz:
    //   - sendMessage(String msg): mesajı bir dəfə çap et
    //   - sendMessage(String msg, int repeat): mesajı istədiyin sayda təkrar çap et

 /*   public void sendMessage (String msg){
        System.out.println(msg);
    }
    public void sendMessage (String msg, int repeat){
        for (int i=0; i<repeat; i++){
            System.out.println(msg);
        }
    } */ //Netice mainde



    //5. convert() metodu yaz:
    //   - convert(int cm): santimetrdən metrə çevir
    //   - convert(double kg): kiloqramdan qrama çevir
    //   - convert(String celsius): temperaturu string-dən float-a çevir


/*    public double convert(int cm) {
        return cm / 100.0;
    }
    public double convert(double kg) {
        return kg * 1000;
    }
    public float convert(String celsius) {
        return Float.parseFloat(celsius);
    } */



    // 6. Vehicle və Bicycle class-ları yaz:
    //   - Vehicle class-da move() metodu olsun
    //   - Bicycle class Vehicle-dan extend etsin
    //   - move() metodunu override et və fərqli mesaj çap et












}