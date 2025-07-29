// 7. MessageSender class yaz:
//   - send() metodu sadəcə mesajı çap etsin
//   - EmailSender və SMSSender class-ları override etsin və fərqli mesaj versin

public class SMSSender extends messageSender{
    public void send(){
        System.out.println("E-mailinizi qeyd edin");
    }
}
