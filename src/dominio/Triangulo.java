public class Triangulo {
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double areaC;
    protected double PerimetroC;
    public Triangulo(double lado1,double lado2,double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.areaC = calcularArea (lado1,lado2,lado3);
        this.PerimetroC = lado1 + lado2+ lado3;

    }
    private double calcularArea (double lado1,double lado2,double lado3){
        double s = (lado1 + lado2 +lado3)/2;
        return Math.sqrt(s *(s -lado1)*(s - lado2)*(s-lado3));
    }
    }

