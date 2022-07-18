package networkConnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    private static int vCount;
    private static int eCount;
    private static int madeCount = 0;
    private static int[] parent; //부모테이블 생성
    private static int totalCost = 0;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PriorityQueue<Edge> q = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {

        vCount = Integer.parseInt(br.readLine());
        eCount = Integer.parseInt(br.readLine());

        parent = new int[vCount + 1];
        for (int i = 1; i <= vCount; i++) {
            parent[i] = i; // //부모테이블은 자기 자신으로 초기화
        }

        for (int i = 0; i < eCount; i++) {
            String s = br.readLine();
            StringTokenizer st1 = new StringTokenizer(s);

            int from = Integer.parseInt(st1.nextToken());
            int to = Integer.parseInt(st1.nextToken());
            int weight = Integer.parseInt(st1.nextToken());

            q.add(new Edge(from, to, weight));
        }

        while (!(madeCount == vCount - 1)) { //
            Edge edge = q.poll();

            int from = edge.from;
            int to = edge.to;
            int weight = edge.weight;

            if (find(from) == find(to)) { //같으면 무시하고 다음 절차 수행
                continue;
            } else { //두 노드의 부모노드가 다르면 사이클이 발생하지 않으므로  union수행 후 간선 누적
                union(from, to);
                totalCost += weight;
                madeCount++;
                System.out.println(totalCost);
            }
        }
//        System.out.println(totalCost);
    }
    private static void union(int from, int to) {  //더 적은 노드로 부모 노드를 합치는
        int fromParent = find(from);
        int toParent = find(to);
        if (fromParent < toParent) {
            parent[to] = fromParent;
        } else {
            parent[from] = toParent;
        }
    }
    private static int find(int vertex) {  //부모노드를 찾는 매서드
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent[vertex]);
        }
        return parent[vertex];
    }

    private static class Edge implements Comparable<Edge> {
        private int from;
        private int to;
        private int weight;


        Edge(final int from, final int to, final int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return weight - o.weight;
        }
    }
}



