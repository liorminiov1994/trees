import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.setValue(3);
        root.insert(1);
        root.insert(5);
        root.insert(4);
        root.insert(2);
        System.out.println("the max value is " + "" + root.getMaxValue());

    }
}
