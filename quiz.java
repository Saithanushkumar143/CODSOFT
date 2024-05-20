import java.util.Scanner;
class Quiz {
    public static void conductQuiz(Scanner sc) {
    
    System.out.println("WHO WAS THE FOUNDER OF CODSPOT ?");
    System.out.println("1. STANLY WALCA");
    System.out.println("2. ELON  MUSK");
    System.out.println("3.SUNDAR PICHAY");

    char answer = sc.next().charAt(0);
    switch (answer) {
        case '1':
        System.out.println("YES YOU ARE CORRECT DUDE");
            
            break;

        case '2':
        System.out.println("SORRY YOU R WRONG BRO");
            break;

        case '3':
        System.out.println("SORRY YOU R WRONG BRO");
            break;
    
        default:
        System.out.println("USE APPORIATE OPTION");

            break;
    }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
    Scanner scanner = new Scanner(System.in);
    String name = sc.next();
    System.out.println("HI, "   + name);



        long startTime = System.nanoTime();
         conductQuiz(sc);

         long endTime = System.nanoTime();
          long executionTime = (endTime - startTime)/1000000000;
          System.out.println("Time taken: " + executionTime + "ms");
          sc.close();
    }
}
    
    