public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto di tipo Cane
        Cane cane = new Cane("Fido", 3);
        cane.faiVerso();

        // Modifica dell'attributo tramite setter
        cane.setNome("Rex");
        cane.setEta(5);
        System.out.println("Dopo la modifica: " + cane.getNome() + " ha " + cane.getEta() + " anni.");

        // Polimorfismo: un animale può essere un cane o un gatto
        Animale gatto = new Gatto("Micio", 2);
        gatto.faiVerso();

        // Uso di un'interfaccia
        cane.muoviti();
        gatto.muoviti();
    }
}
