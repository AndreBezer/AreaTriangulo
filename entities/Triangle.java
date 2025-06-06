package entities; // Pacote

public class Triangle{ // Nome da classe
    // Publuc indica que pode ser acessado por outros arquivos
    // a, b, c -> Atributos da classe Triangle
    public double a;
    public double b;
    public double c;

    // Criar função
    // Double significa que essa função retorna um valor double
    // area é o nome do metodo e a lista de paramentros
    public double area(){
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}