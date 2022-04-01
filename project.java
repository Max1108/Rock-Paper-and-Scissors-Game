
import java.util.Random;
import java.util.Scanner;

public class project {
    public static void main(String arg[]){
 
        int comp = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Computer Turn: Rock(1), Paper(2) and Scissors(3)");
        System.out.println("Your Turn: Rock(1), Paper(2) and Scissors(3) ");
        int you = input.nextInt();
        
        Random ran = new Random();
        int random = ran.nextInt(1,4);
        
        if(random==1){
            comp = 1 ;
        }
        else if(random==2){
            comp = 2;
        }
        else if(random==3){
            comp = 3;
        }

        
        if(comp==1){
            if(you==3){
                System.out.println("You lose");
            }
                                    //Rock(1), Paper(2) and Scissors(3)
            else{
                System.out.println("You win");
            }
        }
        if(comp==2){
            if(you==1){
                System.out.println("You lose");
            }
            else{
                System.out.println("You win");
            }
        }
        if(comp==3){
            if(you==2){
                System.out.println("You lose");
            }
            else{
                System.out.println("You win");
            }
            
        }
        if(comp==you){
            System.out.println("Game is Tie.");
        }
        

        System.out.println("Comp choose "+comp);
        System.out.println("You choose "+you);
        input.close();
    }
    

        
    }
