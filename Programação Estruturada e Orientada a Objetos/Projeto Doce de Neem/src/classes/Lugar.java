package classes;

/**
 *
 * @author Isabelle
 */
public class Lugar {

    private Novato novato;
    private char nome;
    private int quantAlunos;
    private int quantServidores;
    private int quantTotal;
    private int dificuldade;
    private int cliques;

    public Lugar(int quantAlunos, int quantServidores, int dificuldade) {
        this.quantAlunos = quantAlunos;
        this.quantServidores = quantServidores;
        this.dificuldade = dificuldade;
    }

    public Novato getNovato() {
        return novato;
    }

    public void setNovato(Novato novato) {
        this.novato = novato;
    }

    public char getNome() {
        return nome;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public int getQuantServidores() {
        return quantServidores;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public void setQuantServidores(int quantServidores) {
        this.quantServidores = quantServidores;
    }

    public int getQuantTotal() {
        return quantTotal;
    }

    public void setQuantTotal(int quantTotal) {
        this.quantTotal = quantTotal;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getCliques() {
        return cliques;
    }

    public void setCliques(int cliques) {
        this.cliques = cliques;
    }

}
