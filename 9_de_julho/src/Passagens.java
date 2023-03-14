
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
public class Passagens {
    private String nomePassageiro;
    private String telefone;
    private String RG;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;
    
    public Passagens(){
        this("","","","","","","");
    
}

    public Passagens(String nomePassageiro, String telefone, String RG, String localViagem, String data, String horario, String numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.RG = RG;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
   
    public void cadastrarPassageiros(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do passageiro: ");
        setNomePassageiro(scan.next());
        System.out.println("Digite o telefone do passageiro: ");
        setTelefone(scan.next());
        System.out.println("Digite o RG do passageiro: ");
        setRG(scan.next());
            
    }
    
    public  void cadastrarDadosPassagem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o destino da viagem: ");
        setLocalViagem(scan.next());
        System.out.println("Digite a data da viagem: ");
        setData(scan.next());
        System.out.println("Digite o horário da viagem: ");
        setHorario(scan.next());
        System.out.println("Digite o número da poltrona: ");
        setNumPoltrona(scan.next());
    }
    
    public void mostrarDadosPassageiro(){
        System.out.println("Dados do passageiro: \n Nome: "+getNomePassageiro()+ "\n Telefone: " +getTelefone()+ "\n RG: "+getRG());
        
    }
    
    public void mostrarDadosPassagem(){
        System.out.println("Insformações da passagem:\n Destino:  "+getLocalViagem()+"\n Data: "+getData()+"\n Poltrona: "+getNumPoltrona());
    }
}
 

