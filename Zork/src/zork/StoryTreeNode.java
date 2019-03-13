/**
* Dennis Lin
* 109426873
* Homework #5
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
* Grading TA: Xi Zhang   
 */

package zork;

public class StoryTreeNode {
    static final String WIN_MESSAGE = "YOU WIN";
    static final String LOSE_MESSAGE = "YOU lOSE";
    String position;
    String option;
    String message;
    StoryTreeNode leftChild;
    StoryTreeNode middleChild;
    StoryTreeNode rightChild;
    
    /**
     * Default constructor for the StoryTreeNode class.
     * @param position 
     * @param option 
     * @param message 
     */
    public StoryTreeNode(String position, String option, String message){
        leftChild = null;
        middleChild = null;
        rightChild = null;
        this.message = message;
        this.position = position;
        this.option = option;
    }
    
    /**
     * Brief:Checks if this node has any children.
     * Preconditions:This node is initialized
     * Postconditions:The tree remains unchanged
     * @return
     *      True if there are no children
     *      False if there is at least one child.
     */
    public boolean isLeaf(){
        return leftChild == null && middleChild == null && rightChild == null;
    }
    
    /**
     * Brief:Checks if this is a winning node. In order to be a winning node, this node must be a leaf and contain the winning message.
     * Preconditions:This node is initialized
     * Postconditions:The tree remains unchanged
     * @return 
     *      True if this node is a leaf and contains WIN_MESSAGE in the message.
     *      False otherwise.
     */
    public boolean isWinningNode(){
        return message.contains(WIN_MESSAGE);
    }
    
    /**
     * Brief:Checks if this is a losing node. In order to be a losing node, this node must be a leaf and contain the losing message.
     * Preconditions:This node is initialized
     * Postconditions:The tree remains unchanged
     * @return
     *      True if this node is a leaf and does NOT contain WIN_MESSAGE in the message.
     *      False otherwise. 
     */
    public boolean isLosingNode(){
        return !(message.contains(WIN_MESSAGE));
    }
    
    public StoryTreeNode getLeftChild(){
        return leftChild;
    }
    
    public StoryTreeNode getMiddleChild(){
        return middleChild;
    }
    
    public StoryTreeNode getRightChild(){
        return rightChild;
    }
    
}
