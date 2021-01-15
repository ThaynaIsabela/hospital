import java.util.Date;

/**
 * Classe abstrata Paciente - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Paciente implements Pessoa
{
    private String nome;
    private Date dataNascimento;
    
    public Paciente(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
  
    
    public abstract boolean ficarIsolado();
    public abstract void listaDados();
    
}
