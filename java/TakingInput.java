import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Man");
        }
        else{
            System.out.println("Boy");
        }
    }
    
}
