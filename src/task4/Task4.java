package task4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task4 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Task4.invokeMethods(new Task4(),14,1234,"Dariy");
    }
    private void zeroArg(){
        System.out.println("First method");
    }
    private int twoArg(int a, int b){
        return a+b;
    }
    private void objectArg(String s){
        System.out.println("Hello " + s);
    }
    public static void invokeMethods(Task4 task4,int a,int b,String s) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m1 = task4.getClass().getDeclaredMethod("zeroArg");
        Method m2 = task4.getClass().getDeclaredMethod("twoArg", int.class, int.class);
        Method m3 = task4.getClass().getDeclaredMethod("objectArg", String.class);
        m1.invoke(task4);
        System.out.println("Second method " + m2.invoke(task4,a,b));
        System.out.print("Third method ");
        m3.invoke(task4,s);
    }
}
