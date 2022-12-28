
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simone
 */
public class Revista {
     ArrayList<Revista> revista = new ArrayList();
ArrayList<Caixa> ccaixa= new ArrayList();
   
    private String nomeRevista;
    
    private String numeroEdicao,ano;
    private Caixa caixa;

 Revista(String n, String e, String a, ArrayList<Caixa> ccaixa) {
     this.nomeRevista=n;
     this.numeroEdicao=e;
     this.ano=a;
     this.ccaixa= new ArrayList();
       
    }

  

  

   

  
    public String getNomeRevista() {
        return nomeRevista;
    }

    public void setNomeRevista(String nomeRevista) {
        this.nomeRevista = nomeRevista;
    }

   
  
    public String getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(String numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Revista(String nomeRevista, String numeroEdicao,String ano,Caixa caixa) {
      this. nomeRevista=nomeRevista;
        this.numeroEdicao=numeroEdicao;
        this.ano=ano;
        this.caixa=caixa;
    }
   public int ColocaRevista(String n, String e,String a,Caixa caixa){
        int j=2;
         revista.add(new Revista(n, e, a, caixa.caixa.get(j)));
         j++;
         return j;
    }
    
   

    @Override
    public String toString() {
        return "{" + "Revista= " + nomeRevista + ", Edicao=" + numeroEdicao + ", ano=" + ano+" "  + caixa + '}';
    }

   
   

   
                 
      
      
        
}
 