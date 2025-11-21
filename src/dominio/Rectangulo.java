public class Rectangulo {
    protected double base;
    protected double altura;
    protected double areaC;
    protected double PerimetroC;

    public Rectangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
        this.areaC = base * altura;
        this.PerimetroC = 2 *(base + altura);
    }
}
