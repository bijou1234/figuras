package aplicacion;
import dominio.*;
public class Principal {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(new Punto2D(2,3),5.0);
        System.out.println(c1);
        System.out.println(c1+"\n area:" + c1.area()+"\t perimetro: " + c1.perimetro());
     Figura c2 = new Circulo(new Punto2D(3,5),9.0);
     System.out.println(c2+"\n area:" + c2.area()+"\t perimetro: " + c2.perimetro());

    }

}
