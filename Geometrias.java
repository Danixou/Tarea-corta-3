import java.util.Arrays;

public class Geometrias {
    public static void main(String args[]){

        Rectangulo[] rects = new Rectangulo[4];

        rects[0] = new Rectangulo(2.5, 3.0);
        rects[1] = new Rectangulo(1.7, 2.2);
        rects[2] = new Rectangulo(2.8, 3.1);
        rects[3] = new Rectangulo(3.5, 1.2);

        System.out.println("RECTANGULO");
        System.out.println(rects[0].compareTo(rects[1]));
        System.out.println(rects[0].devolverLados());

        System.out.println("CIRCULO");
        Circulo circulo = new Circulo(4);
        Circulo circulo2 = new Circulo(8);
        System.out.println(circulo.compareTo(circulo2));
        System.out.println(circulo2.devolverLados());

        System.out.println("TRIANGULO");
        Triangulo triangulo = new Triangulo(3, 4);
        Triangulo triangulo2 = new Triangulo(8, 2);
        System.out.println(triangulo.compareTo(triangulo2));
        System.out.println(triangulo.devolverLados());

    }
}
