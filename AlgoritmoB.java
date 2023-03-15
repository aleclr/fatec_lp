import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AlgoritmoB {

    public static float divisao() {
        Scanner numero = new Scanner(System.in);
        List<Integer> entrada = new LinkedList<Integer>();
        entrada.set(0, numero.nextInt());
        entrada.set(1, numero.nextInt());
        float divisao = entrada.get(0) / entrada.get(1);

        return divisao;
    }

    public static void main(String[] args) {
        System.out.printf("%.2f", divisao());
    }
}
