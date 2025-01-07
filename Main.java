class OuterClass {
    class InnerClass {
        void display() {
            System.out.println("Inner class method");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        // inner.display();
        
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inner = out.new InnerClass();
        inner.display();
        System.out.println("hello");
    }
}
