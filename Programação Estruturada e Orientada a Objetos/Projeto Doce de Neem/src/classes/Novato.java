package classes;

import java.util.Random;

/**
 *
 * @author Isabelle
 */
public class Novato {

    private Cliente cliente;
    private String nome;
    private int ano;
    private char curso;
    private int nivCharme;
    private int nivMoral;
    private int nivPop;
    private int nivAgilidade;
    private boolean insistencia;
    private int vidas;
    private int pontos;
    private char nivel; //f é fácil/m é médio/ d é difícil

    public char getCurso() {
        return curso;
    }

    public void setCurso(char curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivCharme() {
        return nivCharme;
    }

    public int getNivMoral() {
        return nivMoral;
    }

    public void setNivMoral(int moral) {
        this.nivMoral = moral;
    }

    public int getNivPop() {
        return nivPop;

    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {

        this.vidas = vidas;
    }

    public int getNivAgilidade() {
        return nivAgilidade;
    }

    public void setNivAgilidade(int nivAgilidade) {
        this.nivAgilidade = nivAgilidade;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setNivCharme(int nivCharme) {
        this.nivCharme = nivCharme;
    }

    public void setNivPop(int nivPop) {
        this.nivPop = nivPop;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isInsistencia() {
        return insistencia;
    }

    public void setInsistencia(boolean insistencia) {
        this.insistencia = insistencia;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public boolean testarEmpatia() {
        if (this.getCurso() == this.getCliente().getCurso()) {
            this.getCliente().setChance(10);

            this.getCliente().setEmpatia(true);
            return true;

        } else { //Fazer mais else/if para cada curso???
            this.getCliente().setEmpatia(false);
            return false;
        }
    }

    public void jogarCharme() {//Ao clicar no botao 
        if (this.getNivCharme() > 0) {
            this.setNivCharme(this.getNivCharme() - 1);
            this.getCliente().setChance(this.getCliente().getChance() + 5);
            //lembrando que a influencia é em porcentagem
        } else {
            this.setNivCharme(0);
        }

    }

    public boolean insistencia() {
        //Se aumenta a insistencia, cai a popularidade e moral
        if (this.isInsistencia() == true) {
            this.getCliente().setChance(this.getCliente().getChance() + 5);
            this.setNivPop(this.getNivPop() - 1);
            this.setNivMoral(this.getNivMoral() - 1);
        }
        if (this.getCliente().getAno() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ajudaAc() {
        if (this.getCliente().getAno() == 1 || this.getCliente().getAno() == 2) {
            return true;
        } else {
            return false;
        }
    }

    public void usarAgilidade() {
        this.setNivAgilidade(this.getNivAgilidade() - 1);
        this.getCliente().setChance(this.getCliente().getChance() + 5);
    }

}
