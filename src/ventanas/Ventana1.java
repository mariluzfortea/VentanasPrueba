package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
	
public class Ventana1 extends JFrame{
		
		public Ventana1() {
			//Tama�o de la ventana
			//setSize(700,500);
			
			//Seleccionamos el tipo de cierre de la ventana1
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			//Maximiza la pantalla completa
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			
			//Titulo de la ventana
			setTitle("Primera ventana");
			
			//Asignamos un icono
			Toolkit pantalla=Toolkit.getDefaultToolkit();
			
			Image icono=pantalla.getImage("C:\\Users\\Mariluz\\Pictures\\Saved Pictures\\images.png");
			setIconImage(icono);
			
			//establece un color de fondo al marco
			setBackground(Color.yellow);
			
			//Creamos la l�mina donde vamos a pintar objetos
			Lamina laminaMarco = new Lamina();
			//A�adimos la l�mina al marco
			add(laminaMarco);
			
			//Hace visible la primera ventana
			//Lo ponemos lo �ltimo, porque sino a veces no veremos en pantalla lo que se haya definido despu�s de hacerla visible
			setVisible(true);
			
		}
	}

	//Todo lo que extiende de JPanel es una l�mina
	class Lamina extends JPanel {
		
		//M�todo sobreescrito de JPanel
		public void paintComponent (Graphics g){
			
			//Llamamos al m�todo del padre para que ejecute todo lo que ya tiene el m�todo en origen
			// y adem�s ejecute el resto que codifiquemos
			//Si modificamos cosas b�sicas del marco, entonces tendremos que comentarlo para que hagan efectivos
			//super.paintComponent(g);
			
			//escribe un texto en la posici�n que le indiquemos
			g.drawString("ESTAMOS EN LA PRIMERA VENTANA", 100, 100);

		}
	}

