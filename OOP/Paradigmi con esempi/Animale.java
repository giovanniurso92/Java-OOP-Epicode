// Classe astratta: non può essere istanziata, ma può avere metodi implementati e astratti
public abstract class Animale implements Movimento {
    // Incapsulamento: proprietà private con metodi getter e setter
    private String nome;
    private int eta;

    // Costruttore
    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // Metodo concreto
    public void descrizione() {
        System.out.println(nome + " ha " + eta + " anni.");
    }

    // Metodo astratto: deve essere implementato nelle sottoclassi
    public abstract void faiVerso();
}
