package com.kodilla;
import java.util.Scanner;

public class RealUser implements User {

    @Override
    public int yourMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gdzie stawiasz X?");
        int value = Integer.parseInt(scanner.nextLine());
        return value;
    }
}
