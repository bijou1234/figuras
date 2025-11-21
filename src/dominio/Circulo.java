package dominio;
public class Circulo extends Figura {
    private double radio;

    public Circulo(Punto2D centro, double radio) {
        super(centro);
        this.radio = radio;
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
