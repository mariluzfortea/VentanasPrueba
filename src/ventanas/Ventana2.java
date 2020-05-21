package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
	
public class Ventana2 extends JFrame{
		
		public Ventana2() {
			//Ventana centrada establecemos el tama�o y posici�n
			Toolkit pantalla=Toolkit.getDefaultToolkit();

			//metodo: getScreenSize(): recoge la resolucion de nuestra pantalla
			Dimension resolucionPantalla=pantalla.getScreenSize();
			
			//nos devuelve el ancho de nuestra pantalla
			int anchoPantalla=resolucionPantalla.width; 
			//nos devuelve el alto de nuestra pantalla
			int altoPantalla=resolucionPantalla.height; 
				
			setSize(anchoPantalla/2, altoPantalla/2); //tendr� un tama�o de 1/4 de mi pantalla
			setLocation(anchoPantalla/4, altoPantalla/4);//para que este centrada tendr�a que dividir la pantalla en 3 tercios
			
			//Seleccionamos el tipo de cierre de la ventana2, para que no se cierre el programa
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			//Titulo de la ventana
			setTitle("Segunda ventana");
			
			//ICONO, el m�todo getImage es de la clase Toolkit
			Image miIcono=pantalla.getImage("C:\\Users\\Mariluz\\Pictures\\Saved Pictures\\descarga.png");
			setIconImage(miIcono);
			
			//establece un color de fondo al marco
			setBackground(Color.green);
			
			//Creamos la l�mina donde vamos a pintar objetos
			Lamina2 laminaMarco2 = new Lamina2();
			//A�adimos la l�mina al marco
			add(laminaMarco2);
			
			
			//Hace visible la segunda ventana
			//Lo ponemos lo �ltimo, porque sino a veces no veremos en pantalla lo que se haya definido despu�s de hacerla visible
			setVisible(true);
			
		}
	}

	//Todo lo que extiende de JPanel es una l�mina
	class Lamina2 extends JPanel implements ActionListener {
		
		//1�Creamos el boton, es decir, creamos el Objeto Fuente (O.F.) de tipo JButton
		JButton BotonTexto=new JButton("Texto");
		JTextField txtTexto = new JTextField("NO conseguido");
		
		
		Lamina2(){
			
			//2�A�adimos el bot�n al constructor del Objeto Listener(quien recibe la acci�n(O.L.)-->Clase miLamina2)
			add(BotonTexto);
			add(txtTexto);
			
			//3�Le damos una acci�n al boton, llamando al m�todo para agregar una acci�n al O.L. con el O.F.
			BotonTexto.addActionListener(this);	
		}
		
		
		//M�todo sobreescrito de JPanel
		public void paintComponent (Graphics g){
			
			//Llamamos al m�todo del padre para que ejecute todo lo que ya tiene el m�todo en origen
			// y adem�s ejecute el resto que codifiquemos
			//Si modificamos cosas b�sicas del marco, entonces tendremos que comentarlo para que hagan efectivos
			//super.paintComponent(g);
			
			//escribe un texto en la posici�n que le indiquemos
			g.drawString("ESTAMOS EN LA SEGUNDA VENTANA", 100, 100);

		}

		//Metodo que implementa la interfaz de ActionListener y que recibir� un objeto de tipo raton (porque se hace clic sobre el boton)
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			txtTexto.setText("Conseguido");
			
			String texto=txtTexto.getText();
			
			System.out.println(texto);
		}
	}

