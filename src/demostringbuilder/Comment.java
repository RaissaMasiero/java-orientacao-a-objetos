package demostringbuilder;
public class Comment {

     private String texto;

     public Comment(){}

     public Comment(String texto) {
         this.texto = texto;
     }

     public String getTexto() {
         return texto;
     }

     public void setTexto(String texto) {
         this.texto = texto;
     }

     public String toString() {
         return texto;
     }
}
