// trees- עצים (מבנה נתונים )
public class TreeNode {
    // Node -קודקוד
    private int value;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int valueToInsert) {
        TreeNode newNode = new TreeNode();
        newNode.setValue(valueToInsert);
        if (this.value < valueToInsert) {
            if (this.rightChild == null) {
                this.rightChild = newNode;
            } else {
                this.rightChild.insert(valueToInsert);
            }

        } else {
            if (this.leftChild == null) {
                this.leftChild = newNode;
            } else {
                this.leftChild.insert(valueToInsert);
            }
        }


    }

    public boolean isLeaf () {
        boolean leaf = false;
        if (this.rightChild == null && this.leftChild == null ) {
            leaf = true;

        }
        return leaf;

    }
    public int getMaxValue () {
        int maxValue;
        if (this.rightChild == null) {
            maxValue = this.value ;


        }
    }

    public int getMinValue () {

    }





    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
