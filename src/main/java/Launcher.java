public class Launcher {

	public static void main(String [] args) {
		inicializar();
	}

	public static void inicializar() {
		Hospital hospital = new Hospital("Hospital Quepe");
		Paciente paciente1= new Paciente("No es jugador de LOL",37,"Masculino","Cristiano Ronaldo", 20106947-5);
		Médico doctor1 = new Médico("Título presencial", 29,"Masculino", "Alejandro Fernandez");
		Médico doctor2 = new Médico("Título online", 34,"Femenino", "Silvia Muñoz Neira");
		hospital.agregarPaciente(paciente1);
		hospital.contratarMédico(doctor1);
		hospital.despedirMédico(doctor2);
	}
}
