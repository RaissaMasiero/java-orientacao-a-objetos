package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramExLista {

    public static void main(String[] args) {

        // proibidos tipos primitivos ao dar um tipo pra lista.
        // arraylist junta as melhores características do vetor e da lista.

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // adicionar novo elemento em determinada posição.
        list.add(2, "Marco");

        System.out.println(list.size());

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("-----------------------------------");

        // list.remove(1); por valor ou por posição

        list.removeIf(x -> x.charAt(0) == 'M'); // predicado: retorna true ou false. remove os que começam com M

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("-----------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob")); // posição

        System.out.println("-----------------------------------");

        // pega a lista 1, filtra os elementos com a letra A e devolve uma nova lista.
        // transforma a lista em stream para realizar expressão lambda, depois converte de novo pra lista.
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }

        System.out.println("-----------------------------------");

        // Encontrar o primeiro elemento que começa com a letra A, se não existir, retorna nulo.
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
