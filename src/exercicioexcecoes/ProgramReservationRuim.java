package exercicioexcecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservationRuim {

    public static void main(String[] args) throws ParseException {

        /*Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída) e
        mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar
        a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar dados inválidos para a
        reserva, conforme as seguintes regras: - Alterações de reserva só podem ocorrer para datas futuras - A data de saída
        deve ser maior que a data de entrada (SOLUÇÃO AINDA RUIM, MAS MELHOR QUE ANTES)*/

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número de quarto: ");
        int numeroQuarto = sc.nextInt();

        System.out.print("Data de entrada (dd/MM/yyyy): ");
        Date dataEntrada = sdf.parse(sc.next());

        System.out.print("Data de saída (dd/MM/yyyy): ");
        Date dataSaida = sdf.parse(sc.next());

        if(!dataSaida.after(dataEntrada)){
            System.out.println("Erro na reserva: data de saída deve ser depois da data de entrada!");
        }else{
            Reservation reserva = new Reservation(numeroQuarto, dataEntrada, dataSaida);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Digite os dados para atualizar a reserva:");
            System.out.print("Data de entrada (dd/MM/yyyy): ");
            dataEntrada = sdf.parse(sc.next());

            System.out.print("Data de saída (dd/MM/yyyy): ");
            dataSaida = sdf.parse(sc.next());

            String erro = reserva.atualizarDatas(dataEntrada, dataSaida);

            if(erro != null){
               System.out.println("Erro na reserva: " + erro);
            }else {
               System.out.println("Reserva: " + reserva);
            }
        }

        sc.close();
    }
}
