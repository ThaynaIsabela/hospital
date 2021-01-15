import java.util.ArrayList;
import java.util.Date;

/**
 * Escreva a descrição da classe Hospital aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Hospital
{
    private ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();

    public void adicionarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }
    
    public void listarPacientes() {
        for (int x = 0; x < this.listaPacientes.size(); x++) {
            Paciente paciente = this.listaPacientes.get(x);
            paciente.listaDados();
        }
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.adicionarPaciente(new PacienteCovid("Paciente com Covid", new Date(), true, true, false, false));
        hospital.adicionarPaciente(new PacienteCardiaco("Paciente Cardiaco", new Date(), true, true, false));
        hospital.listarPacientes();
    }
    
}
