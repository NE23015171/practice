import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int x,y,sub;
        System.out.println("Enter first number" );
        x = myObj.nextInt();
        System.out.println("Enter Second number");
        y =myObj.nextInt();
        sub = x - y ;
        System.out.print(x '-' y  '= ' );
        System.out.print(sub);

    }

}