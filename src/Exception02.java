import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작~");
        Scanner sc = new Scanner(System.in); // 예외가 발생x

        try{
            System.out.print("숫자 입력 : ");
            int a = sc.nextInt();
            System.out.print("숫자 입력 : ");
            int b = sc.nextInt();


            System.out.println("a / b = "+ (a / b));

        } catch (Exception e){
            System.out.println("예외가 발생했습니다.");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        System.out.println("프로그램 종료");
    }
}
