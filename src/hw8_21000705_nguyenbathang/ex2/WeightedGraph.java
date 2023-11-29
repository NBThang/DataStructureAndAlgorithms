package hw8_21000705_nguyenbathang.ex2;

import hw8_21000705_nguyenbathang.ex1.Graph;

import java.util.ArrayList;
import java.util.List;

public class WeightedGraph implements Graph {
    private int numVertices;
    private int[][] adjMatrix;
    public WeightedGraph() {
        this.numVertices = 0;
        this.adjMatrix = null;
    }
    @Override
    public int numVertices() {
        return this.numVertices;
    }

    @Override
    public List vertices() {
        List<Integer> listVertices = new ArrayList<>();
        for (int i = 1; i <= numVertices; i++) {
            listVertices.add(adjMatrix[0][i]);
        }

        return listVertices;
    }

    @Override
    public int numEdges() {
        int countEdges = 0;
        for (int i = 1; i <= numVertices; i++) {
            for (int j = 1; j <= numVertices; j++) {
                countEdges += adjMatrix[i][j];
            }
        }

        return countEdges;
    }

    @Override
    public List edges() {
        List<Edge> listEdges = new ArrayList<>();
        for (int i = 1; i <= numVertices; i++) {
            for (int j = i + 1; j <= numVertices; j++) {
                if (adjMatrix[i][j] == 1) {
                    listEdges.add(new Edge(i, j));
                }
            }
        }

        return listEdges;
    }

    @Override
    public Edge getEdge(int vertex1, int vertex2) {
        return new Edge(vertex1 ,vertex2);
    }

    @Override
    public int[] endVertices(Edge e) {
        int[] vertices = new int[2];
        vertices[0] = e.getVertex1();
        vertices[1] = e.getVertex2();
        return vertices;
    }

    @Override
    public int opposite(int vertex, Edge e) {
        if(e.getVertex1() == vertex){
            return e.getVertex2();
        } else if (e.getVertex2() == vertex) {
            return e.getVertex1();
        }else {
            System.out.println("no is vertex");
            return -1;
        }
    }

    @Override
    public int outDegree(int vertice) {
        int numEdges = 0;
        int indexVertice = -1;
        for (int i = 0; i <= numVertices; i++) {
            if (adjMatrix[0][i] == vertice) {
                indexVertice = i;
                break;
            }
        }

        if (indexVertice == -1) {
            System.out.println("don't exist Vertex " + vertice);
            return 0;
        }

        for (int i = 1; i <= numVertices; i++) {
            numEdges += adjMatrix[i][indexVertice];
        }
        return numEdges;
    }

    @Override
    public List outGoingEges(int vertex1) {
        List listOutGoingEges = new ArrayList<Edge>();

        List<Edge> list = edges();
        for (Edge edge : list) {
            if (edge.getVertex1() == vertex1 || edge.getVertex2() == vertex1) {
                listOutGoingEges.add(edge);
            }
        }
        return listOutGoingEges;
    }

    @Override
    public int insertVertex(int x) {
        if (numVertices == 0) {
            adjMatrix = new int[2][2];
            adjMatrix[0][1] = x;
            adjMatrix[1][0] = x;
            numVertices++;
            return x;
        }

        int[][] tempMatrix = new int[numVertices + 2][numVertices + 2];

        for (int i = 0; i <= numVertices; i++) {
            for (int j = 0; j <= numVertices; j++) {
                tempMatrix[i][j] = adjMatrix[i][j];
            }
        }
        tempMatrix[0][numVertices + 1] = x;
        tempMatrix[numVertices + 1][0] = x;

        adjMatrix = tempMatrix;
        numVertices++;

        return x;
    }

    @Override
    public Edge insertEdge(int vertexStart, int vertexEnd) {
        int idexStart = -1;
        int idexEnd = -1;
        for (int i = 1; i <= numVertices; i++) {
            if (adjMatrix[0][i] == vertexStart) {
                idexStart = i;
                break;
            }
        }

        for (int j = 1; j <= numVertices; j++) {
            if (adjMatrix[j][0] == vertexEnd) {
                idexEnd = j;
                break;
            }
        }

        if (idexStart == -1) {
            System.out.println("don't exist Vertex " + vertexStart);
            return null;
        } else if (idexEnd == -1) {
            System.out.println("don't exist Vertex " + vertexEnd);
            return null;
        }

        adjMatrix[idexStart][idexEnd] = 1;

        return new Edge(vertexStart, vertexEnd);
    }

    public Edge insertEdge(int vertexStart, int vertexEnd, int storing) {
        int idexStart = -1;
        int idexEnd = -1;
        for (int i = 1; i <= numVertices; i++) {
            if (adjMatrix[0][i] == vertexStart) {
                idexStart = i;
                break;
            }
        }

        for (int j = 1; j <= numVertices; j++) {
            if (adjMatrix[j][0] == vertexEnd) {
                idexEnd = j;
                break;
            }
        }

        if (idexStart == -1) {
            System.out.println("don't exist Vertex " + vertexStart);
            return null;
        } else if (idexEnd == -1) {
            System.out.println("don't exist Vertex " + vertexEnd);
            return null;
        }

        if (adjMatrix[idexStart][idexEnd] == 0) {
            adjMatrix[idexStart][idexEnd] = storing;
        }

        return new Edge(vertexStart, vertexEnd);
    }

    @Override
    public void removeVertex(int vertex) {
        int indexVertex = -1;

        for (int i = 1; i <= numVertices; i++) {
            if (adjMatrix[0][i] == vertex) {
                indexVertex = i;
                break;
            }
        }

        if (indexVertex == -1) {
            System.out.println("Vertex " + vertex + " not found.");
            return;
        }


        for (int i = indexVertex; i <= numVertices - 1; i++) {
            for (int j = 0; j <= numVertices - 1; j++) {
                adjMatrix[i][j] = adjMatrix[i + 1][j];
            }
        }

        for (int i = 0; i <= numVertices - 1; i++) {
            for (int j = indexVertex; j <= numVertices - 1; j++) {
                adjMatrix[i][j] = adjMatrix[i][j + 1];
            }
        }

        int[][] newMatrix = new int[numVertices][numVertices];
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                newMatrix[i][j] = adjMatrix[i][j];
            }
        }
        numVertices--;
        adjMatrix = newMatrix;
    }

    @Override
    public void removeEdge(Edge edge) {
        int indexStart = -1;
        int indexEnd = -1;

        for (int i = 1; i <= numVertices; i++) {
            if (adjMatrix[0][i] == edge.getVertex1()) {
                indexStart = i;
                break;
            }
        }

        for (int j = 1; j <= numVertices; j++) {
            if (adjMatrix[j][0] == edge.getVertex2()) {
                indexEnd = j;
                break;
            }
        }

        if (indexStart == -1 || indexEnd == -1) {
            System.out.println("Edge " + edge + " not found.");
            return;
        }

        adjMatrix[indexStart][indexEnd] = 0;
    }

    @Override
    public void display() {
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[0].length; j++) {
                System.out.print(adjMatrix[i][j] + "\t");
                if (j < adjMatrix[0].length - 1) {
                    System.out.print("|" + "\t");
                }
            }
            System.out.println();

            if (i < adjMatrix.length - 1) {
                for (int k = 0; k < adjMatrix[0].length * 2 - 1; k++) {
                    System.out.print("----");
                }
                System.out.println();
            }
        }
    }
}
