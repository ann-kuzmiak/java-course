import com.course.syntax.StepFirst;
import com.course.syntax.StepFourth;
import com.course.syntax.StepSecond;
import com.course.syntax.StepThird;


public class Main {
    public static void main(String[] args) {

        stepFirst();

        stepSecond();

        stepThird();

        stepFourth();
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
}

