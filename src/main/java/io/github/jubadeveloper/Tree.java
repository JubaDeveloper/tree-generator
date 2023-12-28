package main.java.io.github.jubadeveloper;

public class Tree implements main.java.io.github.jubadeveloper.contracts.Tree {
    private int size;
    private final StringBuilder tree;
    public Tree (int size) {
        this.size = size;
        this.tree = new StringBuilder();
    }
    public void generateTreeInverse () {
        String treeTop = "*";
        String treeLeave = "0";
        String trunkTree = "|";
        int sizeRef = size;
        tree.append("  ".repeat(Math.max(0, (sizeRef / 2) - 1)));
        tree.append(trunkTree).append("\n");
        int spaces = 0;
        while (this.size-- > 0) {
            int s = this.size;
            tree.append(" ".repeat(spaces));
            for (int x = 0; x < s; x++) {
                tree.append(this.size - 1 == 0 ? treeTop : treeLeave).append(" ");
            }
            tree.append("\n");
            spaces++;
        }
    }

    public void generateTree () {
        String treeTop = "*";
        String treeLeave = "0";
        String trunkTree = "|";
        int sizeRef = size;
        int spaces = this.size;
        int iterator = 0;
        while (iterator++ < this.size) {
            int s = iterator;
            tree.append(" ".repeat(spaces));
            for (int x = 0; x < s; x++) {
                tree.append(iterator == 1 ? treeTop : iterator % 2 == 0 ? treeLeave : treeTop).append(" ");
            }
            tree.append("\n");
            spaces--;
        }
        tree.append(" ".repeat(Math.max(0, ((sizeRef + 1) * 2 / 2) - 1)));
        tree.append(trunkTree).append("\n");
    }

    @Override
    public String generateOutput() {
        return tree.toString();
    }
}
