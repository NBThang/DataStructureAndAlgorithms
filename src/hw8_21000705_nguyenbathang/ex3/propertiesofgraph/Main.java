package hw8_21000705_nguyenbathang.ex3.propertiesofgraph;

import hw8_21000705_nguyenbathang.ex1.Graph;
import hw8_21000705_nguyenbathang.ex1.UndirectedGraph;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph();
        int ver0 = graph.insertVertex(0);
        int ver1 = graph.insertVertex(1);
        int ver2 = graph.insertVertex(2);
        int ver3 = graph.insertVertex(3);
        int ver4 = graph.insertVertex(4);
        int ver5 = graph.insertVertex(5);
        int ver6 = graph.insertVertex(6);

        Graph.Edge eg1 = graph.insertEdge(ver0, ver1);
        Graph.Edge eg2 = graph.insertEdge(ver0, ver2);
        Graph.Edge eg3 = graph.insertEdge(ver1, ver2);
        Graph.Edge eg4 = graph.insertEdge(ver1, ver3);
        Graph.Edge eg5 = graph.insertEdge(ver2, ver4);
        Graph.Edge eg6 = graph.insertEdge(ver3, ver4);
        Graph.Edge eg7 = graph.insertEdge(ver4, ver5);
        Graph.Edge eg8 = graph.insertEdge(ver5, ver6);

        System.out.println("number of Vertices: " + graph.numVertices());
        System.out.println("number of Edges: " + graph.numEdges());
        System.out.println("lever of Graph: " + graph.numVertices()*2);
    }

    public static boolean checkEdge(UndirectedGraph graph, int vertex1, int vertex2) {
        List<Graph.Edge> listEdgesContainVertex = new ArrayList<>();
        listEdgesContainVertex = graph.outGoingEges(vertex1);

        for (int i = 0; i < listEdgesContainVertex.size(); i++) {
            if (listEdgesContainVertex.get(i).getVertex1() == vertex2 || listEdgesContainVertex.get(i).getVertex1() == vertex2) {
                return true;
            }
        }
        return false;
    }

    public static void adjVertices(UndirectedGraph graph, int vertex) {
        List<Graph.Edge> listEdgesContainVertex = new ArrayList<>();
        listEdgesContainVertex = graph.outGoingEges(vertex);

        System.out.print("list adjacent vertex " + vertex + ": ");
        for (int i = 0; i < listEdgesContainVertex.size(); i++) {
            if (listEdgesContainVertex.get(i).getVertex1() != vertex) {
                System.out.print(listEdgesContainVertex.get(i).getVertex1() + " ");
            } else {
                System.out.print(listEdgesContainVertex.get(i).getVertex2() + " ");
            }
        }
    }
}
