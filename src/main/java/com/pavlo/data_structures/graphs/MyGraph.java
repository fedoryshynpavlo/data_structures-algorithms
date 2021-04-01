package com.pavlo.data_structures.graphs;

import java.util.ArrayList;
import java.util.Hashtable;

public class MyGraph {

    private int numberOfNodes = 0;
    private Hashtable<Integer, ArrayList<Integer>> adjacentList;

    public MyGraph() {
        this.adjacentList = new Hashtable<>();
    }

    public void addVertex(Integer node) {
        adjacentList.put(node, new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(Integer nodeOne, Integer nodeTwo) {
        adjacentList.get(nodeOne).add(nodeTwo);
        adjacentList.get(nodeTwo).add(nodeOne);
    }

    public void printGraph() {
        for(int key : adjacentList.keySet()) {
            System.out.println(key  + "---->" + adjacentList.get(key));
        }
    }

    public static void main(String[] args) {
        MyGraph graph = new MyGraph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);
        graph.printGraph();
    }
}
