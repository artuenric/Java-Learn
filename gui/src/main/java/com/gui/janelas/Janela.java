package com.gui.janelas;

import javax.swing.JFrame;
import com.gui.botoes.Botao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Janela extends JFrame {
    public Janela(){
        setTitle("Janela 1"); // Título
        setVisible(true); // Visibilidade
        setSize(1080, 720); // Tamanho
        setResizable(false); // Tamanho fixo da tela
        setLocationRelativeTo(null); // Centraliza
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha ao clicar no botão X
        setLayout(null); // Obriga o layout a ser construído do zero
        
        Botao b = new Botao(this);      
        add(b);

    }   

    
}
