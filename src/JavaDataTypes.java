import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                    //Complete the code
                if (x >= -32_767 && x <= 32_767) System.out.println("* short");
                if (x >= -2_147_483_647 && x <= 2_147_483_647) System.out.println("* int");
                if (x > -2_147_483_648 && x > 2_147_483_647)System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
//TODO finish this task

