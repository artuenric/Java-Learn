package com.gui.botoes;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Botao extends JButton implements ActionListener {

    public Botao(JFrame janela){
    setText("Olá");
    setLayout(null); // Obriga p layout a ser criado do 0
    setBounds(100, 200, 200, 80); // Localização e tamanho
    setFont(new Font("Arial", Font.BOLD, 30)); // Fontes
    setForeground(new Color(255, 0, 0)); // Cor do texto
    setBackground(Color.black); // Cor do bakcground
    
    this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "oihi", "teste", 2);
        System.exit(1);
    }
}
