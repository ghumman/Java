// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.

import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list representation 

class Graph 
{
	private int noVer; // no of vertices
	private LinkedList<Integer> adj[];	// Adjacency Lists
	
	// Constructor
	Graph(int v)
	{
		noVer = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++)
			adj[i] = new LinkedList();
	}
	
	// Add edge into the graph
	void add_edge(int v, int w)
	{
		adj[v].add(w);
	}

	// prints breadth first search traversal from a given source s
	void BFS(int s)
	{
		// Mark all vertices as not visited
		// by default is will be false
		boolean visited[] = new boolean [noVer];

		// create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);
		

		// keep doing following until queue size becomes 0
		while (queue.size() != 0)
		{
			// dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s+" ");
			
			// get all adjacent vertices of the dequeued vertex s
			// if adjacent vertex is not visited then mark it visited and enqueue it
			// LinkedList.listIterator(int index)
			// Iterator: Universal iterator, can read and remove elements(enhanced version of enumeration)
			// Usage:
			//	ArrayList al = new ArrayList();
			// 	Iterator itr = al.iterator();
			// ListIterator: Works with ArrayList, LinkedList & other ...List, (enhanced version of Iterator 
			// , iterate backwards, obtain an iterator, add, set a value at any point)
			// Usage:
			//	ArrayList al = new ArrayList();
			// 	ListIterator itr = al.listIterator();
			// Following he used listIterator() but made it equal to Iterator<Integer>
			
			Iterator<Integer> i = adj[s].listIterator(); 
			while (i.hasNext())
			{
				int n = i.next();
				if (!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}	// all elements of Iterator finished
		}	// queue.size() became 0
		
	}	// end of BFS function

	public static void main(String args[])
	{
		// System.out.println("This is breadth first search for graphs.");
		// create a graph	
		Graph g = new Graph(4);
		
		// create the graph with all edges
		g.add_edge(0,1);
		g.add_edge(0,2);
		g.add_edge(1,2);
		g.add_edge(2,0);
		g.add_edge(2,3);
		g.add_edge(3,3);

        	System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)");

		g.BFS(2);
		 
	} 
}
