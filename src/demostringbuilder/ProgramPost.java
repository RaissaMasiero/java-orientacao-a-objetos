package demostringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramPost {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // instanciando comentários do post 1
        Comment c1 = new Comment("Tenha uma ótima viagem!");
        Comment c2 = new Comment("Uau que incrível!");

        // instanciando o post 1
        Post p1 = new Post(sdf.parse("21/06/2023 13:05:44"), "Viajando pra Nova Zelândia",
                                     "Vou visitar esse país maravilhoso!", 12);

        // adicionando os comentários ao post
        p1.addComent(c1);
        p1.addComent(c2);

        Comment c3 = new Comment("Boa noite");
        Comment c4 = new Comment("Que a força esteja com você!");

        Post p2 = new Post(sdf.parse("28/07/2023 23:14:19"), "Boa noite gente",
                                    "Vejo vocês amanhã", 5);

        p2.addComent(c3);
        p2.addComent(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
