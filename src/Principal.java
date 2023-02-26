
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
	
	

	public static void main(String[] args) {
		
		Scanner teclado;
		teclado= new Scanner(System.in);
		double num1, num2;
		String operacion;
		char respu;
		char letrarespu;
		double resul=0;
		Operacion c;  
		
        do{
        c=new Operacion(); 
       
        num1=c.leer();
        num2=c.leer();
        //c=new CalculadoraEJ_7(num1,num2); 
        c.setNum1(num1);
        c.setNum2(num2); 
        operacion=c.leerCalculo();
     
        switch (operacion){
        case "+":
            resul=c.sumar();
            break;
        case "-":
            resul=c.restar();
            break;
        case "*":
            resul=c.mul();
            break;
        case "/":
            resul=c.divi();
            break;
        case "^":
            resul=c.potencia();
            break;
        case "%":
            resul=c.modulo();
            break;
        }
        System.out.println("Resultado operación:"+resul);
     
        System.out.println() ;
        System.out.println("Quieres realizar otra operación (S/N): ");
     
        letrarespu = teclado.next().charAt(0);
        letrarespu = Character.toUpperCase(letrarespu );
		while ((letrarespu != 'S') && (letrarespu != 'N'))
		{
			System.out.println("Error teclea (S/N): ");
		
			letrarespu = teclado.next().charAt(0);
		    letrarespu = Character.toUpperCase(letrarespu );
		}
		
	}while (letrarespu == 'S');
     
	}
	
      }