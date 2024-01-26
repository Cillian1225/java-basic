package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 : " + dataA);
        System.out.println("dataB 참조값 : " + dataB);
        System.out.println("dataA val : " + dataA.value);
        System.out.println("dataB val : " + dataB.value);
        System.out.println();
        dataA.value = 20;
        System.out.println("dataA val 20 변경");
        System.out.println("dataA val : " + dataA.value);
        System.out.println("dataB val : " + dataB.value);
        System.out.println();
        dataB.value = 30;
        System.out.println("dataB val 30 변경");
        System.out.println("dataA val : " + dataA.value);
        System.out.println("dataB val : " + dataB.value);
    }
}
