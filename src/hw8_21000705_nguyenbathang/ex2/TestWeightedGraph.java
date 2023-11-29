package hw8_21000705_nguyenbathang.ex2;

import hw8_21000705_nguyenbathang.ex1.Graph;

public class TestWeightedGraph {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        int ver0 = graph.insertVertex(0);
        int ver1 = graph.insertVertex(1);
        int ver2 = graph.insertVertex(2);
        int ver3 = graph.insertVertex(7);
        int ver4 = graph.insertVertex(9);

        Graph.Edge eg1 = graph.insertEdge(ver0, ver1, 15);
        Graph.Edge eg2 = graph.insertEdge(ver0, ver2, 14);
        Graph.Edge eg3 = graph.insertEdge(ver1, ver3, 9);
        Graph.Edge eg4 = graph.insertEdge(ver3, ver2, 7);
        Graph.Edge eg5 = graph.insertEdge(ver3, ver4, 6);
        Graph.Edge eg6 = graph.insertEdge(ver4, ver1, 2);

        System.out.println("num vertices is: " + graph.numVertices());
        System.out.println("num edges is: " + graph.numEdges());
        System.out.println("opposite: " + graph.opposite(ver0, eg1));
        System.out.println("out degree from " + ver1 + " = " + graph.outDegree(ver1));
        int[] endVertices = graph.endVertices(eg5);
        System.out.println("eg5 = (" + endVertices[0] + "-" + endVertices[1] + ")");
        graph.removeEdge(eg3);
        graph.removeVertex(ver3);

        System.out.println("after delete edge3 and ver3");

        System.out.println("num vertices is: " + graph.numVertices());
        System.out.println("num edges is: " + graph.numEdges());
        System.out.println("opposite: " + graph.opposite(ver1, eg4));
        System.out.println("out degree from " + ver1 + " = " + graph.outDegree(ver1));

        System.out.println("----------------------------------------------------------------");

        System.out.println("Adjacency Matrix");
        graph.display();
    }
}
