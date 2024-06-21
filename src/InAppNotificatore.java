public class InAppNotificatore extends NotificatoreBase {

    public InAppNotificatore(String destinatario) {
        super(destinatario);
    }

    @Override
    public void inviaNotifica(String messaggio) {

        System.out.println("InApp a: " + getDestinatario() + " body: " + messaggio);
    }

}
