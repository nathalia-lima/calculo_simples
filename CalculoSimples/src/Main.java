import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        double C = input.nextDouble();
        int D = input.nextInt();
        int E = input.nextInt();
        double F = input.nextDouble();
        double resultado = (B*C)+(E*F);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);
    }
}