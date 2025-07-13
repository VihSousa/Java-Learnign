import java.util.Scanner;

public class Contador {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, digite o primeiro número:");
            int num1 = scanner.nextInt();

            System.out.println("Por favor, digite um número maior que o anterior:");
            int num2 = scanner.nextInt();

            try {
                count(num1, num2);
                break; 
            } catch (ParametrosException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente!\n");
            }
        }

        scanner.close();
    }


    static void count (int num1, int num2) throws ParametrosException {

        if (num1 > num2) {
            throw new ParametrosException("O segundo parâmetro deve ser maior que o primeiro, tente novamente");
        } else {

            int resultado = num2 - num1;
            for (int i = 1; i <= resultado; i++ ){
                System.out.println("Imprimindo o número " + i);
            }

        }

    }
}
