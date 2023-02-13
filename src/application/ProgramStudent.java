package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres
            do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a
            nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e,
            em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado
            (que é 60% da nota).
         */

        Locale.setDefault(Locale.US);
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        student.nome = sc.nextLine();

        System.out.println("Digite suas três notas:");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("NOTA FINAL: %.2f%n", student.somaNotas());

        if(student.somaNotas() < 60.0){
            System.out.println("FAILED");
            System.out.printf("FALTAM %.2f PONTOS%n", student.pontosFaltando());
        }else{
            System.out.println("PASS");
        }

        sc.close();
    }
}
