package com.mycompany.futebol;
/* @author artuenric */
public class Futebol {

    public static void main(String[] args) {
        /* Criando os jogadores */
        Jogador arthurLevinho = new Jogador("Arthur", 10, "Meia");
        Jogador caioPesadao = new Jogador("Caio", 24, "Ponta");
        Jogador yuriGoleiro = new Jogador("Yuri", 1, "Goleiro");
        
        /* Colocando os jogadores em campo */
        arthurLevinho.setEmCampo(true);
        yuriGoleiro.setEmCampo(true);
        
        /* Jogo */
        arthurLevinho.setPosse(true);
        arthurLevinho.correr();
        arthurLevinho.chutar();
        yuriGoleiro.setPosse(true);
        yuriGoleiro.tocar(arthurLevinho);
        yuriGoleiro.chamarSubstituicao(caioPesadao);
        arthurLevinho.driblar(caioPesadao);
        caioPesadao.correr();
        caioPesadao.chamarSubstituicao(yuriGoleiro);
    }
}
