import java.util.Scanner;
import java.lang.StackTraceElement;

public class JavaEndOfFile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lineCounter = 1;

        while (scan.hasNext()) {
            System.out.println(lineCounter++ + " " + scan.nextLine());
        }

        scan.close();
    }
}
