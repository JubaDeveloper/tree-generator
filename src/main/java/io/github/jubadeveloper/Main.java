package main.java.io.github.jubadeveloper;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            throw  new Exception("Tree size should be provided");
        }
        try {
            Tree tree = new Tree(Integer.parseInt(args[0]));
            tree.generateTree();
            System.out.println(tree.generateOutput());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}