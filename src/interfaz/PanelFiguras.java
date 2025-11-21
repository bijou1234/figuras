package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;

import javax.swing.JPanel;

import dominio.Figura;


    // Panel para dibujar las figuras
public class PanelFiguras extends JPanel {
    private List<Figura> figuras = new ArrayList<>();

    public void agregarFigura(Figura f) {
        figuras.add(f);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Figura f : figuras) {
            f.dibujar(g);
        }
    }
}


