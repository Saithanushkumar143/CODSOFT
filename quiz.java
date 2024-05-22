import java.util.Scanner;
class Quiz {
    public static void main(String[] args) {
    System.out.println("YOU SHOULD ANSWER THE QUESTION BEFORE THE GOES UP ");
    System.out.println("ENTER YOUR NAME");
    try (Scanner sc = new Scanner(System.in)) {
        String name = sc.next();
        System.out.println("HI, "   + name);
      
        System.out.println("=======count down begins=======");
        Thread countdownThread = new Thread(new Runnable() {
        @Override
        public void run(){
            for(int i = 5; i >=0;i--){
                System.out.print(i + "    ");
                try{
                    Thread.sleep(1000);

                }catch(Exception e){
                    System.err.println("Error : " + e);
                }
            }
            System.out.println("\n FINISHED");
        }    
        });
        countdownThread.start();

        System.out.println("WHO WAS THE FOUNDER OF CODSPOT ?");
        System.out.println("1. STANLY WALCA");
        System.out.println("2. ELON MUSK");
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

    }
}