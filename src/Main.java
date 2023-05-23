import com.course.OOP.Manager;
import com.course.OOP.User;
import com.course.additionalSyntax.Child;
import com.course.additionalSyntax.Parent;
import com.course.syntax.*;

public class Main {
    public static void main(String[] args) {
        initBlocks();
    }

    public static void stepFirst() {
        System.out.println("Step First");
        StepFirst stepFirst = new StepFirst();
        stepFirst.output();
        System.out.println("--------------------------------------");
    }

    public static void stepSecond() {
        System.out.println("Step Second");
        StepSecond stepSecond = new StepSecond(3, 4, 5);
        System.out.println(stepSecond.countSquare());
        StepSecond.task2();
        System.out.println("--------------------------------------");
    }

    public static void stepThird() {
        System.out.println("Step Third");
        StepThird.task1();
        StepThird.task2();
        StepThird.task3();
        System.out.println("--------------------------------------");
    }

    public static void stepFourth() {
        System.out.println("Step Fourth");
        StepFourth.task1();
        System.out.println(StepFourth.factorial(6));
        System.out.println(StepFourth.divisor(6));
        StepFourth.getAge();
    }

    public static void OOPTask() {
        User user = new User("Anna Kuzmiak", "annwrst@gmail.com", "Admin");
        user.setDeliveryAddress("Ukraine", "KR", "Chornovola", "38", "03894");
        user.printUserInfo();

        User user2 = new User("Anna Kuzmak", "annwrst+88@gmail.com", "Admin");
        user2.printUserInfo();

        Manager manager1 = new Manager("Manager Name", "manaer@gv.rd", "Customer", "position");
        manager1.printUserInfo();
        user2.setManager(manager1);
        manager1.setCard("5627379373630191", "12-04-2024", "622", "Visa");

        System.out.println(manager1.getCards().toString());
    }

    public static void initBlocks() {
        Child child = new Child();
    }
}

