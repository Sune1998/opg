import java.util.Scanner;

public class Opgave2 {
    //løsning til opgave 2.1
    public static void main(String[] args) {
        System.out.println("intast mil");
        Scanner input = new Scanner(System.in);
        double kmtilmil = input.nextDouble();

        double km = kmtilmil * 1.6;
        System.out.println(km);
    }
}
