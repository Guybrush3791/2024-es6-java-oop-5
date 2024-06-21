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

    public boolean isNumberDestinatario() {

        for (char c : getDestinatario().toCharArray())
            if (c >= '0' && c <= '9')
                return true;

        return false;
    }

    @Override
    public String toString() {

        return "Notify for: " + getDestinatario();
    }
}
