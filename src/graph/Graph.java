package graph;

import java.util.*;


public class Graph{

    ArrayList<ArrayList<Integer>>adj;
    int v;
    Graph(int v){
        this.v=v;
        adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void printList(){
        for (int i = 0; i < adj.size(); i++) {
            System.out.print("Vertex "+i+":");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }



    //Breadth first search

    void bfs(int source){
        boolean visited[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        visited[source]=true;

        while(!q.isEmpty()){
            int first=q.poll();
            System.out.print(first+" ");
            for(int i:adj.get(first)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }

        }

    }


    public static void main(String[] args) {
        Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,3);
//        g.addEdge();

       g.bfs(0);
//        g.printList();
    }


}



