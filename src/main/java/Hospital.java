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
}