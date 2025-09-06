import java.util.Scanner;
public class evenodd {

    static class check {
        void input(int num){
            if(num % 2 == 0){
                System.out.println("the entered number is even . ");

            }
            else{
                System.out.println("the entered numver is odd ..");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        check  test = new check();

        int num = src.nextInt();
        test.input(num);
        src.close();
    }
}
