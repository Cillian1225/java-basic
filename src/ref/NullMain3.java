package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bd = new BigData();
        System.out.println(bd.count); //0임 초기화안함
        System.out.println(bd.data);
        System.out.println(bd.data.value); //null에서 value찾는다? nullPointer오류

    }
}
