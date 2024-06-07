import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class quiz {
    private static Timer timer;
    private static final int TIMEOUT = 5000; // Time in milliseconds
    private static boolean timeUp;
    private static int correctAnswers;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("WELCOME TO THE QUIZ :)");
            System.out.println("YOU HAVE ONLY 5 SECS TO ANSWER EACH QUESTION");
            correctAnswers = 0;
            question1(sc);
        }
        System.out.println("THE ANSWERS YOU HAVE ANSWERED CORRECTLY ARE "+ correctAnswers );
    }

    private static void question1(Scanner sc) {
        System.out.println("Q1. WHO WAS THE FOUNDER OF CODSOFT?");                ///QUESTION 1
        System.out.println("1. STANLY WALCA");
        System.out.println("2. ELON MUSK");
        System.out.println("3. SUNDAR PICHAI");
        startTimer();
        int answer1 = sc.nextInt();
        stopTimer();

        if (!timeUp) {
            if (answer1 == 1) {
                System.out.println("YAY! YOUR ANSWER IS CORRECT");
                correctAnswers++;
            } else {
                System.out.println("I AM SORRY YOU ARE WRONG");
            }
        }
        question2(sc);
    }

    private static void question2(Scanner sc) {
        System.out.println("Q2. CODSOFT WAS ESTABLISHED IN THE YEAR?");            ///QUESTION 2
        System.out.println("1. 2014");
        System.out.println("2. 2015");
        System.out.println("3. 2016");
        startTimer();
        int answer2 = sc.nextInt();
        stopTimer();

        if (!timeUp) {
            if (answer2 == 2) {
                System.out.println("YAY! YOUR ANSWER IS CORRECT");
                correctAnswers++;
            } else {
                System.out.println("I AM SORRY YOU ARE WRONG");
            }
        }
        question3(sc);
    }

    private static void question3(Scanner sc) {
        System.out.println("Q3. JAVA WAS INTRODUCED IN THE YEAR?");                ///QUESTION3
        System.out.println("1. 1995");
        System.out.println("2. 1996");
        System.out.println("3. 1994");
        startTimer();
        int answer3 = sc.nextInt();
        stopTimer();

        if (!timeUp) {
            if (answer3 == 1) {
                System.out.println("YAY! YOUR ANSWER IS CORRECT");
                correctAnswers++;
            } else {
                System.out.println("I AM SORRY YOU ARE WRONG");
            }
        }
        System.out.println("QUIZ HAS ENDED");
    }

    private static void startTimer() {
        timeUp = false;                                                                 ///TIMER 
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                timeUp = true;
                System.out.println("TIME'S UP! LET'S MOVE ON TO THE NEXT QUESTION\nPRESS ANY NUMBER AND THEN CLICK ON ENTER.");
                timer.cancel();
            }
        }, TIMEOUT);
    }

    private static void stopTimer() {
        if (timer != null) {
            timer.cancel();
        }
    }
}
