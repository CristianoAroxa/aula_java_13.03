
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
public class Media_matematica {
    private double num1;
    private double num2;
    private double media;
    private String nome;
    
    public Media_matematica(){
        this(0.0,0.0,0,"");
    }

    public Media_matematica(double num1, double num2, double media, String nome) {
        this.num1 = num1;
        this.num2 = num2;
        this.media = media;
        this.nome = nome;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void calcularMedia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        setNum1(scan.nextDouble());
        System.out.println("Digite a segunda nota: ");
        setNum2(scan.nextDouble());
        System.out.println("Digite o nome do Aluno: ");
        setNome(scan.next());
        media = (num1+num2)/2;
        System.out.println("A média do: " +nome+ " é: "+media);
    }
    
 
}
