// Un'altra classe che eredita da Animale
public class Gatto extends Animale {
    public Gatto(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void faiVerso() {
        System.out.println(getNome() + " miagola: Miao!");
    }

    @Override
    public void muoviti() {
        System.out.println(getNome() + " cammina con eleganza.");
    }
}
