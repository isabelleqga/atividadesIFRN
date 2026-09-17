package classes;

/**
 *
 * @author Isabelle
 */
public class Cliente {

    private char curso; //dependendo do curso do usuario, vai ter mais ou menos empatia
    private int humor;
    private boolean empatia;
    private int ano;
    private int turno;
    private boolean resp;
    private int valor;
    //Os dois atributos a seguir são como porcentagem de influência(ou convencimento)
    private int chance;//se sua tática está surtindo efeito positivo

    public char getCurso() {
        return curso;
    }

    public void setCurso(char curso) {
        this.curso = curso;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public boolean isEmpatia() {
        return empatia;
    }

    public void setEmpatia(boolean empatia) {
        this.empatia = empatia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public boolean isResp() {
        return resp;
    }

    public void setResp(boolean resp) {
        this.resp = resp;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int influenciaPositiva) {
        this.chance = influenciaPositiva;
    }

}
