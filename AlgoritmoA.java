import java.util.Scanner;

public class AlgoritmoA {

    private static void isBigger() {
        Scanner n = new Scanner(System.in);
        Scanner bobo = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        int numero_bobo = bobo.nextInt();
        int finish = n.nextInt();
        String resp = "S";
        for (int start = 2; start < finish; start++) {
            if (numero.nextInt() > numero_bobo) {
                resp = "N";
            }
        }
        System.out.println(resp);
        return;
    }

    public static void main(String[] args) {
        isBigger();
    }
}
