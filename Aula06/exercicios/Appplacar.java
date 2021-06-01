package exercicios;

public class Appplacar {
    
    public static void main(String[] args) {
        
        placar p = new placar();
        placar p2 = new placar("Flamengo","Palmeiras");
        placar p3 = new placar("Flamengo","Palmeiras",1,0);

        System.out.println(p.imprimePlacar());
        System.out.println(p2.imprimePlacar());
        System.out.println(p3.imprimePlacar());


    }
}
