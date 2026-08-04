import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 50) + 1;
        System.out.println(randomNum);
        int guessNumber;
        int attempts = 0;
        while (true) {
            System.out.println("Which level would you like to play?");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");
            System.out.println("4. Quit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
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
                                attempts = 5;
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
                                attempts = 5;
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
                                attempts = 5;
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
