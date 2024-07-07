package Break_Singleton.Solution.ENUM;

public class TestEnum {
    public static void main(String[] args) {
        Dogy dogy = Dogy.INSTANCE;
        System.out.println("Hashcode of DOGY1 :: "+dogy.hashCode());
    }
}
