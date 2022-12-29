
package aula02;

public class Aula02 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
       c1.modelo = "BIC CRISTAL";
       c1.cor="AZUL";
       c1.carga = 80;
      // c1.tampada = false;
       c1.tampar();
       c1.ponta = 0.05f;
       c1.rabiscar();
       c1.status();
       
    }
    
}
