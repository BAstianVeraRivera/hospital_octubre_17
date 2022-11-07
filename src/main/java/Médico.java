public class Médico {
	private int edad;
	private String nombre;
	private String sexo;
	private String títuloOnline;

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTítuloOnline() {
		return this.títuloOnline;
	}

	public void setTítuloOnline(String títuloOnline) {
		this.títuloOnline = títuloOnline;
	}

	public Médico (String títuloOnline, int edad, String sexo, String nombre){
		this.títuloOnline=títuloOnline;
		this.edad=edad;
		this.sexo=sexo;
		this.nombre=nombre;
	}
}