// print depth first search traversal
import java.io.*;
import java.util.*;

class Graph
{	
	// no. of vertices
	private int V; 
	
	// Array of lists for adjacency list representation
	private LinkedList<Integer> adj[];

	// constructor
	Graph (int v)
	{	
		// make no of vertices equal to argument sent
		// Vertices = nodes = elements
		V = v;
		
		// creating argument v no. of linkedlists
		adj = new LinkedList[v];
		for (int i=0; i<v; i++)
			adj[i] = new LinkedList();
		
	}

	// function to add an edge into the graph
	void addEdge(int v, int w)
	{	
		adj[v].add(w);
	}

	// DFS helper function
	void DFSUtil (int v, boolean visited[])
	{
		// mark current node as visited and print it 
		visited[v] = true;
		System.out.print(v+" ");
		
		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}	
	}
	
	// function to do Depth First Search traversal
	void DFS (int v)
	{
		// mark all the vertices as not visited
		// by default set to false in java
		boolean visited[] = new boolean[V];
		
		// call recursive helper function
		DFSUtil(v, visited);	

	}

	public static void main (String args[])
	{
		Graph g = new Graph(4);
	        
		g.addEdge(0, 1); 
        	g.addEdge(0, 2); 
        	g.addEdge(1, 2); 
        	g.addEdge(2, 0); 
        	g.addEdge(2, 3); 
        	g.addEdge(3, 3); 
  
        	System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        	g.DFS(2); 	
	}
}
