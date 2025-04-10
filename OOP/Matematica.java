// Esempio didattico: Classi statiche in Java

// In Java, una classe può contenere membri statici (variabili e metodi)
// Una classe annidata può essere anche completamente statica

// Classe con membri statici
public class Matematica {

    // Variabile statica: condivisa da tutte le istanze (ma può essere usata anche senza istanza)
    public static final double PI = 3.1415926535;

    // Metodo statico: può essere chiamato senza creare un oggetto
    public static int quadrato(int x) {
        return x * x;
    }

    public static int somma(int a, int b) {
        return a + b;
    }
}

// Classe Main per usare la classe Matematica
class Main {
    public static void main(String[] args) {
        // Usiamo i metodi statici senza creare un oggetto Matematica
        System.out.println("Valore di PI: " + Matematica.PI);
        System.out.println("Quadrato di 5: " + Matematica.quadrato(5));
        System.out.println("Somma di 3 + 7: " + Matematica.somma(3, 7));
    }
}
