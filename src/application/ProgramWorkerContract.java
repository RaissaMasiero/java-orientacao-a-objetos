package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorkerContract {

    public static void main(String[] args) throws ParseException {

        /* Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês
        e mostrar qual foi o salário do funcionário nesse mês. Classes: Worker, Department, HourContract, WorkerLevel*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Digite os dados do trabalhador:");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();

        System.out.print("Level: ");
        String nivelTrabalhador = sc.nextLine();

        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();

        Worker worker = new Worker(nomeTrabalhador, WorkerLevel.valueOf(nivelTrabalhador),
                                   salarioBase, new Department(nomeDepartamento));

        System.out.print("Quantos contratos o trabalhador terá: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dados do contrato #" + i);

            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();

            HourContract contract = new HourContract(dataContrato, valorPorHora, horas);
            worker.addContract(contract);
        }

        System.out.print("Digite mês e ano para calcular a renda(MM/YYYY): ");
        String mesEAno = sc.next();

        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Renda em " + mesEAno + ": " + String.format("%.2f",worker.income(ano, mes)));

        sc.close();
    }
}
