import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Simone
 */
public class Colecao {
   
    ArrayList<Revista> nomeColecao = new ArrayList();
    

   

   
    
     public void addColecao(Revista revista ){
        nomeColecao.add(revista);
               
     }        

     @Override
    public String toString() {
        return "Colecao{" + "nomeColecao=" + nomeColecao + '}';
    }
     
   
public void imprimir(){
    
  for(int i=0;i<nomeColecao.size();i++){
    System.out.println(nomeColecao.get(i));
    }

}
 
 
}