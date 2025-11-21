package dominio;
import java.awt.*;


public class Cuadrado extends Figura {

    protected double lado;
    
    public Cuadrado(Punto2D centro,double lado,Color fondo,Color borde){
        super(centro,fondo,borde);
        this.lado=lado;

       
    }
     @Override
    public void dibujar(Graphics g) {
        g.setColor(fondo);
        g.fillRect(centro.getX(),centro.getY(), (int)lado,(int)lado); // relleno
        g.setColor(trazo);
        g.drawRect(centro.getX(),centro.getY(), (int)lado,(int)lado); // borde
    }
    public Cuadrado() {
        super(new Punto2D(0,0),Color.WHITE, Color.BLACK); // colores por defecto
        this.lado = 50;
    }
    public double area(){
        return lado * lado;

    }
    public double perimetro() {
        return 4 * lado;
    }

}
