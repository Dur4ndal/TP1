/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glex;

/**
 *
 * @author arrel
 */
public abstract class Personagens {
    protected String nome;
    protected int vida, attackCD;
    protected final int DANO_PORRADA = 1;

    public Personagens(int vida, int attackCD, String nome) {
        this.vida = vida;
        this.attackCD = attackCD;
        this.nome = nome;
    }
    
    public abstract void morrer(int vida);
    public abstract void darPorrada(char SPACE);
    public abstract void andar(char direcao);
    public abstract void interacao(char E);
    public abstract String getNome();
    public abstract void setNome(String nome);
    public abstract int getVida();
    public abstract void setVida(int vida);
    public abstract int getAttackCD();
    public abstract void setAttackCD(int attackcd);
    
    
}
