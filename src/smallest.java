import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n<m){
            System.out.println("smallest"+n);

        }
        else{
            System.out.println("smallest"+m);
        }
    }
}
