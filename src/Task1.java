import javax.lang.model.element.Name;

public class Task1 {
    public static void main(String[] args) {
        //1.Bir dəyişən yaradıb ona fayl ölçüsünü yaz (məsələn, 120). Konsola çıxar.
      /*  String name= "Book";
        int fileSize = 200;
        System.out.println("Name: " + name);
        System.out.println("File Size: " + fileSize);
    } */

        //2.Məzuniyyət ilini saxlayan dəyişən yarat və çap et
      /* String name = "Selin";
        int mezuniyyetIli = 2019;
        System.out.println("Ad: " + name);
        System.out.println("Məzuniyyət ili: " + mezuniyyetIli);} */

        //3.İstifadəçi ID-sini saxlayan dəyişən yarat və çap et.
       /* String name= "Selin";
        String userID= "6bo94ml";
        System.out.println("User name: " + name);
        System.out.println("User ID: " + userID);}*/

        //4.Dünya əhalisi üçün dəyişən yarat və böyük bir rəqəm saxla
        /*long Population= 8005176000L;
        System.out.println("Amount of popullation in the world: " + Population);}*/

        //5.Temperaturu onluq ədəd kimi saxlayan dəyişən yarat və çap et.
        /*double temperature = 35.5;
        System.out.println("Temperature of water: " + temperature);} */

       /* //6.Bank hesabındakı məbləği saxlayan dəyişən yarat və çap et
        float amount = 10000.50f;
        System.out.println("The amount in the bank account: " + amount);}*/

        //7.Adının ilk hərfini saxlayan dəyişən yarat və çap et.
        /*char karakter = 'S';
        System.out.println("The first letter of my name: " + karakter);}*/

        //8.‘İşləyir?’ sualına uyğun boolean dəyişən yarat və çap et
        /*boolean isWorking = true;
        System.out.println("Is it working?: " + isWorking);}*/

        //9.Yaşını saxlayan dəyişən yarat və çap et.
        /*int age= 26;
        System.out.println("Age: " + age);}*/

        //10.Fərqli tipli bir neçə dəyişən yaradaraq hamısını çap edən proqram yaz
        /*String name = "Selin";
        int age = 26;
        char gender = 'F';
        boolean isEmployed = true;
        double salary = 10000.5;
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Is employed: " + isEmployed);
        System.out.println("Salary: " + salary);}*/

        //11.int → double avtomatik çevrilməsi nümunəsi yaz və nəticəni çap et
       /* int amount = 1000;
        double myamount = amount;
        System.out.println("Amount: " + myamount);} */

        //12.double → int manual çevrilməsi yaz və onluq hissənin itirildiyini göstər
        /*double amount = 10.5;
        int myamount = (int)amount;
        System.out.println("My amount: " + myamount);}*/

        //13. long → int çevrilməsi zamanı sərhəd aşımı nəticəsini göstər.
       /* long amount = 10255550000L;
        int myAmount = (int) amount;
        System.out.println("My Amount: " + myAmount);}  //Sual!!!!// */

      /*  //14. short → byte manual çevrilməsi yaz və nəticəni analiz et
        short amount = 25;
        byte myAmount = (byte) amount;
        System.out.println("My Amount: " + myAmount);} //Sual */

        //15.byte → int avtomatik çevrilməsini göstər
       /* byte amount = 55;
        int myAmount = (int) amount;
        System.out.println("My Amount: " + myAmount);} */

        //16.float → int çevrilməsi ilə onluq hissənin necə itdiyini göstər
       /* float amount = 35.55555f;
        int myAmount = (int) amount;
        System.out.println("My Amount: " + myAmount);} */

        // 17.Hər bir casting növü üçün nümunə daxil edən proqram yaz (ən azı 7 dəyişənlə)

        //18.Mağaza məhsulu üçün aşağıdakı məlumatları saxlayan dəyişənlər yarat və konsola çıxar:
       /* String productName = "Çörək";
        int productAmount = 25;
        double price = 0.50;
        boolean inStock = true;
        System.out.println("Product name: " + productName);
        System.out.println("Amount: " + productAmount);
        System.out.println("Price: " + price);
        System.out.println("In Stock: " + inStock);} */

        //19.Şagirdin məlumatlarını saxlayan proqram yaz
       /* String name = "Said";
        int age = 17;
        int grade = 90;
        boolean isPassed = grade >= 50;
        System.out.println("Student name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Passed? " + isPassed);} */

        //20.Hava haqqında məlumatları saxlayan dəyişənlər yarat və konsola çıxar
       /* int temperature = 22;
        boolean rain = temperature <= 18;
        String weather = "Cloudy";
        System.out.println("Temperature: " + temperature);
        System.out.println("Is it raining? " + rain);
        System.out.println("Weather condition: " + weather);} */

        //21.Avtomobil üçün aşağıdakı məlumatları saxla və konsola çıxar
        /*String model = "BMW";
        int year = 2017;
        double mileage = 85.000;
        int price = 100000;
        System.out.println("Model of the car: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);} */

        //22.Kitabxana sistemində kitab məlumatlarını saxla
        /*String name = "Jane Eyre";
        String author = "Charlotte Bronte";
        int page = 423;
        boolean availability = true;
        System.out.println("Name of the book: " + name);
        System.out.println("Author of the book: " + author);
        System.out.println("Number of pages: " + page);
        System.out.println("Is it available? " + availability);} */

        //23.Telefon haqqında məlumatları saxlayan proqram yaz
       /* String brand = "Samsung";
        String model = "S24 Ultra";
        String storage = "512 gb";
        double price = 2899.99;
        System.out.println("Brand of phone: " + brand);
        System.out.println("Model of phone: " + model);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);} */

        //24.Film haqqında məlumatları saxlayan dəyişənlər yarat və çap et
        /*String name = "The Intouchables";
        String genre = "Comedy Drama";
        String date = "23 September, 2011";
        double imdbRate = 8.5;
        System.out.println("Name of the movie: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Release date: " + date);
        System.out.println("IMDb rate: " + imdbRate);} */

        //25.Restoran masası üçün rezervasiya sistemində istifadə olunacaq dəyişənlər yaz
        /*String name = "Selin";
        int number = 5;
        int amount = 4;
        boolean reservationStatus = true;
        System.out.println("Name of the guest: " + name);
        System.out.println("Table number: " + number);
        System.out.println("Number of guests: " + amount);
        System.out.println("Is the reservation active? " + reservationStatus);}



}

         */
    }
}