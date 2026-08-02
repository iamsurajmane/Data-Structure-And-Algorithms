import java.util.Scanner;

public class Exp7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.next();

        System.out.println("Enter email :");
        String email = sc.next();

        System.out.println("Enter Mobile Number : ");
        String Mobile = sc.next();

        boolean IsNameValid = ValidateName(name);
        boolean IsEmailValid = ValidateEmail(email);
        boolean IsMobileValid = ValidateMobile(Mobile);

        System.out.println("----RESULT----");

        System.out.println(IsNameValid ? "Name is Valid " : "Name is Invalid");
        System.out.println(IsEmailValid ? "Enail is Valid " : "Email is Invalid");
        System.out.println(IsMobileValid ? "Mobile is Valid " : "Mobile is Invalid");
    }    
    static boolean ValidateName(String name){
        return Regex.IsMatch(name,@"[A-Za-z\s]+$");
    }
//    Incomlete Program.........


}
