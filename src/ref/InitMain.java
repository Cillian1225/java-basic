package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data  = new InitData();
        System.out.println(data.value1); //초기화 하지않음
        System.out.println(data.value2); // 초기화 20으로 함

    }
}
