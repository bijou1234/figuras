package aplicacion;

import java.awt.Color;
import interfaz.PanelFiguras;


import javax.swing.JFrame;

import dominio.*;
import java.awt.*;
public class Principal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujar Figuras con Colores");
        PanelFiguras panel = new PanelFiguras();

        // Añadimos algunas figuras con colores
        panel.agregarFigura(new Circulo(new Punto2D(50,50), 40, Color.YELLOW, Color.RED));
        panel.agregarFigura(new Rectangulo(new Punto2D(150,100), 80, 50, Color.GREEN, Color.BLUE));

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
