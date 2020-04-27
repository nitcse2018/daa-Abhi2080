// A Java program for Prim's algorithm.

import java.util.*;
import java.lang.*;
import java.io.*;

class MST {
    // Number of vertices.
    private static final int V = 5;

    // A utility function to find the vertex with minimum key
    // value, from the set of vertices not yet included in MST
    int minKey(int key[], int mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (mstSet[v] == 0 && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed MST stored in
    // parent[]
    void printans(int parent[], int graph[][])
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }

    // Function to perform prim's algorithm
    void primsMST(int graph[][])
    {
        // Array to store constructed MST
        int parent[] = new int[V];

        //array of Key values of the vertices.
        int key[] = new int[V];

        // To represent set of vertices not yet included in MST
        int mstSet[] = new int[V];

        // Initialize all keys as INFINITE as all entries in msSet as zero.
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = 0;
        }

        //include first 1st vertex in MST.
        key[0] = 0;
        parent[0] = -1; // First node is root of MST

        // The MST will have V vertices
        for (int c = 0; c < V - 1; c++) {

            // Pick thd minimum key vertex which is not yet included in msSet.

            int u = minKey(key, mstSet);

            // Add the picked vertex to the MST Set
            mstSet[u] = 1;

            // Update key value and parent index of the adjacent vertices of the picked vertex. Consider only those vertices which are not yet included in MST
            for (int v = 0; v < V; v++)

                if (graph[u][v] != 0 && mstSet[v] == 0 && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }

        // print the constructed MST
        printans(parent, graph);
    }
  }

public class prims{
public static void main(String[] args)
    {
        // create the graph

        MST t = new MST();
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                      { 2, 0, 3, 8, 5 },
                                      { 0, 3, 0, 0, 7 },
                                      { 6, 8, 0, 0, 9 },
                                      { 0, 5, 7, 9, 0 } };

        // Print the solution
        t.primsMST(graph);
    }
}
