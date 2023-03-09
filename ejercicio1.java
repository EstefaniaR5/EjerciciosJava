package Practica;

import java.time.Instant;
import java.util.Date;

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

	
	public static void main (String [] args) {
		primerMetodo(7); //invoco a mi metodo para que pueda ejecutarse porque solo se ejecuta lo que está dentro de psvm
		
		triangulo (2,3,4); // ejercicio 1
		circulo(4); //ejercicio 2
		horaSistema(); //ejercicio 3
		segundos(7200); //ejercicio 4
		esfera(5); //ejercicio 5
		cono(3,5); //ejercicio 6
		cubo(2); //ejercicio 7
		
	}
}
