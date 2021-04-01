package com.pavlo.data_structures.trees;

public class BinarySearchTree {

    private MyNode element;

    public BinarySearchTree() {
        this.element = null;
    }

    public void insert(Integer value) {
        MyNode node = new MyNode(value, null, null);
        if (element == null) {
            element = node;
            return;
        }
        MyNode currentNode = element;
        while (true) {
            if (currentNode.getValue() > value) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(node);
                    return;
                }
                currentNode = currentNode.getLeft();
            } else {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(node);
                    return;
                }
                currentNode = currentNode.getRight();
            }
        }

    }

    public MyNode lookup(Integer value) {
        if (element.getValue().equals(value)) {
            return element;
        }
        MyNode currentNode = element;
        while (currentNode != null) {
            if (currentNode.getValue() > value) {
                currentNode = currentNode.getLeft();
            } else if (currentNode.getValue() < value) {
                currentNode = currentNode.getRight();
            } else if (currentNode.getValue().equals(value)) {
                return currentNode;
            }
        }
        return null;
    }

    public void remove(Integer value) {
        MyNode nodeToRemove = element;
        MyNode parentNode = null;
        //search for node to remove and its parent node
        while (!nodeToRemove.getValue().equals(value)) {
            parentNode = nodeToRemove;
            if (nodeToRemove.getValue() > value) {
                nodeToRemove = nodeToRemove.getLeft();
            } else if (nodeToRemove.getValue() < value) {
                nodeToRemove = nodeToRemove.getRight();
            }
        }
        MyNode replacementNode = null;
        if (nodeToRemove.getRight() != null) { //node to remove has child right node
            replacementNode = nodeToRemove.getRight();
            if (replacementNode.getLeft() == null) { // replacement node don't have left child node
                replacementNode.setLeft(nodeToRemove.getLeft());
            } else { //node to remove has both child nodes
                MyNode node = replacementNode;
                while(replacementNode.getLeft()!=null) {
                    node = replacementNode;
                    replacementNode = replacementNode.getLeft();
                }
                node.setLeft(null);
                replacementNode.setLeft(nodeToRemove.getLeft());
                replacementNode.setRight(nodeToRemove.getRight());
            }
        } else if (nodeToRemove.getLeft() != null) { //node for remove has left child node
            replacementNode = nodeToRemove.getLeft();
        }
        if (parentNode == null) {
            element = replacementNode;
        } else if (parentNode.getLeft() == nodeToRemove) {
            parentNode.setLeft(replacementNode);
        } else {
            parentNode.setRight(replacementNode);
        }

    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(20);
        tree.insert(1);
        tree.insert(6);
        tree.insert(15);
        tree.insert(70);
        tree.insert(25);
        tree.insert(75);
        tree.insert(8);
        MyNode node = tree.lookup(70);

    }
}
