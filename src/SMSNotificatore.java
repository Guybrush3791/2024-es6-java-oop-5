public class SMSNotificatore extends NotificatoreBase {

    public SMSNotificatore(String destinatario) {
        super(destinatario);
    }

    // get/set

    @Override
    public void inviaNotifica(String messaggio) {

        System.out.println("SMS a: " + getDestinatario() + " body: " + messaggio);
    }
}
