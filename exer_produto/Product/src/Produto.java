
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Produto {
    private String nome;
    private int qtde;
    private double valor;
    private double total;
    
    public Produto(){
        this("",0,0.0,0.0);
    }

    public Produto(String nome, int qtde, double valor, double total) {
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void calcTotal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        setNome(scan.next());
        System.out.println("Digite a quantidade adiquirida do produto: ");
        setQtde(scan.nextInt());
        System.out.println("Digite o valor do produto: ");
        setValor(scan.nextDouble());
        total = valor * qtde;
        System.out.println("O valor total da compra é "+total);
        
        
    }
    
}
