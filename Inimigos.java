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
public class Inimigos extends Personagens implements InterfaceInimigos{
    protected boolean perseguindo = false;
    
    public Inimigos(int vida, int attackCD, String nome) {
        super(vida, attackCD, nome);
    }

    @Override
    public void morrer(int vida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void darPorrada(char SPACE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void andar(char direcao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void interacao(char E) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        if (nome.equals("null")) {
            this.nome = nome;
        }
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getAttackCD() {
        return this.attackCD;
    }

    @Override
    public void setAttackCD(int attackcd) {
        this.attackCD = attackcd;
    }

    @Override
    public boolean iniciarCacada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
