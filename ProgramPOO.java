import java.util.Scanner;
import entities.Triangle;

public class ProgramPOO {
    public static void main(String[] args) {
        double area1, area2;
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os lados do triangulo A: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        area1 = x.area();

        System.out.println("Digite os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        area2 = y.area();

        sc.close();

        if (area1 > area2){
            System.out.println("O triangulo A é maior");
        }
        else{
            System.out.println("O triangulo B é maior");
        }
    }
}