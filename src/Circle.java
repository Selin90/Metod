// 9. Shape və Circle class-ları yaz:
//   - Shape class-da draw() metodu 'Şəkil çəkilir' desin
//   - Circle class onu override edib 'Dairə çəkilir' desin

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Dairə çəkilir");
    }
}
