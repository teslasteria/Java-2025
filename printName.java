package javaEducation;

import java.io.IOException;
import java.util.Scanner;

public class printName {
    private String name;

    public printName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNameConsole() {
        System.out.println("Привет, " + name);
    }

    public void typeName() {
        Scanner scan = new Scanner(System.in);
        this.name = scan.next();
        scan.close();
    }

    public static void main(String[] args) {
        printName newName = new printName(null);
        newName.typeName();
        newName.printNameConsole();
    }
}
