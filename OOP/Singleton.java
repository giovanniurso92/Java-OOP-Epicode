// Esempio didattico di pattern Singleton in Java

// Classe Singleton
public class Singleton {

    // 1. Istanza privata e statica della classe (inizialmente null)
    private static Singleton istanza;

    // 2. Costruttore privato per impedire l'istanziazione esterna
    private Singleton() {
        System.out.println("Istanza Singleton creata.");
    }

    // 3. Metodo statico pubblico per ottenere l'unica istanza
    public static Singleton getInstance() {
        if (istanza == null) {
            // L'istanza viene creata solo la prima volta (lazy initialization)
            istanza = new Singleton();
        }
        return istanza;
    }

    // Metodo di esempio
    public void mostraMessaggio() {
        System.out.println("Ciao! Sono l'unica istanza della classe Singleton.");
    }
}

// Classe Main per testare il Singleton
class Main {
    public static void main(String[] args) {
        // Recuperiamo due volte l'istanza del Singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Usiamo un metodo dell'istanza Singleton
        s1.mostraMessaggio();

    }
}
