import java.util.Scanner;
class dll{
    public int addition(int a,int b){
        return a+b;
    }
}
public class ExperimentNO1 extends dll{
    public static void main(String[] args) {
        dll d=new dll();
        System.out.println(d.addition(4,5));
    }
}