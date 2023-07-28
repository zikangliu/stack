public class Test {
    public static void main(String[] args) {

        String str = "(, {, {, }, [, ), }, ]";
        StackSolution stackSolution = new StackSolution();
        stackSolution.isValid(str);
        System.out.println(str);
    }
}
