package shortpath;

import java.util.*;

class Edge<W, V> {
    private W weight;
    private V v;

    public Edge(V i) {
    }

    public void setEdge(W weight, V v) {
        this.weight = weight;
        this.v = v;
    }
}

public class Solution {
    private static int edgecount;  //간선의 개수
    private static int nodecount;   //노드의 개수
    private static int startnode; //시작 정점
    private static int weight;  //가중치
    private static ArrayList<Edge<Integer, Integer>> graph = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("edgecount :");
        edgecount = sc.nextInt();
        //System.out.print("nodecount :");
        nodecount = sc.nextInt();
        //System.out.print("startnode :");
        startnode = sc.nextInt();

        createNode(nodecount);



        for (int i = 0; i < nodecount; i++) {
            graph.add(new Edge<>());    //노드의 개수만큼 노드 생성
        }

        for (int i = 0; i < edgecount; i++) {
            int node1 = sc.nextInt(); //시작 노드
            int node2 = sc.nextInt(); //종료 노드
            weight = sc.nextInt();  //해당 노드 가중치 설정


            createEdge(node1,node2,weight);

            //graph.get(node1).setEdge(node2, weight); //단방향 간선
            //graph.get(node2).setEdge(node1,weight);
        }
        for (int i = 0; i < graph.size(); i++) {
            System.out.println("정점" +);
        }
    }
    public static void createNode ( int N){
        for (int i = 0; i < N; i++) {
            graph.add(new Edge<>(i));    //노드의 개수만큼 노드 생성
        }
    }
    public static void createEdge(int node1,int node2,int weight) {
        for(int i=0;i< graph.size();i++){
            graph.get(node1).setEdge(node2,weight);
            //graph.get(node2).setEdge(node1,weight); 양방향일때 반대 간선
        }
    }
}
