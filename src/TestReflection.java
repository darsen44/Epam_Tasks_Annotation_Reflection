import java.lang.reflect.Field;

public class TestReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "Java";
        System.out.println("1. " + s);
        System.out.print("2. ");
        System.out.println("Java");

        System.out.println();
        changeValueProperty(s);

        System.out.println("3. " + s);
        System.out.print("4. ");
        System.out.println("Java");



    }
    private static void changeValueProperty(String s) throws NoSuchFieldException, IllegalAccessException {
        Field field = s.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(s,"Not Java".toCharArray());
    }
}
