 public class Outer_ {
      int number=0;
    
    void outerMethod(){
        class Inner{
        public void print(){
            System.out.println("Mengakses inner class yang ke: " + (number++));
        }
    }
        Inner in = new Inner();
        in.print();
    }
}

class Outer_Access{
    
    public static void main(String[] args) {
        Outer_ out = new Outer_();
        out.outerMethod();
        out.outerMethod();
        out.outerMethod();
    } 
}