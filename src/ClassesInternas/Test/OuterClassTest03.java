package ClassesInternas.Test;

public class OuterClassTest03 {
    private String name = "Antonio";
    static  class Nested{
        void print(){
            System.out.println(new OuterClassTest03().name);
        }
    }

    public static void main(String[] args) {
        Nested print = new Nested();
        print.print();

    }
}
