import java.util.Scanner;

public class Cremosas {

    private static int numeroCremosas() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int cremosas = n + m;
        return cremosas;
    }

    public static void main(String[] args) {
        System.out.println(numeroCremosas());
    }
}
