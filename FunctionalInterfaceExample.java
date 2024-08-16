import java.util.*;
import java.io.*;
public class FunctionalInterfaceExample  {
    public static void main(String[] args) {
        
        MyFunctionalInterface sum = (int a,int  b) -> a + b;
        System.out.println("Functional Interface Example"+ sum.addMethod(10, 20));
        sum.defaultMethod();
        MyFunctionalInterface.staticMethod();
    }

    
}
@FunctionalInterface
interface MyFunctionalInterface {
    public int addMethod(int a, int b);
    default void defaultMethod() {
        System.out.println("Default Method");
    }
    static void staticMethod() {
        System.out.println("Static Method");
    }

}