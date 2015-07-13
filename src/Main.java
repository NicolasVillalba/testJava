import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas[] personas = new Personas[5];
		
		//personas[1] = new Personas(23344, "Nicolas", "Masculino", 32);
		
		for(int i = 0; i < 5; i++){
			System.out.println("Ingresar dni");
			int dni = new Scanner(System.in).nextInt();
			System.out.println("Ingresar Nombre");
			String nombre = new Scanner(System.in).next();
			System.out.println("Ingresar Sexo");
			String cadena = new Scanner(System.in).next();
			Sexo sexo = Sexo.asignarSexo(cadena);
			System.out.println("Ingresar Edad");
			int edad = new Scanner(System.in).nextInt();
		    personas[i] = new Personas(dni, nombre, sexo, edad);
		}
		
		Ordenando.ordenarPorDni(personas);
		
		for(int i = 0; i < 5; i++){
			System.out.println(personas[i].toString());
		}
		
		System.out.println("-----------------");
		
		//Ordenando.ordenarPorNombreDec(personas);
		
		Arrays.sort(personas, new Comparator<Personas>(){
			public int compare(Personas per, Personas per2){
				return per.getNombre().compareTo(per.getNombre());
			}
		});
		
		for(int i = 0; i < 5; i++){
			System.out.println(personas[i].toString());
		}
		
		System.out.println("Ingresar Nombre: ");
		
		String nombreBuscado = new Scanner(System.in).next();
		
		Ordenando.busqueBinaria(personas, nombreBuscado);
	}
}
