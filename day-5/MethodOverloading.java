class Calculator{
    public int add(int a, int b){
        int sum = a + b;
        System.out.println("First Function is executed.");
        return sum;
    }
    public int add(double a, int b){
        int sum = (int)a + b;
        System.out.println("Second function is executed.");
        return sum;
    }
}

public class MethodOverloading {
    public static void main(String args[]){
        System.out.println("Welcome to the world of Computers!");
        Calculator cal = new Calculator();
        double a = 5;
        int b = 6;
        cal.add(a, b);
        cal.add(b, ++b);
    }
}
