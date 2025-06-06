import java.util.Scanner;
import entities.Triangle;

public class ProgramPOO {
    public static void main(String[] args) {
        double p, area1, area2;
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os lados do triangulo A: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        p = (x.a + x.b + x.c) / 2;
        area1 = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        System.out.println("Digite os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        sc.close();

        p = (y.a + y.b + y.c) / 2;
        area2 = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        if (area1 > area2){
            System.out.println("O triangulo A é maior");
        }
        else{
            System.out.println("O triangulo B é maior");
        }
    }
}