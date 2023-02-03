import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("프로그램 시작");

        try{
            System.out.println("숫자 입력 : ");
            int a= sc.nextInt();
            System.out.println("숫자 입력 : ");
            int b= sc.nextInt();
            System.out.println("a / b : "+ (a /b));

        }catch(ArithmeticException e){
            System.out.println("예외 발생! ");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("입력 값이 이상해요");
        }finally {

        }
        System.out.println("프로그램 종료");
    }
}
