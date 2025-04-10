// Ereditarietà: Cane estende Animale ed eredita metodi e proprietà
public class Cane extends Animale {
    public Cane(String nome, int eta) {
        super(nome, eta);
    }

    // Override: implementazione specifica del metodo astratto
    @Override
    public void faiVerso() {
        System.out.println(getNome() + " abbaia: Bau!");
    }

    // Implementazione del metodo dell'interfaccia
    @Override
    public void muoviti() {
        System.out.println(getNome() + " corre!");
    }
}
