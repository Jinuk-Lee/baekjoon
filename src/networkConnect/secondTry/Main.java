package networkConnect.secondTry;

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

        
        //정점의 개수v와 간선의 개수e를 입력
        vCount = Integer.parseInt(br.readLine());
        eCount = Integer.parseInt(br.readLine());

        //부모노드를 자기 자신으로 초기화
        parent = new int[vCount + 1];
        for (int i = 1; i <= vCount; i++) {
            parent[i] = i;
        }

        //간선의 정보를 바로 우선순위큐에 추가
        for (int i = 0; i < eCount; i++) {
            String s = br.readLine();
            StringTokenizer st1 = new StringTokenizer(s);

            int from = Integer.parseInt(st1.nextToken());
            int to = Integer.parseInt(st1.nextToken());
            int weight = Integer.parseInt(st1.nextToken());

            q.add(new Edge(from, to, weight));
        }
            kruscal();
    }
    private static void kruscal(){
        while (!(madeCount == vCount - 1)) { //노드개수 -1 까지 생성하는 조건
            //우선순위 큐로 가중치로 오름차순 정렬된 간선을 꺼냄
            Edge edge = q.poll();

            int from = edge.from;
            int to = edge.to;
            int weight = edge.weight;

            //find()연산으로 찾은 양쪽 부모가 다르면 가중치 추가
            if (find(from) != find(to)) {
                union(from, to);
                totalCost += weight;
                madeCount++;
            }
        }
        System.out.println(totalCost);
    }
    private static void union(int a, int b) {  //양쪽 부모중 낮은 부모를 따라감
        a = find(a);
        b = find(b);
        if (a < b) {        //부모 번호를 비교
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
    private static int find(int vertex) {  //부모노드를 찾는 매서드
        if (parent[vertex] != vertex)
            parent[vertex] = find(parent[vertex]);
        return parent[vertex];
    }

    private static class Edge implements Comparable<Edge> {
        private int from; //양쪽 노드 번호
        private int to;   
        private int weight; //해당 간선의 가중치

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



