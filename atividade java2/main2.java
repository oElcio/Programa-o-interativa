// Exercicio 2
public class main2 {
    public static void main(String[] args) {
        // Vetor com 20 elementos
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};

        // 1. Exibir o vetor original
        System.out.println("Vetor original:");
        exibirVetor(vetor);

        insertionSort(vetor);

        System.out.println("Vetor ordenado:");
        exibirVetor(vetor);
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
