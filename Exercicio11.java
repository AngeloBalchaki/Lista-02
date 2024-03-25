import java.util.Scanner;

public class Exercicio11 {

    public static void executar() {
        int[] vetor11A = {0, 2, 4, 6, 8};
        int[] vetor11B = {1, 3, 5, 7, 9};
        int produtoEscalar = 0;
        for (int i = 0; i < vetor11A.length; i++) {
            produtoEscalar += vetor11A[i] * vetor11B[i];
        }
        System.out.println("Produto escalar entre os vetores A e B: " + produtoEscalar);
