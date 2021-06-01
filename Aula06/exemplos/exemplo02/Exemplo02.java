package exemplos.exemplo02;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);

        System.out.println(lista.get(0));
        System.out.println(lista.get(2));
        
        for (int i = 0; i < lista.size(); i++) { // imprimindo tudo utilizando forEach
            System.out.println(lista.get(i));
        }

        for (Integer valor : lista) { // para cada valor da lista faça utilizando for each
            System.out.println(valor);
        }
    }
}
