public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(2);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Lobo l = new Lobo();

        c.locomover();
        //ca.enterrarOsso();
        ca.emitirSom();
        l.emitirSom();
    }
}
