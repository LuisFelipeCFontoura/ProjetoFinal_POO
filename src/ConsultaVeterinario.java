/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public abstract class ConsultaVeterinario {
    
    //Atributos (variáveis) da classe
    protected int codigo; //protected: modificador de acesso
    protected String data;
    protected String hora;
    protected double preco;

    //método construtor vazio
    public ConsultaVeterinario() { }

    //método construtor com atributos da classe
    public ConsultaVeterinario(int codigo, String data, String hora, double preco) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
    }

   //inicio métodos get/set
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getData() {
        return data;
    }

   
    public void setData(String data) {
        this.data = data;
    }

   
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
    public double getPreco() {
        return preco;
    }

    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    //fim métodos get/set
    
    //método da classe - foi sobrescrito nas classes filhas  
    public String imprimir(){
        return "\nCódigo: "+ codigo +"\nData: " + data + "\nHora: " + hora + "\nTipo: " + preco;
    }
    
    //métodos abstratos-devem ser implementados nas classes filhas
    public abstract void cadastrar();
    
    public abstract void excluir();

    
        
    
}
//Fim da classe ConsultaVeterinário