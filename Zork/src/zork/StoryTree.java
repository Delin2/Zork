/**
* Dennis Lin
* 109426873
* Homework #5
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
* Grading TA: Xi Zhang   
 */

package zork;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoryTree {
    StoryTreeNode root;
    StoryTreeNode cursor;
    GameState state;
    
    /**
     * Default constructor for the StoryTree class.
     */
    public StoryTree(){
        root.position = "root";
        root.option = "root";
        root.message = "Hello, welcome to Zork!";
    }
    
    public static  StoryTree readTree(String filename)throws IllegalArgumentException, FileNotFoundException{
        if(filename.isEmpty() == true)
            throw new IllegalArgumentException("Empty filename");
        else{
            Scanner fileIn = new Scanner("myfile.txt");
            while(fileIn.hasNextLine()){
                System.out.println(fileIn.nextLine());
            }
            fileIn.close();
            StoryTree nStoryTree = new StoryTree();
        }return null;
    }
    
    public static void saveTree(String filename, StoryTree tree)throws IllegalArgumentException{
        if(filename.isEmpty() == true || tree == null)
            throw new IllegalArgumentException("Empty filename or tree is null");
        else{
            StoryTreeNode r = tree.getRoot();
        }
    }
    public StoryTreeNode getRoot(){
        return root;
    }
    
    public GameState getGameState(){
            return state;
    }
    
    public String getCursorPosition(){
        return cursor.position;
    }
    
    public String getCursorMessage(){
        return cursor.message;
    }
    
    /*
    public String[]][] getOptions(){
        return ;
    }
    */
    
    public void setCursorMessage(String message){
        cursor.message = message;
    }
    
    public  void setCursorOption(String option){
        cursor.option = option;
    }
    
    public  void resetCusor(){
        cursor = root;
    }
    
    public void selectChild(String position){
        if(position.equals("1"))
            cursor.getLeftChild();
        else if(position.equals("2"))
            cursor.getMiddleChild();
        else if(position.equals("3"))
            cursor.getRightChild();
    }
    
    /*
    public void addChild(String option, String message){
        if(cursor.leftChild == null)
            StoryTreeNode newLeftStoryTreeNode = new StoryTreeNode();
        else if(cursor.leftChild != null && cursor.middleChild == null)
            
        else if(cursor.leftChild != null && cursor.middleChild != null && cursor.rightChild == null)    
    }
    */
}
