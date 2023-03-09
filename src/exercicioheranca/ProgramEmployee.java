package exercicioheranca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Quantidade de funcionários: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dados do funcionário #" + i);
            System.out.print("Terceirizado (s/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if(ch == 's'){
               System.out.print("Carga adicional: ");
               double cargaAdicional = sc.nextDouble();
               Employee emp = new OutsourcedEmployee(nome, horas, valorPorHora, cargaAdicional);
               list.add(emp);
            }else{
               Employee emp = new Employee(nome, horas, valorPorHora);
               list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAGAMENTOS:");

        for(Employee emp : list){
            System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
        }

        sc.close();
    }
}
