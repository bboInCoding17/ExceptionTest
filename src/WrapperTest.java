public class WrapperTest {
    public static void main(String[] args) {
        Wrapper01 w = new Wrapper01();

        String str = "java";
        w.showData(str);//문자열

        Exception01 e = new Exception01();
        w.showData(e);

        int num =7; // Object에는 객체만 들어 갈 수 있다. 그래서 기본 자료형은 못 들어가
        Integer num1 = new Integer(5);
        Double num2 = new Double(3.4);
        w.showData(num);

        int b = num1;// num1은 Integer 클래스 객체인데, int에 형변환해서 자동으로 넣음
        Double num3 = new Double(7.1);
        double c = num3;//num3는 Double 클래스 객체인데, double로 형변해서 자동으로 넣음
        w.showData(num3);
    }
}
