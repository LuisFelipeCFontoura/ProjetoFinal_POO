/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Animal extends ConsultaVeterinario {

    //atributos (variáveis)
    private String nome;
    private String porte;
    private String tipoAnimal;

    //método construtor vazio
    public Animal() { }
    
    //método construtor somente com os atributos da classe
    public Animal(String nome, String porte, String tipoAnimal) {
        this.nome = nome;
        this.porte = porte;
        this.tipoAnimal = tipoAnimal;
    }
    
    //método construtor com atributos da classe abstrata "ConsultaVeterinario"
    public Animal(String nome, String porte, String tipoAnimal, int codigo, String data, String hora, double preco) {
        super(codigo, data, hora, preco);
        this.nome = nome;
        this.porte = porte;
        this.tipoAnimal = tipoAnimal;
    }

     //início métodos get e set
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getPorte() {
        return porte;
    }

    
    public void setPorte(String porte) {
        this.porte = porte;
    }

    
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    //fim métodos get e set
    
    //métodos sobrescritos-poliformismo
    
    @Override
     public String imprimir(){
        return "\nCódigo: "+ codigo +"\nNome do Pet: " + nome +"\nData: " + data + "\nHora: " + hora + "\nPreço da Consulta: " + preco + "\nTipo: " + tipoAnimal;
    }
    @Override
    public void cadastrar(){
        
    }        
    @Override
    public void excluir(){
        
    }
    
    /*método específico da classe: 
        informa o valor da consulta conforme o porte do animal*/
     public double calculaPrecoConsulta(){
         preco=0;
         if(porte.equalsIgnoreCase("p") ){
             this.preco=30.00;
         }else if(porte.equalsIgnoreCase("m")){
             this.preco=40.00;
         } else {
             this.preco=50.00;
         }
     return preco;
     }
    
    
    
}

//fim da classe Animal
