import java.util.Scanner;
public class Exp4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Employees : ");
        int n = sc.nextInt();

        String[] employeenames = new String[n];
        String[][] qualifications = new String[n][];

        for(int i=0;i<n;i++){
            System.out.println("Enter name of Employee "+(i+1)+" : ");
            employeenames[i] = sc.next();

            System.out.println("Enter Number of Qualifications of "+employeenames[i] + " : ");
            int q = sc.nextInt();

            qualifications[i] = new String[q];

            for(int j = 0;j<q;j++){
                System.out.println("Enter Qualification "+(j+1)+" : ");
                qualifications[i][j] = sc.next();
            }
        }
        System.out.println("Employee Qualifications : ");
        System.out.println();

        for(int i = 0;i<n;i++){
            System.out.println("Employee : "+employeenames[i]);
            System.out.println("Qualifications : ");

            for(int j = 0;j < qualifications[i].length;j++){
                System.out.println(" - "+qualifications[i][j]);
            }
            System.out.println();
        }
    }
}