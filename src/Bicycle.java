//6. Vehicle və Bicycle class-ları yaz:
//   - Vehicle class-da move() metodu olsun
//   - Bicycle class Vehicle-dan extend etsin
//   - move() metodunu override et və fərqli mesaj çap et

public class Bicycle extends Vehicle{
    @Override
    public void move (){
        System.out.println("Bicycle is now moving forward...");
    }
}
