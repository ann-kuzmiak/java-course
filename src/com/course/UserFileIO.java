package com.course;
import com.course.OOP.User;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserFileIO {

    private static final String PATH = "users.csv";
    static Scanner scanner;

    public static void main(String[] args) throws IOException {
        scanner = new Scanner(System.in);
        boolean isStartScreen = true;
        while (isStartScreen) {
            System.out.println("Select option: add user(enter 1) or print users(enter 2). Enter q to exit");
            switch (scanner.next()) {
                case "1" -> addUser();
                case "2" -> printUsers();
                case "q" -> isStartScreen = false;
                default -> System.out.println("incorrect value entered");
            }
        }
        scanner.close();
    }
    public static User createUserfromConsole() {
        scanner = new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter role");
        String role = scanner.nextLine();
        return new User(fullName, email, role);
    }

    public static void addUser() throws IOException {
        User user = createUserfromConsole();
        FileWriter fileWriter = new FileWriter(PATH, true);
        fileWriter.append(user.toString()).append("\n");
        System.out.println("User was successfully added");
        fileWriter.close();
    }

    public static void printUsers() throws IOException {
        FileReader fileReader = new FileReader(PATH);
        Scanner scanner = new Scanner(fileReader);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.print(scanner.next());
        }
    }
}
