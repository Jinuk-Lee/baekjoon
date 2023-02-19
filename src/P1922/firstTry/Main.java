package networkconnect.firstTry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Node>[] list;
    private static int nodeCount;
    private static int edgeCount;
    private static int[] parent;
    private static int edgeCost; //최소 간선 비용
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //정점의 개수와 간선의 개수를 입력
        nodeCount = Integer.parseInt(br.readLine());
        edgeCount = Integer.parseInt(br.readLine());

        createNode(nodeCount); //노드 생성

        //간선 추가
        for (int i = 0; i < edgeCount; i++) {
            String s = br.readLine();
            StringTokenizer st1 = new StringTokenizer(s);

            int from = Integer.parseInt(st1.nextToken());
            int to = Integer.parseInt(st1.nextToken());
            int cost = Integer.parseInt(st1.nextToken());

            createEdge(from, to, cost); //
        }

        kruscal();

    }

    private static void createNode(int n) {
        //list = new ArrayList[n + 1]; //컴퓨터의 수 N (1 ≤ N ≤ 1000)
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
    }

    private static void createEdge(int from, int to, int cost) {
        list[from].add(new Node(to,cost));
        list[to].add(new Node(from,cost)); //무방향 그래프
    }

    private static void kruscal() {
        int uset, vset;
        int madeCount=0;
        PriorityQueue<Node> q = new PriorityQueue<>();


    }


    private static class Node implements Comparable<Node> {
        int vertex;
        int cost;

        public Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return cost - o.cost;
        }
    }
}
