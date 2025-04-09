class TypeCasting{
    public static void main(String args[]){
        int i = 0;
        System.out.println("Type of intger");
        System.out.println(i);
        byte b = 1;
        System.out.println("Value of b:");
        System.out.println(b);
        float degree = 36.4f;
        System.out.println("Value of degree in float is:");
        System.out.println(degree);
        degree = b;
        System.out.println("Value of degree in int:");
        System.out.println((int)degree);
    }
}