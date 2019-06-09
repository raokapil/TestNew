package Program;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.SINGLETON;




        System.out.println(instance.hashCode());

        EnumSingleton instance2 = EnumSingleton.SINGLETON;
        System.out.println(instance2.hashCode());
    }
}
