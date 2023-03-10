package exercicioheranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramPerson {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        System.out.print("Número de contribuintes: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dados do contribuinte #" + i);
            System.out.print("Fisica ou jurídica (f/j): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if(ch == 'f'){
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                Person person = new Individual(nome, rendaAnual, gastosSaude);
                list.add(person);
            }else{
                System.out.print("Número de funcionários: ");
                double numeroFuncionarios = sc.nextDouble();
                Person person = new Company(nome, rendaAnual, numeroFuncionarios);
                list.add(person);
            }
        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");

        for(Person person : list){
            System.out.println(person);
        }

        double sum = 0.0;

        for(Person person : list){
            sum += person.imposto();
        }

        System.out.println();
        System.out.println("TOTAL DE IMPOSTOS: $" + String.format("%.2f", sum));

        sc.close();
    }
}
