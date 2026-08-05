import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = 0;
        int guessNumber;
        int attempts = 0;
        int choice = 0;

        while (true) {
            boolean validChoice = false;

            while (!validChoice) {
                try {
                    System.out.println("Which level would you like to play?");
                    System.out.println("1. Easy");
                    System.out.println("2. Medium");
                    System.out.println("3. Hard");
                    System.out.println("4. Quit");
                    System.out.println("Please enter a number between 1 and 4");
                    choice = input.nextInt();
                    if  (choice >= 1 || choice <= 4) {
                        validChoice = true;

                    } else {
                        System.out.println("Invalid Input. Please enter a number between 1 and 4.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input. Please enter a number between 1 and 4.");
                    input.nextLine();
                }
            }


            switch (choice) {
                case 1:
                    randomNum = (int) (Math.random() * 50) + 1;
                    while (attempts < 4) {
                        System.out.println("Guess a number between 1 and 50");
                        try {
                            guessNumber = input.nextInt();
                            if (guessNumber < 1 || guessNumber > 50) {
                                System.out.println("Invalid input. Try again");
                            }

                            if (guessNumber < randomNum) {
                                System.out.println("Higher");
                            } else if (guessNumber > randomNum) {
                                System.out.println("Lower");
                            } else {
                                System.out.println("You Win");
                                break;
                            }

                        } catch (Exception e) {
                            System.out.println("Invalid input. Try again");
                            input.next();
                        }

                        attempts++;

                        if (attempts == 4) {
                            System.out.println("Sorry you lose");
                        }
                    }
                    break;
                case 2:
                    randomNum = (int) (Math.random() * 100) + 1;
                    while (attempts < 4) {
                        System.out.println("Guess a number between 1 and 100");
                        try {
                            guessNumber = input.nextInt();
                            if (guessNumber < 1 || guessNumber > 100) {
                                System.out.println("Invalid input. Try again");
                            }

                            if (guessNumber < randomNum) {
                                System.out.println("Higher");
                            } else if (guessNumber > randomNum) {
                                System.out.println("Lower");
                            } else {
                                System.out.println("You Win");
                                break;
                            }

                        } catch (Exception e) {
                            System.out.println("Invalid input. Try again");
                            input.next();
                        }

                        attempts++;
                        if (attempts == 4) {
                            System.out.println("Sorry you lose");
                        }
                    }
                    break;
                case 3:
                    randomNum = (int) (Math.random() * 2000) + 1;
                    while (attempts < 4) {
                        System.out.println("Guess a number between 1 and 2000");
                        try {
                            guessNumber = input.nextInt();
                            if (guessNumber < 1 || guessNumber > 2000) {
                                System.out.println("Invalid input. Try again");
                            }

                            if (guessNumber < randomNum) {
                                System.out.println("Higher");
                            } else if (guessNumber > randomNum) {
                                System.out.println("Lower");
                            } else {
                                System.out.println("You Win");
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input. Try again");
                            input.next();
                        }
                        attempts++;
                        if (attempts == 4) {
                            System.out.println("Sorry you lose");
                        }
                    }
                    break;
                case 4:
                    attempts = 6;
                    break;

                default:
                    System.out.println("Invalid input. Try again");
            }

            if (attempts == 6) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Would you like to play again? (Y/N)");
                String answer = input.next().toLowerCase();
                if (answer.equalsIgnoreCase("y")) {
                    randomNum = (int) (Math.random() * 50) + 1;
                    attempts = 0;

                } else {
                    System.out.println("Goodbye");
                    break;
                }
            }
        }
    }
}
