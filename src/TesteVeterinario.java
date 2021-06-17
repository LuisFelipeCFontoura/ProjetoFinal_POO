
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class TesteVeterinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String opcao = "s";
        
        List<Animal> listaAnimal = new ArrayList<>();
       
        
        while(!opcao.equalsIgnoreCase("n")){
            String texto;
            texto = "Digite sue opção: \n" +
                    "1 - Adicionar Animal \n" +
                    "2 - Remover Consulta Agendada \n" + 
                    "3 - Listar Consultas agendadas \n" +
                    "\n" +
                    "n - Sair ";
            opcao = JOptionPane.showInputDialog(texto);
            
            switch (opcao){
                case "1": 
                    Animal a = new Animal();
                    
                    int codigo = Integer.valueOf (JOptionPane.showInputDialog("Código: "));
                    a.setCodigo(codigo);
                    
                     String tipoAnimal = JOptionPane.showInputDialog("Tipo do pet (gato, cachorro,...):");
                    a.setTipoAnimal(tipoAnimal);
                    
                    String nome = JOptionPane.showInputDialog("Nome do pet:");
                    a.setNome(nome);
                    
                    String data = JOptionPane.showInputDialog("Data da Consulta:");
                    a.setData(data);
                    
                    String hora = JOptionPane.showInputDialog("Hora da Consulta:");
                    a.setHora(hora);
                    
                   /* Double preco = Double.valueOf (JOptionPane.showInputDialog("Valor:"));
                    a.setPreco(preco);*/
                    
                    String porte = JOptionPane.showInputDialog("Qual o porte do pet (p, m, g):");
                    a.setPorte(porte);
                    a.calculaPrecoConsulta();
                    
                    listaAnimal.add(a);
                    
                    break;
                    
                case "2": 
                    int posicao = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição da consulta que deseja remover:"));
                    listaAnimal.remove(posicao);
                    break;
                    
                case "3":
                    String conteudo = "";
                    for (Animal animal : listaAnimal) {
                        conteudo += animal.imprimir() + "\n";
                       
                    }
                    JOptionPane.showConfirmDialog(null, conteudo);
                    break;                  
                    
                                 
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Incorreta");    
                
            }    
                    
        }    
            
    }
    
}
