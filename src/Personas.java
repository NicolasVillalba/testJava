
public class Personas implements Comparable<Personas>{
	private int dni;
	private String nombre;
	private Sexo sexo;
	private int edad;
	
	public Personas(int dni, String nombre, Sexo sexo, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public int getEdad() {
		return edad;
	}
	
	public int compareTo(Personas o){
		
			if(this.dni > o.dni){
				return 1;
			}
			if(this.dni < o.dni){
				return -1;
			}
			return 0;
	}
	
	public boolean nombreMayorQue(Object o){
		if(o instanceof Personas){
			Personas obj = (Personas)o;
			String miNombre = this.nombre;
			if(miNombre.compareTo(obj.getNombre()) > 0){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Personas [dni=" + dni + ", nombre=" + nombre + ", sexo=" + sexo
				+ ", edad=" + edad + "]";
	}
	
	
}
