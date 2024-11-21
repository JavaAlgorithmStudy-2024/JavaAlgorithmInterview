## [543\. Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/)

### Easy

---

Given the `root` of a binary tree, return _the length of the **diameter** of the tree_.

The **diameter** of a binary tree is the **length** of the longest path between any two nodes in a tree. This path may or may not pass through the `root`.

The **length** of a path between two nodes is represented by the number of edges between them.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/06/diamtree.jpg)

```
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
```

**Example 2:**

```
Input: root = [1,2]
Output: 1
```

**Constraints:**

-   The number of nodes in the tree is in the range `[1, 104]`.
-   `-100 <= Node.val <= 100`

### How to Solve

---

이 문제는 이전에 사용한 DFS를 이용하여 해결하였다.

DFS에 대해서는 이전에 설명을 작성하였으므로 이진트리를 위주로 설명하겠다.

일단, 트리는 루프가 없는 그래프를 의미한다. 이 말에는 **두가지 조건**이 담겨있다.

1\. 임의의 노드에서 출발하여 **자기자신으로 돌아오는 경로가 없어야 한다**.

2\. **모든 노드는 이어져**있어야 한다.

관련 용어는 아래와 같다.

-   **Node**: 트리 구조에서 각 구성요소를 의미하는 단위
    -   위 그림에서는 A~J까지를 모두 Node라고 할 수 있다.

-   **Root Node**: 트리의 시작 노드로, 부모가 없는 최상위 노드
    -   위 그림에서 A노드를 의미
    -   트리는 최대 1개의 Root Node를 가질 수 있다.

-   **Edge**: 노드와 노드 간의 연결을 하는 선

-   **Path**: 특정 노드에서 노드까지의 경로 (순서)
    -   한 번 지나쳤던 경로를 다시 지나는 것은 허락하지 않는다.

-   **Terminal Node(Leaf Node)**: 자식 노드가 존재하지 않는, 즉 다시 말해 밑으로 또 다른 노드가 연결 되어있지 않는 노드
    -   위 그림에서 H, I, J, F, G와 같은 노드를 말한다.

-   **Sub-Tree**: 전체 큰 트리 구조 안의 작은 트리 구조
    -   트리의 재귀적인 특성을 보여준다.

-   **Depth**: 루트 노드로부터 얼마나 떨어져 있는 지를 뜻하는 단위
    -   루트 노드의 바로 아래 노드는 depth 1로 잡는다.
    -   루트 노드가 기준이기 때문에 루트 노드는 depth 0이다.

-   **Level**: 트리 구조에서 같은 위치, 즉 같은 depth를 가지는 노드들을 한 레벨로 나타내는 단위
    -   Root Node가 기준이고 이 위치를 level 0으로 잡는다.
    -   루트 노드에서 어떤 노드까지의 간선 수이다.

-   **Height**: 트리에서 가장 최고 레벨, 가장 깊은(deep) 층
    -   어떤 노드에서 리프 노드까지 가장 긴 경로의 간선 수이다.

-   **Order**: 부모 노드가 가질 수 있는 최대 자식의 수
    -   예를 들어 order 4라고 하면 부모 노드는 최대 3명의 자식 노드를 가질 수 있는 것이다.

이 중에 이진트리는 **각 노드의 차수(자식 노드)가 2이하인 트리 구조**이다.

그렇기에 해당 풀이에서는 left와 right로 나누어 코드를 작성하였다.