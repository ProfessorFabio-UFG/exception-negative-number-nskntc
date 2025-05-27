import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        try {
            validarNumero(numero);
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é " + raiz);
        } catch (NumeroNegativo e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }

    private static void validarNumero(double numero) {
        if (numero < 0) {
            throw new NumeroNegativo("Não é possível calcular a raiz quadrada de um número negativo: " + numero);
        }
    }
}
