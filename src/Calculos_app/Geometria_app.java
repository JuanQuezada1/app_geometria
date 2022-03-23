package Calculos_app;
import java.util.Scanner;

public class Geometria_app {

	private final static short OPCION_RECTANGUNLO_AREA  = 1;
	private final static short OPCION_CIRCULO_RADIO 	= 2;
	private final static short OPCION_CIRCULO_PERIMETRO = 3;
	private final static short OPCION_CIRCULO_AREA 		= 4;
	private final static short OPCION_SALIR 			= 5;
	
	private static short opcionSeleccionada; 
	
	public static void main(String[] args) {
		do {
			menu();
		} while( opcionSeleccionada != OPCION_SALIR );
	}

	private static void menu() {
		System.out.println("MEN�\n==============");
		System.out.println("1. Calcular el �rea de un rect�ngulo");
		System.out.println("2. Calcular el radio de un c�rculo");
		System.out.println("3. Calcular el per�metro de un circulo");
		System.out.println("4. Calcular el �rea de un c�rculo");
		System.out.println("5. SALIR\n");
		
		System.out.println("Seleccione una opci�n del men�:");
		Scanner scanner = new Scanner( System.in );
		opcionSeleccionada = (short) scanner.nextInt();
		
		switch( opcionSeleccionada ) {
			case OPCION_RECTANGUNLO_AREA:
				calcularAreaRectangulo();
				break;
			case OPCION_CIRCULO_RADIO:
				calcularRadioCirculo();
				break;
			case OPCION_CIRCULO_PERIMETRO:
				calcularPerimetroCirculo();
				break;
			case OPCION_CIRCULO_AREA:
				calcularAreaCirculo();
				break;				
		}
	}

	private static void calcularAreaRectangulo() {
		Scanner scanner = new Scanner( System.in );
		System.out.println("Por favor ingrese la medida de la base del rect�ngulo:");
		double base = scanner.nextDouble();
		System.out.println("Por favor ingrese la altura del rect�ngulo:");
		double altura = scanner.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(base, altura);
		double area = rectangulo.calcularArea();
		System.out.printf("El �rea del rect�ngulo es %f %n%n", area);
	}
	
	private static void calcularRadioCirculo() {
		Scanner scanner = new Scanner( System.in );
		System.out.println("Por favor ingrese el di�metro del c�rculo:");
		double diametro = scanner.nextDouble();		
		
		Circulo circulo = new Circulo(diametro);
		double radio = circulo.calcularRadio();
		System.out.printf("El radio del c�rculo es %f %n%n", radio);		
	}
	
	private static void calcularPerimetroCirculo() {
		Scanner scanner = new Scanner( System.in );
		System.out.println("Por favor ingrese el di�metro del c�rculo:");
		double diametro = scanner.nextDouble();		
		
		Circulo circulo = new Circulo(diametro);
		double perimetro = circulo.calcularPerimetro();
		System.out.printf("El per�metro del c�rculo es %f %n%n", perimetro);
	}
	
	private static void calcularAreaCirculo() {
		Scanner scanner = new Scanner( System.in );
		System.out.println("Por favor ingrese el di�metro del c�rculo:");
		double diametro = scanner.nextDouble();		
		
		Circulo circulo = new Circulo(diametro);
		double area = circulo.calcularArea();
		System.out.printf("El �rea del c�rculo es %f %n%n", area);
	}
	
	
}