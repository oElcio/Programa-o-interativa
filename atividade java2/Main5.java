public class Main5 {

    public static void main(String[] args) {
        int[] tamanhos = {100, 500, 1000};
        for (int tamanho : tamanhos) {
            int[] vetor1 = gerarVetorAleatorio(tamanho);
            int[] vetor2 = vetor1.clone();

            System.out.println("tamanho do vetor: " + tamanho);

            long inicio = System.nanoTime();
            selectionSort(vetor1);
            long fim = System.nanoTime();
            System.out.println("Tempo do Selection Sort: " + (fim - inicio) + " nanosegundos");
            inicio = System.nanoTime();
            insertionSort(vetor2);
            fim = System.nanoTime();
            System.out.println("Tempo do Insertion Sort: " + (fim - inicio) + " nanosegundos");

            System.out.println();
        }
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * 1000);
        }
        return vetor;
    }
}
