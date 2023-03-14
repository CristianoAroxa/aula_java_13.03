
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
public class Mult {
    private int valor;
    private int result;
    
  public Mult(){
      this(0,0);
  } 

    public Mult(int valor, int result) {
        this.valor = valor;
        this.result = result;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
  public void multiplicacao4(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Digite um número: ");
      setValor(scan.nextInt()); 
      result = valor * 4;
  }
  
  public String mostrarMultiplicacao(){
     return ("O resultante da multiplicação é: "+getResult());
      
  }
}
