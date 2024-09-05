import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int maxSheep = 0; // 모을 수 있는 양의 최대 수를 저장할 변수

    public int solution(int[] info, int[][] edges) {
        // 트리의 각 노드의 자식을 저장할 리스트 배열
        List<Integer>[] tree = new ArrayList[info.length];
        for (int i = 0; i < info.length; i++) {
            tree[i] = new ArrayList<>();
        }

        // 간선 정보로 트리 구축
        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
        }

        // DFS 탐색 시작
        List<Integer> possibleNodes = new ArrayList<>();
        possibleNodes.add(0); // 루트 노드부터 시작

        dfs(0, 0, 0, info, tree, possibleNodes);

        return maxSheep; // 최대로 모을 수 있는 양의 수를 반환
    }

    private void dfs(int node, int sheep, int wolves, int[] info, List<Integer>[] tree, List<Integer> possibleNodes) {
        // 현재 노드가 양인지 늑대인지 확인
        if (info[node] == 0) {
            sheep++;
        } else {
            wolves++;
        }

        // 늑대의 수가 양의 수보다 많아지면 탐색 중단
        if (wolves >= sheep) {
            return;
        }

        // 최대 양의 수 갱신
        maxSheep = Math.max(maxSheep, sheep);

        // 방문 가능한 다음 노드들 갱신
        List<Integer> nextPossibleNodes = new ArrayList<>(possibleNodes);
        nextPossibleNodes.remove(Integer.valueOf(node)); // 현재 노드는 제거

        // 현재 노드의 자식 노드를 탐색 가능 리스트에 추가
        nextPossibleNodes.addAll(tree[node]);

        // 모든 가능한 노드로 DFS 진행
        for (int nextNode : nextPossibleNodes) {
            dfs(nextNode, sheep, wolves, info, tree, nextPossibleNodes);
        }
    }
}
