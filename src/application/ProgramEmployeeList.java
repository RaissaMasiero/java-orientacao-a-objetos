package application;

import entities.EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployeeList {

    public static void main(String[] args) {

        /*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários.
        Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
        Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a
        operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados: ");
        int n = sc.nextInt();

        List<EmployeeList> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.println("Funcionário #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            System.out.println();
            EmployeeList employeeList = new EmployeeList(id, nome, salario);
            list.add(employeeList);
        }

        System.out.print("Digite o id do funcionário para aumentar o salário: ");
        int idAumento = sc.nextInt();

        EmployeeList emp = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);

        if(emp == null){
           System.out.println("Este id não existe!");
        }else{
           System.out.print("Digite a porcentagem: ");
           double porcentagem = sc.nextDouble();
           emp.increaseSalary(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");

        for (EmployeeList listaDeFuncionarios : list){
            System.out.println(listaDeFuncionarios);
        }

        sc.close();
    }
}
