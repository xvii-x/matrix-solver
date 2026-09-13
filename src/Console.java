import java.util.Scanner;

public class Console {
    private final Scanner sc = new Scanner(System.in);

    public void startConsole() {
        System.out.println("1. Умножить матрицы\n2.Умножить матрицу константу\n");
        int command;
        do {
            command = sc.nextInt();
            switch (command) {
                case 1:

                case 2:

            }
        } while (command != -1);
    }
}
