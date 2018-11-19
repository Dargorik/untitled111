public class Inner {
}

class A {
    static int i;
    int b;

    class B {
        void so() {
            System.out.println(i);
            i++;
        }

    }
    static class C {
        void so() {
            i++;
            System.out.println(i+1);
        }
    }
}

class D extends A.B{
    D(A a){
        a.super();
    }
}
