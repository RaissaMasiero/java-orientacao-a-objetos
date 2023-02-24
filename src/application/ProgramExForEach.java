package application;
public class ProgramExForEach {

    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        // for tradicional

        for(int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("----------------------------");

        // laço foreach: percorre todos os elementos de vect, dando o apelido de vetor

        for(String vetor : vect){
            System.out.println(vetor);
        }
    }
}
