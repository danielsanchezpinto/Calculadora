import java.util.Scanner;

public class Operacion {
	private double num1;
	private double num2;
    
	public Operacion() {
		super();
		
	}

	public Operacion(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
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
	 public double sumar () { 
			  double resultado; 
			  resultado = num1+num2; 
		  	return resultado; 
	 }
	 public double restar () { 
		  double resultado; 
		  resultado = num1-num2; 
	  	return resultado; 
}
	 public double mul () { 
		  double resultado; 
		  resultado = num1*num2; 
	  	return resultado; 
}
	 public double divi () { 
		  double resultado; 
		  resultado = num1/num2; 
	  	return resultado; 
}
	 public double potenciacion () { 
		 double resultado=(int)Math.pow(num1, num2);
		 return resultado;
}
	 public double raiz () { 
		 double resultado=Math.sqrt(num1);
		 return resultado;
	 }
	 public double leer() {
		 Scanner teclado;
		teclado= new Scanner(System.in);
		 double n;
		 System.out.println();
		 System.out.print("Introducir numero:");
	        n=teclado.nextDouble();
			return n;
		}
	 public String leerCalculo() {
		 Scanner teclado;
		teclado= new Scanner(System.in);
		String opera;
		System.out.println("Introducir  + - * / ^ %");
		System.out.print("Introducir operación:");
	    opera=teclado.next();
			return opera;
		}
}
