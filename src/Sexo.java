
public enum Sexo {
	MASCULINO,
	FEMENINO;
	
	public static Sexo asignarSexo(String cadena){
		if(cadena.equalsIgnoreCase("m") || cadena.equalsIgnoreCase("masculino")){
			return MASCULINO;
		}else{
			return FEMENINO;
		}
	}
}
