import java.util.Scanner;

public class highest_number     {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int y = input.nextInt();
        if (n>y)
            System.out.println("largest"+n);
        else
            System.out.println("smallest"+n);
    }
}
