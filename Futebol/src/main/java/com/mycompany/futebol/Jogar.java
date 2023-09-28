package com.mycompany.futebol;
/* @author artuenric */
public interface Jogar {
    public abstract void tocar(Jogador companheiro);
    public abstract void chutar();
    public abstract void pedirPosse();
    public abstract void correr();
    public abstract void driblar(Jogador adversaerio);
    public abstract void chamarSubstituicao(Jogador companheiro);
}
