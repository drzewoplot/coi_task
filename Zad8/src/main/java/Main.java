import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] drzewa = {"brzoza","modrzew", "grab", "buk", "wierzba"};
        printTrees(drzewa);
    }

    private static void printTrees(String[] drzewa) {
        List<String> trees = Arrays.asList(drzewa);
        Iterator<String> treeIterator = trees.iterator();
        while (treeIterator.hasNext()) {
            String tree = treeIterator.next();
            System.out.println(tree);
        }
    }
}
