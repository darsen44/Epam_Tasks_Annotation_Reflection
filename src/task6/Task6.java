package task6;

import task5.Task5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task6 {
    private void myMethod(String a, int... args){}
    private void myMethod(String... args){}

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Task6 task6 = new Task6();
        Method m1 = task6.getClass().getDeclaredMethod("myMethod", String[].class);
        Method m2 = task6.getClass().getDeclaredMethod("myMethod", String.class, int[].class);
        m1.invoke(task6, new Object[]{new String[]{"das","dasss"}});
        m2.invoke(task6, "Sen", new int[]{42,24});
    }
}
