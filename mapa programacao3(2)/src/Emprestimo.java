




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simone
 */
public class Emprestimo{
    private String Data ;
   private String devolucao;
            Amigo amigo;
            Revista revista;

   
    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

  

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }


  public Emprestimo(Amigo amigo,String data,String devolucao,Revista revista){
      this.amigo=amigo;
      this.Data=data;
      this.devolucao=devolucao;
      this.revista=revista;
  }

    @Override
    public String toString() {
        return "Emprestimo{" + "Data=" + Data + ", devolucao=" + devolucao + ", amigo=" + amigo + ", revista=" + revista + '}';
    }

  
  

      
 
  
  }
      
 

