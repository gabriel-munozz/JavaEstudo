public class Matriz {

    public static void main(String[] args) {

        int[][] predio = new int[10][8];

        preencher(predio);
        mostrar(predio);

        System.out.println("\nApartamentos vazios: " + contarVazios(predio));
        System.out.println("Andar com mais moradores: " + andarMaisCheio(predio) + "º");
        System.out.println("Total de moradores: " + totalMoradores(predio));
    }

    // Preenche com números aleatórios de 0 a 6
    static void preencher(int[][] predio) {
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                predio[i][j] = (int)(Math.random() * 7);
            }
        }
    }

    // Mostra a matriz
    static void mostrar(int[][] predio) {
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                System.out.print(predio[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Conta apartamentos vazios
    static int contarVazios(int[][] predio) {
        int cont = 0;
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                if (predio[i][j] == 0) cont++;
            }
        }
        return cont;
    }

    // Andar com mais moradores
    static int andarMaisCheio(int[][] predio) {
        int maior = 0;
        int andar = 0;

        for (int i = 0; i < predio.length; i++) {
            int soma = 0;
            for (int j = 0; j < predio[i].length; j++) {
                soma += predio[i][j];
            }
            if (soma > maior) {
                maior = soma;
                andar = i + 1;
            }
        }
        return andar;
    }

    // Total de moradores
    static int totalMoradores(int[][] predio) {
        int total = 0;
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                total += predio[i][j];
            }
        }
        return total;
    }
}