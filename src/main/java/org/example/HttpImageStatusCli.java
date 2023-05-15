package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() {
        Scanner scanner = new Scanner(System.in);

        int code = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter HTTP status code: ");
                code = scanner.nextInt();
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
        try {
            httpStatusImageDownloader.downloadStatusImage(code);

        } catch (Exception e) {
            System.out.println(("There is not image for HTTP status " + code));

        }
    }

}
