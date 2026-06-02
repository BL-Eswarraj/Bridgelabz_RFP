package Day_15_Practice_Problem_HT_BST;

public class BSTMain {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        // ROOT MUST BE PUBLIC FOR THIS LINE TO WORK
        System.out.println("Root: " + myBST.root);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */
        System.out.println("Root: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);


        System.out.println("BST Contains 27:");
        System.out.println(myBST.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.contains(17));

    }
}
