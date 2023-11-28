package hw8_21000705_nguyenbathang.ex1;

import java.util.List;

public interface Graph {
    public class Edge {
        private int vertex1;
        private int vertex2;

        public Edge(int vextex1, int vextex2) {
            this.vertex1 = vextex1;
            this.vertex2 = vextex2;
        }

        public int getVertex1() {
            return vertex1;
        }

        public int getVertex2() {
            return vertex2;
        }
    }

    // Returns the number of vertices of the graph.
    public int numVertices();

    // Returns an iteration of all the vertices of the graph.
    public List vertices();

    // Returns the number of edges of the graph.
    public int numEdges();

    // Returns an iteration of all the edges of the graph.
    public List edges();

    // Returns the edge from vertex u to vertex v, if one exists; otherwise return null.
    public Edge getEdge(int vertex1 ,int vertex2);

    // Returns an array containing the two endpoint vertices of edge e.
    // If the graph is directed, the first vertex is the origin and the second is the destination.
    public int[] endVertices(Edge e);

    // For edge e incident to vertex v, returns the other vertex of the edge; an error occurs if e is not incident to v.
    public int opposite(int vertex ,Edge e);

    // Returns the number of outgoing edges from vertex v.
    public int outDegree(int vertice);

    // Returns an iteration of all outgoing edges from vertex v.
    public List outGoingEges(int vertex1);

    // Creates and returns a new Vertex storing element x.
    public int insertVertex(int x);

//    Creates and returns a new Edge from vertex u to vertex v,
//    storing element x; an error occurs if there already exists an edge from u to v.
    public Edge insertEdge(int vertexStart ,int vertexEnd);

    // Removes vertex v and all its incident edges from the graph.
    public void removeVertex(int vertex);

    // Removes edge e from the graph.
    public void removeEdge(Edge edge);
    public void display();

}
