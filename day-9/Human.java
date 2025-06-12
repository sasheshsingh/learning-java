public class Human {
    int age;
    String name;
    void speak(){
        System.out.println("Hello! My name is "+ name);

    }

    void checkDate(int date) {
        switch (date) {
            case 1: {
                System.out.println("Today is Monday");
                break;
            }
            case 2: {
                System.out.println("Today is Tuesday");
                break;
            }
            case 3: {
                System.out.println("Today is Wednesday");
                break;
            }
            case 4: {
                System.out.println("Today is Thursday");
                break;
            }
            case 5: {
                System.out.println("Today is Friday");
                break;
            }
            case 6: {
                System.out.println("Today is Saturday");
                break;
            }
            case 7: {
                System.out.println("Today is Sunday");
                break;
            }
            default: {
                System.out.println("No valid date is added");
            }
        }
    }
}