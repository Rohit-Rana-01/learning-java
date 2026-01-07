import java.util.Scanner;
public class me {
    public static int sum(int a , int b ){
        return a + b ;
    }

    public static int sum(int a , int b , int c ){
        return a + b + c ; 
    }
    public static void main(String[] args ){
        Scanner src = new Scanner(System.in); 
        src.close();

        System.out.println(sum(3,4));

        System.out.println(sum(3,4,3));

    }
} 
