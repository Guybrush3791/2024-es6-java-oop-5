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

    }
}
