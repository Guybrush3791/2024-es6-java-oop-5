public abstract class NotificatoreBase implements Notificatore {

    private String destinatario;

    public NotificatoreBase(String destinatario) {

        setDestinatario(destinatario);
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {

        return "Notify for: " + getDestinatario();
    }
}
