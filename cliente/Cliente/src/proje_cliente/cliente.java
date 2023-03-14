/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_cliente;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class cliente {
   private  String nome;
   private  String end;
   private  String rg;

    public cliente() {
        this("","","");
    }

    public cliente(String nome, String end, String rg) {
        this.nome = nome;
        this.end = end;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
   
    public void cadastrarCliente(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        setNome(scan.next());
        System.out.println("Digite o endereço do cliente: ");
        setEnd(scan.next());
        System.out.println("Digite o RG do cliente: ");
        setRg(scan.next());
        
    } 
   public void listarClientes(){
       System.out.println("Os dados do cliente são: Endereço " +getEnd()+ "\n Nome: "+getNome()+ "\n RG: "+getRg());
   }
    
}
