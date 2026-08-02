import java.util.Scanner;
public class Exp6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Full Name : ");
        String name = sc.nextLine();

        System.out.println("Enter email Address : ");
        String email = sc.next();

        System.out.println("Enter your Password : ");
        String password = sc.next();

        boolean IsValid = true;

        if(!email.contains("@") || !email.endsWith(".com")){
            System.out.println("Invalid email..it must contain @ and ends with .com");
            IsValid = false;
        }

        if(password.length() < 8){
            System.out.println("Password must contain 8 characters ...");
            IsValid = false;
        }

        if(IsValid){
            System.out.println();
            System.out.println(" Registration Succesfull...");
            System.out.println("------------------------------------------");
            System.out.println("Full Name : "+name);
            System.out.println("Email : "+email);
            System.out.println("Password : "+"*".repeat(password.length()));
        }
    }
}