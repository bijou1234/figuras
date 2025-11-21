public class Cuadrado {
    protected double lado;
    protected double areaC;
    protected double PerimetroC;
    public Cuadrado(double lado){
        this.lado=lado;
        this.areaC = lado * lado;
        this.PerimetroC = 4 *lado;
    }
}
