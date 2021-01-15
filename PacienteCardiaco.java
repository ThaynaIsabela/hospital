import java.util.Date;

/**
 * Escreva a descrição da classe PacienteCardiaco aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class PacienteCardiaco extends Paciente
{
    private boolean temCansaco;
    private boolean temTontura;
    private boolean temNausea;
    
    public PacienteCardiaco(String nome, Date dataNascimento, boolean  temCansaco, boolean temTontura, boolean temNausea) {
        super(nome, dataNascimento);
        this.temCansaco = temCansaco;
        this.temTontura = temTontura;
        this.temNausea = temNausea;
    }

    public boolean ficarIsolado() {
        return false;
    }

    
    public void listaDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sintomas:");
        System.out.println("  -> Tem Cansaco? " + (this.temCansaco ? "Sim" : "Não"));
        System.out.println("  -> Tem Tontura? " + (this.temTontura ? "Sim" : "Não"));
        System.out.println("  -> Tem Nausea? " + (this.temNausea ? "Sim" : "Não"));
        System.out.println("");
    }
    
}
