package dominio;
import java.awt.*;
public class Circulo extends Figura {
    private double radio;

    public Circulo(Punto2D centro, int radio, Color fondo, Color trazo) {
        super(centro, fondo,trazo);
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(fondo);
        g.fillOval(centro.getX(),centro.getY(),(int) radio * 2,(int) radio * 2); // relleno
        g.setColor(trazo);
        g.drawOval(centro.getX(),centro.getY(), (int)radio * 2, (int)radio * 2); // borde
    }
    public Circulo() {
        super(new Punto2D(0,0),Color.WHITE, Color.BLACK); // colores por defecto
        this.radio = 50;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo[centro=" + centro.toString() + ", radio=" + radio + "]";
    }
}
