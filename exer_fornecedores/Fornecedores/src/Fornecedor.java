
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
public class Fornecedor {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;
    
    public Fornecedor(){
        this("","","");
    }

    public Fornecedor(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public void cadastrarFornecedor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do fornecedor: ");
        setNomeFornecedor(scan.next());
        System.out.println("Digite o nome do produto: ");
        setNomeProduto(scan.next());
        System.out.println("Digite a descrição do produto: ");
        setDescricaoProduto(scan.next());        
        
    }
   public String listarFornecedor(){
       return("Forncedor: "+getNomeFornecedor()+"\nProduto:"+getNomeProduto()+"\nDescrição: "+getDescricaoProduto());
   }

}
   
