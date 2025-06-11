public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        int a = 10, b = 0;
        try{
            int c = a/b;
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
        System.out.println("Program went to sleep");
        sleepProgram();
        System.out.println("System slept.");
    }
    private static void sleepProgram() throws InterruptedException {
        Thread.sleep(20);
    }
}