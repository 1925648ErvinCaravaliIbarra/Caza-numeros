/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui_cazanumeros;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI_CazaNumeros extends JFrame {
  private JPanel pSuperior,pCentral,pInferior,pGeneral ;
  private JButton numeros[],pulsador,iniciar,vidas[];
  private JLabel puntos, eIcono;
  private JTextField  tfvalor ;
  
 
        
   
    
    
    private void intGUI() {
     pSuperior= new JPanel();
     numeros = new JButton[10];
     pSuperior= new JPanel(new GridLayout(2,5,3,3));
     
     
     for (int i=0;i< numeros.length;i++) {
          
          numeros[i] = new JButton("");
          pSuperior.add(numeros[i]);
      }
     
     
     
     pCentral= new JPanel();
     eIcono = new JLabel();
     eIcono.setIcon(new ImageIcon("src/Recursos/pesca.jpg"));
     eIcono.setBounds(270,10,200,70);
     pulsador= new JButton();
     pulsador.setPreferredSize(new Dimension(100,100));
     pCentral.add(pulsador);pCentral.add(eIcono);
     pCentral.setBackground(Color.WHITE);
     
    
     
    vidas= new JButton[2];
    pInferior= new JPanel();
    
    
    
     for (int i=0;i< vidas.length;i++) {
          
          vidas[i] = new JButton("1");
          pInferior.add(numeros[i]);

     }
    puntos=new JLabel("Puntos");
    tfvalor= new JTextField(20);
    iniciar= new JButton("Iniciar");
    pInferior.add(puntos);pInferior.add(tfvalor);pInferior.add(iniciar);
    add(pInferior);
    
   

  add(pSuperior,BorderLayout.NORTH);
  add(pCentral,BorderLayout.CENTER);
  add(pInferior,BorderLayout.SOUTH);


   

    
    
        
    }
    
 
    
    
    
    
    public GUI_CazaNumeros(){
    intGUI();
    this.setTitle("Caza Números");
    this.setSize(600,340);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
      GUI_CazaNumeros E= new GUI_CazaNumeros();
    }
    
}
