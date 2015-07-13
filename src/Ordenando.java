import java.util.*;

public class Ordenando {

	public static void ordenarPorNombreAsc(Personas[] o){
		Personas temp;
		for(int i = 0; i < o.length; i++){
			for(int j = 0; j <= i; j++){
				if(o[i].nombreMayorQue(o[j])){
					temp = o[j];
					o[j] = o[i];
					o[i] = temp;
				}
				
			}
		}
	}
	
	public static void ordenarPorNombreDec(Personas[] o){
		Personas temp;
		for(int i = 0; i < o.length; i++){
			for(int j = 0; j <= i; j++){
				if(o[i].getNombre().compareTo(o[j].getNombre()) < 0){
					temp = o[j];
					o[j] = o[i];
					o[i] = temp;
				}
				
			}
		}
	}
	
	public static void ordenarPorDni(Personas[] o){
		Arrays.sort(o);
	}
	
	public static void busqueBinaria(Personas[] o, String aguja){
		int inf = 0, sup = o.length - 1, bingo = 0;
		while(inf <= sup && bingo == 0){
			int medio = (inf + sup)/2;
			if(o[medio].getNombre().compareTo(aguja) == 0 ){
				System.out.println("Bingo");
				bingo = 1;
			}else{
				if(o[medio].getNombre().compareTo(aguja) == 1){
					sup = medio -1;
				}else{
					inf = medio + 1;
				}
			}
		}
	}
	
}
