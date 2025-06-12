
class Main{
    public static void main(String[] args) {
        // primitive
        int a = 10;
        long b = 20;
        long c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // non-primitive
        String s = "abcd";
        String s2 = "a";

        float pi = 3.14f;
        int piINT = (int)pi;
        System.out.println(s);
        System.out.println(s2);
        System.out.println(pi);
        System.out.println(piINT);

        Human human = new Human();
        human.name = "Sashesh Singh";
        human.speak();
        human.checkDate(1);
        human.checkDate(2);
        human.checkDate(3);
        human.checkDate(4);
        human.checkDate(5);
        human.checkDate(6);
        human.checkDate(7);
        human.checkDate(8);
    }
}