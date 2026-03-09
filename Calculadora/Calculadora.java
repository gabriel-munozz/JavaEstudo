import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //Solicita ao usuário que digite os números para operação
        System.out.print("Digite um valor: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite outro valor: ");
        double num2 = entrada.nextDouble();
        System.out.println();
        int opcao = 0;

        //Menu
        do{
            System.out.println("--- ESCOLHA A OPERAÇÃO ---");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potenciação");
            System.out.println("6. Sair");
            System.out.print("Digite sua opção: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Resultado: " + somar(num1, num2)+"\n");
                    break;
                
                case 2:
                    System.out.println("Resultado: " + subtracao(num1, num2)+"\n");
                    break;

                case 3: 
                    System.out.println("Resultado: " + multiplicacao(num1, num2)+"\n");
                    break;

                case 4: 
                    if (num2 == 0){
                        System.out.println("Não é possível dividir um número por 0\n");
                    } else{
                        System.out.println("Resultado: " + divisao(num1, num2)+"\n");
                    }
                    break;
                
                case 5:
                    System.out.println("Resultado: " + Math.pow(num1, num2)+"\n");
                    break;

                case 6:
                    System.out.println("Programa finalizado!");
                    break;
            }

        } while (opcao != 6);
        
        entrada.close();

    }

    private static int lerNumero(Scanner entrada) {
        while (true) {
            try {
                return entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
                entrada.nextLine(); 
            }
        }
    }

    private static double lerNumeroDouble(Scanner entrada) {
        while (true) {
            try {
                return entrada.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Digite um número: ");
                entrada.nextLine(); 
            }
        }
    }

    public static double somar(double num1, double num2){
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2){;
        return num1 * num2;        
    }

    public static double divisao(double num1, double num2){
        return num1 / num2;
    }

    public static double potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }

} 