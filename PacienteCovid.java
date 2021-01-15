import java.util.Date;

/**
 * Escreva a descrição da classe PacienteCovid aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class PacienteCovid extends Paciente
{
    private boolean temGripe;
    private boolean temDorGarganta;
    private boolean temDiarreia;
    private boolean temDorCabeca;
    
    public PacienteCovid(String nome, Date dataNascimento, boolean temGripe, boolean temDorGarganta, boolean temDiarreia, boolean temDorCabeca) {
        super(nome, dataNascimento);
        this.temGripe = temGripe;
        this.temDorGarganta = temDorGarganta;
        this.temDiarreia = temDiarreia;
        this.temDorCabeca = temDorCabeca;
    }
    
    public boolean ficarIsolado() {
        return ((temGripe && temDorGarganta) || (temGripe && temDiarreia) || (temGripe && temDorCabeca));
    }
    
    
    public void listaDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data Nascimento: " + this.getDataNascimento().toString());
        System.out.println("Sintomas:");
        System.out.println("  -> Tem Gripe? " + (this.temGripe ? "Sim" : "Não"));
        System.out.println("  -> Tem Dor de Garganta? " + (this.temDorGarganta ? "Sim" : "Não"));
        System.out.println("  -> Tem Diarria? " + (this.temDiarreia ? "Sim" : "Não"));
        System.out.println("  -> Tem Dor de Cabeça? " + (this.temDorCabeca ? "Sim" : "Não"));
        System.out.println("");
    }
}
