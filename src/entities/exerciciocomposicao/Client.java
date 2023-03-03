package entities.exerciciocomposicao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String name;
    private String email;
    private LocalDate nascimento;

    public Client(){}

    public Client(String name, String email, LocalDate nascimento) {
        this.name = name;
        this.email = email;
        this.nascimento = nascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String toString() {
        return name + " (" + dtf.format(nascimento) + ") - " + email;
    }
}
