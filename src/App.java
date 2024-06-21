public class App {

    /**
     * Passaggi:
     * 
     * Definisci un'interfaccia:
     * Crea un'interfaccia chiamata Notificatore.
     * Definisci un metodo inviaNotifica(String messaggio) che tutte le classi che
     * implementano l'interfaccia dovranno definire.
     * 
     * 
     * Crea una classe astratta:
     * Definisci una classe astratta chiamata NotificatoreBase che implementa
     * Notificatore.
     * Aggiungi un campo private String destinatario e un costruttore che
     * inizializza questo campo.
     * Implementa le proprieta' getter/setter per la variabile d'istanza.
     * 
     * 
     * Implementa le classi concrete:
     * Crea classi concrete EmailNotificatore, SMSNotificatore, e InAppNotificatore
     * che estendono NotificatoreBase.
     * Ogni classe dovrebbe implementare il metodo inviaNotifica in modi che
     * riflettano il mezzo di comunicazione (ad esempio, la notifica via email
     * potrebbe includere un oggetto email, quella via SMS potrebbe iniziare con
     * "SMS a:", ecc).
     * 
     * 
     * Testing:
     * Scrivi del codice per creare istanze di ogni tipo di notificatore, impostando
     * il destinatario appropriato.
     * Invia un messaggio di test utilizzando ciascun notificatore e stampa il
     * risultato (simulato) della notifica.
     */

    public static void main(String[] args) throws Exception {

        // notifyTest();
        notifyNumberCounter();
    }

    public static void notifyTest() {

        Notificatore emailNotificatore = new EmailNotificatore("mia@mail.com");
        emailNotificatore.inviaNotifica("Hello there! This is my mail account. Hang me out!");
        System.out.println(emailNotificatore);

        Notificatore emailNotificatore2 = new EmailNotificatore("tua@mail123.com");
        emailNotificatore2.inviaNotifica("Hello there! This is my mail account. Hang me out!");
        System.out.println(emailNotificatore2);

        Notificatore smsNotificatore = new SMSNotificatore("1234567890");
        smsNotificatore.inviaNotifica("Hello there! This is my phone number. Hang me out!");
        System.out.println(smsNotificatore);

        Notificatore smsNotificatore2 = new SMSNotificatore("0987654321");
        smsNotificatore2.inviaNotifica("Hello there! This is my phone number. Hang me out!");
        System.out.println(smsNotificatore2);

        Notificatore inAppNotificatore = new InAppNotificatore("#12345");
        inAppNotificatore.inviaNotifica("Hello there! This is my in-app account. Hang me out!");
        System.out.println(inAppNotificatore);

        Notificatore inAppNotificatore2 = new InAppNotificatore("#abcdefg");
        inAppNotificatore2.inviaNotifica("Hello there! This is my in-app account. Hang me out!");
        System.out.println(inAppNotificatore2);
    }

    public static void notifyNumberCounter() {

        NotificatoreBase emailNotificatore = new EmailNotificatore("mia@mail.com");
        emailNotificatore.inviaNotifica("Hello there! This is my mail account. Hang me out!");
        System.out.println(emailNotificatore);

        NotificatoreBase emailNotificatore2 = new EmailNotificatore("tua@mail123.com");
        emailNotificatore2.inviaNotifica("Hello there! This is my mail account. Hang me out!");
        System.out.println(emailNotificatore2);

        NotificatoreBase smsNotificatore = new SMSNotificatore("1234567890");
        smsNotificatore.inviaNotifica("Hello there! This is my phone number. Hang me out!");
        System.out.println(smsNotificatore);

        NotificatoreBase smsNotificatore2 = new SMSNotificatore("0987654321");
        smsNotificatore2.inviaNotifica("Hello there! This is my phone number. Hang me out!");
        System.out.println(smsNotificatore2);

        NotificatoreBase inAppNotificatore = new InAppNotificatore("#12345");
        inAppNotificatore.inviaNotifica("Hello there! This is my in-app account. Hang me out!");
        System.out.println(inAppNotificatore);

        NotificatoreBase inAppNotificatore2 = new InAppNotificatore("#abcdefg");
        inAppNotificatore2.inviaNotifica("Hello there! This is my in-app account. Hang me out!");
        System.out.println(inAppNotificatore2);

        NotificatoreBase[] nbs = {
                emailNotificatore,
                emailNotificatore2,
                smsNotificatore,
                smsNotificatore2,
                inAppNotificatore,
                inAppNotificatore2 };

        // TODO: contare quante notifiche sono state inviate
        // a destinari che contengono una o piu' cifre nel nome
        int destinatarioWithNumber = getDestinatarioWithNumber(nbs);
        System.out.println("Numero di destinatari con cifre: " + destinatarioWithNumber);
    }

    public static int getDestinatarioWithNumber(NotificatoreBase[] nbs) {

        int destinatarioWithNumber = 0;

        for (NotificatoreBase nb : nbs)
            if (nb.isNumberDestinatario())
                destinatarioWithNumber++;

        return destinatarioWithNumber;
    }
}
