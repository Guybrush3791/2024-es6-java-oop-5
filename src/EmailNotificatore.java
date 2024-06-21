public class EmailNotificatore extends NotificatoreBase {

    public EmailNotificatore(String destinatario) {
        super(destinatario);
    }

    @Override
    public void inviaNotifica(String messaggio) {

        System.out.println("mailto: " + getDestinatario() + " body: " + messaggio);
    }
}
