public class graph_coloring
{
  static int v = 5;
  static int color[];
static  boolean isSafe(int graph[][], int vertex, int color[], int c)
  {
    for(int i =0; i<v; i++)
    {
      if(graph[vertex][i] ==1 && c==color[i])
      {
        return false;
      }
    }
    return true;
  }
static  boolean  graphColoringUtil(int graph[][], int m, int color[], int vertex)
  {
    if(vertex == v)
    {
      return true;
    }
    for(int c =1; c<=m; c++)
    {
      if(isSafe(graph,vertex,color,c))
      {
        color[vertex] = c;
        if(graphColoringUtil(graph,m,color,vertex+1))
        {
          return true;
        }
        color[vertex] =0;
      }
    }
    return false;
  }
  static void printSolution(int color[])
  {
    System.out.println("Solution Exists: Following are the assigned colors");
        for (int i = 0; i < v; i++)
        {
          System.out.print(" " + color[i] + " ");
          System.out.println();
        }

  }
static  boolean  graphColoring(int graph[][], int m)
  {
    color = new int[v];
    for(int i =0; i<v; i++)
    {
      color[i] = 0;
    }
    if (!graphColoringUtil(graph,m,color,0))
    {
      System.out.println("solution does not exist");
      return false;
    }
    printSolution(color);
    return true;
  }
  public static void main(String[] args)
  {
    int graph[][] =
    {{0,1,1,0,1},
    {1,0,1,0,1},
    {1,1,0,1,0},
    {0,0,1,0,1},
    {1,1,0,1,0}
  };
  int m = 3;
  graphColoring(graph, m);
  }
}
