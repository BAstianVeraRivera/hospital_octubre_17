import java.util.ArrayList;

public class Hospital {
	private String nombreHospital;
	public ArrayList<Médico> médicos = new ArrayList<Médico>();
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

	public String getNombreHospital() {
		return this.nombreHospital;
	}

	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}

	public Paciente buscarPaciente(String nombre){
		for(Paciente paciente:this.pacientes){
			if(paciente.getNombre().equals(nombre)){
				return paciente;
			}
		}
		return null;
	}

	public Médico buscarMédico(String títuloOnline, int edad, String sexo, String nombre){
		for(Médico medico:this.médicos){
			if(medico.getNombre().equals(nombre)){
				return medico;
			}
		}
		return null;
	}

	public void agregarPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
		System.out.println("Paciente agregado");
	}
	public void contratarMédico(Médico doctor) {
		this.médicos.add(doctor);
		System.out.println("Médico contratado");
		}
	public void despedirMédico(Médico doctor) {
		this.médicos.remove(doctor);
		System.out.println("Médico despedido");

	}
	public Hospital (String nombreHospital){
		this.nombreHospital=nombreHospital;
	}

}



