package dominio;
import java.awt.*;
public class Rectangulo extends Figura {
    protected double base;
    protected double altura;
    

    public Rectangulo(Punto2D centro,double base,double altura,Color fondo,Color borde){
        super(centro,fondo,borde);

    

    
       
        this.base = base;
        this.altura = altura;
        

    }  
    @Override
    public void dibujar(Graphics g) {
        g.setColor(fondo);
        g.fillRect(centro.getX(), centro.getY(), (int)base, (int)altura); // relleno
        g.setColor(trazo);
        g.drawRect(centro.getX(), centro.getY(), (int)base,(int) altura); // borde
    }

    public double area(){
        return base * altura;

    }
    public double perimetro() {
        return 2 * base + 2*altura;
    }
}
