package exerciciosJailson;

import javax.swing.*;  
import java.awt.event.*;  
public class TextField implements ActionListener {  
    // implemento de resultado campo de texto 
    JTextField campoTexto1, campoTexto2, campoTexto3;  
    JButton soma, subtracao, multiplicacao, divisao; 
    // Constructor  
    TextField() {  
        // Criacao de um frame (quadro)
        JFrame quadro = new JFrame("Calculadora Flamingo");         
        // Criar JTextField objetos  
        campoTexto1 = new JTextField();  
        campoTexto1.setBounds(50, 50, 150, 20);          
        campoTexto2 = new JTextField();  
        campoTexto2.setBounds(50, 100, 150, 20);          
        campoTexto3 = new JTextField();  
        campoTexto3.setBounds(50, 150, 150, 20);  
        // declarar que o campo de texto 3 nao pode ser editavel por ser o resultado do calculo  
        campoTexto3.setEditable(false);  
        // Criar JButton botao setbounds posiciona botao no quadro
        soma = new JButton("+");  
        soma.setBounds(50, 200, 50, 50); 
        
        subtracao = new JButton("-");  
        subtracao.setBounds(120, 250, 50, 50);
        
        multiplicacao = new JButton("*");
        multiplicacao.setBounds(120, 50, 50, 50);
        
        divisao = new JButton("/");
        divisao.setBounds(120, 250, 50, 50);
        
        // Adicionando evento ao botao ActionListener to buttons  
        soma.addActionListener(this);  
        subtracao.addActionListener(this); 
        multiplicacao.addActionListener(this);
        divisao.addActionListener(this);
        // Adicionar componentes no quadro components to the JFrame  
        quadro.add(campoTexto1);  
        quadro.add(campoTexto2);  
        quadro.add(campoTexto3);  
        quadro.add(soma);  
        quadro.add(subtracao);
        quadro.add(multiplicacao);
        quadro.add(divisao);
        // configurando tamanho do quadro principal   
        quadro.setSize(400, 400);  
        quadro.setLayout(null);  
        quadro.setVisible(true);  
    } 

    //  criacao da acao quando é disparado a acao do aperto do botao   
    public void actionPerformed(ActionEvent e) {  
        // declaraçao da variavel
    	
        String numero1 = campoTexto1.getText();  
        String numero2 = campoTexto2.getText();
        
        // Converter o valor das variaveis para inteiro  
        int number1 = Integer.parseInt(numero1);  
        int number2 = Integer.parseInt(numero2);          
        // criar uma variavel para resultado
        int resultado = 0;          
        // verificar qual botao foi clicado  
        if (e.getSource() == soma) {  
            resultado = number1 + number2; // Adição 
        } else if (e.getSource() == subtracao) {  
            resultado = number1 - number2; // Subtração  
        }          
        // Converter o resultado inteiro para string 
        String result = String.valueOf(resultado);          
        // Setting the result in the third text field  
        campoTexto3.setText(result);  
    }  
    public static void main(String[] args) {    
        new TextField();  
    }  
} 