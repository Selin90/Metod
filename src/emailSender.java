// 7. MessageSender class yaz:
//   - send() metodu sadəcə mesajı çap etsin
//   - EmailSender və SMSSender class-ları override etsin və fərqli mesaj versin

public class emailSender extends messageSender{
    @Override
    public void send() {
        System.out.println("Telefon nömrənizi qeyd edin");
    }
}
