package Practica;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Practica {
	// ejemplo visto en la sesion
	static void primerMetodo(int x) {
		System.out.println(x);
	}
	
	//1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
	// Revisar si es un triángulo válido
	// En este caso se trabaja con la formula del triangulo escaleno ya que solo se cuenta con el valor de 3 lados.
	static void triangulo(double a, double b, double c) {
		double semiperimetro = (a+b+c) /2;
		double area = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
		System.out.println("El área del triangulo escaleno es: " + area);
	}
	
	// 2 Escribir un metodo para encontrar el area y la circunferencia de un circulo dado el radio
	// Utilizar PI de la libreria de Java
	static void circulo(double radio) {
		double diametro = 2*radio;
		double circunferencia = Math.PI * diametro;
		double area = Math.PI * radio * radio;
		System.out.println("El area del circulo es: " + area + "\nLa circunferencia del circulo es: " + circunferencia);
	}
	
	// 3 Escribir un metodo que muestre por consola la hora del sistema
	// Utilizar e investigar la libreria de Java
	static void horaSistema() {
		Date date = Date.from(Instant.now());
		System.out.println("La fecha es: " + date);
	}
	
	// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
		// ej 3600 = "1 hora = 60 min = 3600 seg"
	static void segundos(int seg) {
		int hora = seg /3600;
		int minutos = seg/60;
		int segundos = seg;
		System.out.println(seg + " = "+hora+" horas = "+minutos+" minutos = "+ segundos + " segundos");
	}
	// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	static void esfera(double radio) {
		double volumen = (4/3) * Math.PI * radio * radio * radio;
		System.out.println("El volumen de la esfera es: "+radio);
	}
	
	// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	static void cono(double radio, double altura) {
		double volumen = (Math.PI * altura * radio * radio) / 3;
		System.out.println("El volumen del cono es: "+volumen);
	}
	
	// 7 Encontrar el area superficial de un cubo dado un lado a
	static void cubo(double a) {
		double areaSup = 6 * a * a;
		System.out.println("El area superficial del cubo es: "+areaSup);
	}
	
	// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	// Condiciones para que un año sea bisiesto:
    //Es divisible entre 4 y no es divisible entre 100.
	// ó
    //Es divisible entre 100 y 400.
	static void anioBisiesto(int anio) {
		 //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
		if((anio%4==0 && anio%100!=0) || (anio%100==0 && anio%400==0)){
			System.out.println("El anio "+anio+ " es bisiesto");
		} else {
			System.out.println("El anio "+anio+ " NO es bisiesto");
		}
	}
	
	// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
	static void numPrimos(int number) {
		
		while(number>2 && number%2 == 0) {
			System.out.println("No es numero primo");
		}
		System.out.println("Es numero primo");
	}
	
	// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
	static void suma(int number1, int number2) {
		double suma = Math.addExact(number1, number2);
		System.out.println("La suma es: " + suma);
	}
	
	// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
	static void palindromo(int num) {
		char primerDigito = Integer.toString(num).charAt(0);
		char segundoDigito = Integer.toString(num).charAt(1);

		if(primerDigito == segundoDigito) {
			System.out.println("\n" + num + " si es palindromo \n");
		} else {
			System.out.println("\n" + num + " no es palindromo");
		}
	}
	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	static void sumaDigitos(int num) {
		int digito1 = num / 10;
	    int digito2 = num % 10;
	    System.out.println("Suma de digitos"+ digito1 + digito2);
	}
	// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	static void espacios(String cad) {
		String cadSinEspacios = cad.replaceAll(" ", "");
		System.out.println("Cadena sin espacios: " + "'"+ cadSinEspacios +"'");
	}
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	static void invertir(String cad) {
		StringBuilder cadenaInvertida = new StringBuilder(cad);
		cadenaInvertida.append(cad);
	    cadenaInvertida.reverse();
	    System.out.println("Cadena invertida: " + cadenaInvertida);
	    
	}
	// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
	public static int factorial(int num) {
		 if (num == 0) {
		        return 1;
		    } else {
		        return num * factorial(num - 1);
		    }
	}
	
	
	public static void main (String [] args) {
		primerMetodo(7); //invoco a mi metodo para que pueda ejecutarse porque solo se ejecuta lo que está dentro de psvm
		
		triangulo (2,3,4); // ejercicio 1
		circulo(4); //ejercicio 2
		horaSistema(); //ejercicio 3
		segundos(7200); //ejercicio 4
		esfera(5); //ejercicio 5
		cono(3,5); //ejercicio 6
		cubo(2); //ejercicio 7
		anioBisiesto(2004); //ejercicio 8
		numPrimos(7); // ejercicio 9
		suma(4,8); //ejercicio 10
		palindromo(66); // ejercicio 11
		sumaDigitos(25); // ejercicio 12
		espacios("Hola buenas tardes"); // ejercicio 13
		invertir("Anita lava la tina"); // ejercicio 14
		factorial(6); // ejercicio 15
	}
}
