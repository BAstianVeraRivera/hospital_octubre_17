import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GestosDeDatos {
    public static Hospital leerArchivoPaciente(Hospital hospital,String direccion){
        String texto = " ";
        try{
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                hospital.getPacientes().add(new Paciente(data[0],Integer.parseInt(data[1]),data[2], data[3],Integer.parseInt(data [4])));
            }
        }catch(Exception e){
            System.err.println("No se encontró el archivo");
        }
        return null;
    }
    public static Hospital leerArchivoMedico(Hospital hospital,String direccion){
        String texto = " ";
        try{
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                hospital.getMédicos().add(new Médico (data[0],Integer.parseInt(data[1]),data[2],data[3]));
            }
        }catch(Exception e){
            System.err.println("No se encontró el archivo");
        }
        return null;
    }
    public static boolean registrarMedico(Médico medico, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(medico.toString());
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar médico");
            return false;
        }
    }
    public static boolean registrarPaciente(Paciente paciente, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(paciente.toString());
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar paciente");
            return false;
        }
    }
}
