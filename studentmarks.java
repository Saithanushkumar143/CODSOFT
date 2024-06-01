import java.util.Scanner;
class student_marks {
    public static void main(String[] args) {
        System.out.println("HI WELCOME TO THE GRADE CALCULATOR");
        System.out.println("ENTER YOUR NAME ");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println("HI "+ name);
            
            System.out.println("ENTER YOUR TELUGU MARKS");
            int tel = sc.nextInt();
            System.out.println("ENTER YOUR HINDI MARKS");
            int hin = sc.nextInt();
            System.out.println("ENTER YOUR ENGLISH MARKS");
            int eng = sc.nextInt();
            System.out.println("ENTER YOUR MATHS MARKS");
            int mat = sc.nextInt();
            System.out.println("ENTER YOUR SCIENCE MARKS");
            int sci = sc.nextInt();
            System.out.println("ENTER YOUR SOCIAL MARKS");
            int soc = sc.nextInt();
            int  tot = tel + hin + eng + mat + sci + soc;
            int avg = (tot)/6 ;
            int avg_per = (avg * 100)/600 ;
            System.out.println("YOUR TOTAL MARKS ARE  "+ tot );
            System.out.println("YOUR AVERAGE MARKS ARE  "+ avg);
            System.out.println("YOUR AVERAGE PERCENTAGE IS " + avg_per);
            if(avg >= 90 && avg <= 100 ){
                System.out.println(" YOU ARE HAVING A GRADE OF A+");
            }
            else if( avg >= 80 && avg <= 89){
                System.out.println("YOU ARE HAVING A GRADE OF A");
            }
            else if( avg >= 70 && avg <= 79){
                System.out.println("YOU ARE HAVING A GRADE OF B");
            }
            else if( avg >= 60 && avg <= 69){
                System.out.println("YOU ARE HAVING A GRADE OF C");
            }
            else if( avg >= 50 && avg <= 59){
                System.out.println("YOU ARE HAVING A GRADE OF D");
            }
            else{
                System.out.println("YOU ARE FAILED");
            }
        }
        
    }
}
    