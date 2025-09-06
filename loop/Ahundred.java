import java.util.Scanner;

public class Ahundred{

    public static void main (String[] args){
        Scanner src = new Scanner(System.in);
        int sum = 0;
        while(sum <= 100){
            System.out.print("Entetr a number : ");
            int num = src.nextInt();
            sum +=num ;
            System.out.println("sum = "+sum);
        }
        if(sum >= 100 ){
            System.out.println("the limits ecided here .");
        }
    src.close();
}
    
}