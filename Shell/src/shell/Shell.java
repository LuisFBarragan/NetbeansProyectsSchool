package shell;

import java.util.Scanner;

public class Shell {

    public static void main(String[] args) {
        // Scanner read=new Scanner(System.in);
        int shell[] = {100,88, 80, 90, 84};
        int aux, p = 0, j;

        for (j = shell.length / 2; j != 0; j = j / 2) {
            for (int x = 0; x != 1; x++) {
                x = 0;
                p++;
                for (int i = j; i < shell.length; i++) {
                    if (shell[i - j] > shell[i]) {
                        aux = shell[i];
                        shell[i] = shell[i - j];
                        shell[i - j] = aux;
                        x = 1;
                    }
                }
            }

        }

        for (int w = 0; w < shell.length; w++) {
            System.out.print("[" + shell[w]+"]");
        }
        System.out.println(" ");
    }
}
