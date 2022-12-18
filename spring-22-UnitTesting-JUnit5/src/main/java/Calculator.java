public class Calculator {

    public static String operator = "add";

    public static int add(int num1, int num2){

        return num1+num2;
    }
    public static int add2(int num1, int num2) throws IllegalArgumentException {
        if (num1 > num2) {
            throw new IllegalArgumentException("My exception");
        }
        return num1 + num2;
    }


}
