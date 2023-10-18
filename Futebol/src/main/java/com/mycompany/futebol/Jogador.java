package com.mycompany.futebol;
/*@author artue*/
public class Jogador implements Jogar{
    private String nome;
    private int numero;
    private String posicao;
    private boolean emCampo;
    private boolean posse;
    
    // Construtor
    public Jogador(String nome, int numero, String posicao) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
        // Jogador começa não emCampo, consequentemente, sem posse de bola
        this.emCampo = false;
        this.posse = false;
    }
    
    // Status
    
    public void status(){
        System.out.println(this.getNome());
        System.out.println(this.getNumero());
        System.out.println(this.getPosicao());
        
        if (this.isEmCampo()){
            System.out.println("Está jogando.");
        } 
        else{
            System.out.println("No banco");
        }
    }
    // Setters e Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean isEmCampo() {
        return emCampo;
    }

    public void setEmCampo(boolean emCampo) {
        this.emCampo = emCampo;
    }

    public boolean isPosse() {
        return posse;
    }

    public void setPosse(boolean posse) {
        this.posse = posse;
    }
    
    // Métodos da interface

    @Override
    public void pedirPosse() {
       if (this.isEmCampo() == false){
            System.out.println("O jogador " + this.getNome() + " não está escalado.");
       } else if (this.isPosse() == false){
            System.out.println("Número " + this.getNumero() + " pede a bola...");
            this.setPosse(true);
       } else {
           System.out.println(this.getNome() + " com a bola...");
       }
    }
    
    @Override // Isso sobescreve os métodos abstratos
    public void tocar(Jogador companheiro) {
        if (this.isEmCampo() == false){
            System.out.println("O jogador " + this.getNome() + " não está escalado.");
        } 
        
        else if (this.isPosse()){
            System.out.println("Camisa " + this.getNumero() + " toca a bola para o " + companheiro.getNumero());
            companheiro.setPosse(true);
            this.setPosse(false);
        } 
        else {
            System.out.println(this.getNome() + " está perdido no jogo...");
        }
    }

    @Override
    public void chutar() {
       if (this.isEmCampo() == false){
           System.out.println("O jogador " + this.nome + " não está escalado.");
       } 
       else if (this.isPosse()){
           this.setPosse(false);
           System.out.println(this.nome + " tenta o chute!!!");
       } 
       else if (! this.isPosse()){
           System.out.println(this.getNome() + " está perdido no jogo...");
       }
    }

    @Override
    public void correr() {
       if (this.isEmCampo() == false){
           System.out.println("O jogador " + this.getNome() + " não está escalado.");
       }
       else {
           System.out.println("Camisa " + this.getNumero() + " correndo feito doido, muito pesaado!");
       }
    }

    @Override
    public void driblar(Jogador adversario) {
       if (this.isEmCampo() == false){
           System.out.println("O jogador " + this.getNome() + " não está escalado.");
       } else if (this.isPosse()){
           System.out.println(this.getNome() + "... Credo! Meteu um drible lindo no " + adversario.getNome() + "!");
       }
    }

    @Override
    public void chamarSubstituicao(Jogador companheiro) {
        if (this.isEmCampo()){
            System.out.println("Ih! " + this.getNome() + " tá pedindo ali substituição...");
            if (companheiro.isEmCampo()){
                System.out.println("Olha que coisa, o camisa " + companheiro.getNumero() + " já está em campo...");
            }
            else {
                companheiro.setEmCampo(true);
                System.out.println("Quem entra agora é " + companheiro.getNome() + "!");
            }
        } 
        else {
            System.out.println("Olha só que doido, " + this.getNome() + " nem tá em campo e tá pedindo substituição...");
        }
    
    }

    
}
