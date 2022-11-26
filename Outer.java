package Sesi7;

public class Outer {
           int number = 0;

    private class Inner {
        public void print() {
            System.out.println("Mengakses inner class yang ke: " + (++number));
        }
    }

    void displayFromMethod() {
        Inner in = new Inner();
        in.print();
    }
}

class main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.displayFromMethod();
        out.displayFromMethod();
    }
}
