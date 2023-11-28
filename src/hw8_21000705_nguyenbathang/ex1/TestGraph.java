package hw8_21000705_nguyenbathang.ex1;

import java.util.List;

public class TestGraph {
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph();
        int ver0 = graph.insertVertex(0);
        int ver1 = graph.insertVertex(1);
        int ver2 = graph.insertVertex(2);
        int ver3 = graph.insertVertex(3);
        int ver4 = graph.insertVertex(4);
        int ver5 = graph.insertVertex(5);
        int ver6 = graph.insertVertex(6);
        int ver7 = graph.insertVertex(178);

        Graph.Edge eg1 = graph.insertEdge(ver0, ver1);
        Graph.Edge eg2 = graph.insertEdge(ver0, ver2);
        Graph.Edge eg3 = graph.insertEdge(ver1, ver2);
        Graph.Edge eg4 = graph.insertEdge(ver1, ver3);
        Graph.Edge eg5 = graph.insertEdge(ver2, ver4);
        Graph.Edge eg6 = graph.insertEdge(ver3, ver4);
        Graph.Edge eg7 = graph.insertEdge(ver4, ver5);
        Graph.Edge eg8 = graph.insertEdge(ver5, ver6);
        Graph.Edge eg9 = graph.insertEdge(ver6, ver7);

        System.out.println("num vertices is: " + graph.numVertices());
        System.out.println("num edges is: " + graph.numEdges());
        System.out.println("opposite: " + graph.opposite(ver1, eg4));
        System.out.println("out degree from " + ver1 + " = " + graph.outDegree(ver1));
        int[] endVertices = graph.endVertices(eg5);
        System.out.println("eg5 = (" + endVertices[0] + "-" + endVertices[1] + ")");
        graph.removeEdge(eg3);
        graph.removeVertex(ver7);

        System.out.println("after delete vertex " + ver7 + " and delete edge3 ");

        System.out.println("num vertices is: " + graph.numVertices());
        System.out.println("num edges is: " + graph.numEdges());
        System.out.println("opposite: " + graph.opposite(ver1, eg4));
        System.out.println("out degree from " + ver1 + " = " + graph.outDegree(ver1));

        System.out.println("----------------------------------------------------------------");

        System.out.println("Adjacency Matrix");
        graph.display();
    }
}
