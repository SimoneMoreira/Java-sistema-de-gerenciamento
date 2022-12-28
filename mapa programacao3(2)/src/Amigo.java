
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simone
 */
public class Amigo {
    private String nomeAmigo;

    public Amigo(String nomeAmigo, String telefone, String local) {
        this.nomeAmigo = nomeAmigo;
        this.telefone = telefone;
        this.local = local;
    }
    private String telefone;
    private String local;

    Amigo(String nomeAmigo) {
       this.nomeAmigo = nomeAmigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getlocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }
 
    

    @Override
    public String toString() {
        return "{"  + nomeAmigo + ", telefone=" + telefone + ", local=" + local + '}';
    }
   
    
}