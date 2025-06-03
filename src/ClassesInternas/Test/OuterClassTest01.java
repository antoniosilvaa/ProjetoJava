package ClassesInternas.Test;

public class OuterClassTest01 {
    private String name= "Antonio";

    class InnerClass {
        public void printOuterClassAtribute(){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        OuterClassTest01 outerClassTest01 = new OuterClassTest01();
        InnerClass innerClass = outerClassTest01.new InnerClass();

        innerClass.printOuterClassAtribute();
    }
}
