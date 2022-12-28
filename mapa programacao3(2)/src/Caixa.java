
import java.util.ArrayList;
import java.util.Scanner;




/**
 *
 * @author Simone
 */
public class Caixa {
     ArrayList<Caixa> caixa = new ArrayList();
    
    private int numero;
     private String indEtiqueta;
     private String cor;

   
    Caixa(int numero,String indEtiqueta,String cor) {
        this.numero= numero;
        this.indEtiqueta=indEtiqueta;
        this.cor=cor;
    }
      Caixa(Scanner numero,Scanner indEtiqueta, Scanner cor) {
           }

   
      public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIndEtiqueta() {
        return indEtiqueta;
    }

    public void setIndEtiqueta(String indEtiqueta) {
        this.indEtiqueta = indEtiqueta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    void ColocaCaixa(int numero, String etiqueta, String cor){
    caixa.add(new Caixa(numero,etiqueta,cor));  
    }

    @Override
    public String toString() {
        return "Caixa{" + "numero=" + numero + ", indEtiqueta=" + indEtiqueta + ", cor=" + cor + '}';
    }

    
     
    


   
 
  
  
         
    
}
