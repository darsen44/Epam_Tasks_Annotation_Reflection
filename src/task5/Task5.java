package task5;

import java.lang.reflect.Field;

public class Task5 {
    int a;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Task5 task5 = new Task5();
        Field field = Task5.class.getDeclaredField("a");
        if(field.getType().equals(int.class)){
            field.set(task5,42);
        }
        System.out.println(task5.a);
    }

}
