package Day_11_12_Practice_Problem;

public class Casting {
    public static void main(String[] args) {
        Parent p = new Child(); // Upcasting
        p.show();
        p.display();
        Parent p1 = new Parent();
//        Child c = (Child) p1;   // ERROR: ClassCastException
        if (p instanceof Child) {
            Child c1 = (Child) p; //Downcasting
            c1.display();
        }
    }
}

class Parent {
    void display() {
        System.out.print("Parent display method");
    }
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void display() {
        System.out.print("Child display method");
    }
}