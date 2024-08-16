
interface MyInterface {
    default void sayHello() {
        System.out.println("Hello from the interface!");
    }
    static void sayBye() {
        System.out.println("Bye from the interface!");
    }
    void saySomething();
}

class MyClass implements MyInterface {
    // No need to override sayHello() if we don't want to
    @Override
    public void saySomething() {
        System.out.println("Hello from the class!");
    }
}
public class DefaultStaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.saySomething();
        obj.sayHello();
        MyInterface.sayBye();
    }
}
