public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha(){
        System.out.println("Soltou bolha");
    }
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo alga");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de peixe");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
