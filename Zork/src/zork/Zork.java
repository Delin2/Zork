/**
* Dennis Lin
* 109426873
* Homework #5
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
* Grading TA: Xi Zhang   
 */

package zork;

import java.util.Scanner;

public class Zork {
    private static Scanner input = new Scanner(System.in);
    private static Boolean quit = false;
    private static Boolean edit = false;
    private static Boolean play = false;
    
    public static void main(String[] args) {
        while(!quit && !edit && !play)
        System.out.println("Hello and Welcome to Zork! \n");
            switch(getSelection2()){
                case 'E':
                    edit = true;
                    break;
                case 'P':    
                    play = true;
                    System.out.println("Let's Play!");
                    break;
                case 'Q':
                    exit();
        }
    }
    public static void editTree(StoryTree tree) {
        
        while (edit = true) {
            displayEdit();
            switch (getSelection()) {
                case 'V':
                    System.out.println("Position: " +tree.getCursorPosition()+ 
                            "\n Option: " +tree.cursor.option+
                            "\n Message: " + tree.getCursorMessage());
                    break;
                case 'S':
                    System.out.println("Please select a child: ");
                    String position = input.nextLine();
                    tree.selectChild(position);
                case 'O':
                    System.out.println("Please enter an new option:");
                    String option = input.nextLine();
                    tree.setCursorOption(option);
                case 'M':
                    System.out.println("Please enter a new Message: ");
                    String message = input.nextLine();
                    tree.setCursorMessage(message);
                case 'R':
                    tree.resetCusor();
                    System.out.println("Cursor moved to root");
                case 'Q':
                    edit = false;
                default:
                    System.out.println("\n Please choose the operation from above \n");
                    break;
            }
        }

    }
    
    public static void playTree(StoryTree tree){
        while(play = true)
            System.out.println("Thanks for playing.");
        play = false;
    }
    
    public static void displayEdit() {
        System.out.println(
                "Zork Editor:" +
                        "V: View the cursor's position, option, and message. \n" +
                        "S: Select a child of this cursor (options are 1, 2, and 3). \n" +
                        "O: Set the option of the cursor. \n" +
                        "M: Set the message of the cursor. \n" +
                        "A: Add a child StoryNode to the cursor. \n" +
                        "D: Delete one of the cursor's children and all its descendants. \n" +
                        "R: Move the cursor to the root of the tree. \n" +
                        "Q: Quit editing and return to main menu. \n");
    }
        
    public static char getSelection() {
        System.out.print("Please select an option: ");
        String s = input.nextLine();
        if (s.length() > 1)
            return 'Z';
        else
            return s.toUpperCase().charAt(0);
    }
    
    public static char getSelection2() {
        System.out.print("Would you like to edit (E), play(P) or quit(Q)?");
        String s = input.nextLine();
        if (s.length() > 1)
            return 'Z';
        else
            return s.toUpperCase().charAt(0);
    }
        
    /**
     * This method ends the program.
     */
    public static void exit(){
        quit = true;
        System.out.println("Program terminating normally...");
    }
}
