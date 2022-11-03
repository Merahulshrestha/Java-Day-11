import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // WAP to check if it's even or odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Even");
        } else {
            System.out.print("Odd");
        }
    }
}
