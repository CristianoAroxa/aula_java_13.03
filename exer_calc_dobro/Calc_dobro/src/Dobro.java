
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
public class Dobro {
    private double num;
    private double calc;
    
    public Dobro(){
        this(0.0,0.0);
    }

    public Dobro(double num, double calc) {
        this.num = num;
        this.calc = calc;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getCalc() {
        return calc;
    }

    public void setCalc(double calc) {
        this.calc = calc;
    }
    public void calcularDobro(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        setNum(scan.nextDouble());
        calc = num * 2;
        
    }
    public String mostrarCalc(){
       return("O dobro do número é: "+getCalc());
    }
    
}
