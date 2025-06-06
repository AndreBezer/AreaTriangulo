import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a1, b1, c1, p1, a2, b2, c2, p2, area1, area2;

        System.out.println("Digite os tres valores do triangulo A: ");
        a1 = sc.nextDouble();
        b1 = sc.nextDouble();
        c1 = sc.nextDouble();
        p1 = (a1 + b1 + c1) / 2;
        area1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));

        System.out.println("Digite os tres valores do triangulo B: ");
        a2 = sc.nextDouble();
        b2 = sc.nextDouble();
        c2 = sc.nextDouble();
        p2 = (a2 + b2 + c2) / 2;
        area2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));
        sc.close();

        System.out.printf("Area do triangulo a: %.4f%n", area1);
        System.out.printf("Area do triangulo b: %.4f%n", area2);

        if (area1 > area2){
        System.out.printf("Area do triangulo A é maior");
        }
        
        else if (area1 == area2){
        System.out.printf("Area do triangulo A é igual ao triangulo B");
        }

        else{
            System.out.println("Area do triangulo B é Maior");
        }
    }
}