# 문제풀이
이거는 쉽지만 쉽지 않다
왜냐면 내가 자료구조 구현이 완전히 암기가 안되있기 때문이다
그래서 자료구조를 공부하기로 했다

# 알게된것
7가지 자료형이 이미 라이브러리로 구현되어있다
나는 갖다쓰면되는거다 아래는 언어벌로 구현된것들
1.	배열(Array)
    배열 요소는 인덱스를 통해 접근하는데, 
    인덱스는 int 크기만큼의 오프셋을 가진 메모리 저장위치이다.
     •	Python: list
     •	C++: std::array, std::vector
     •	Java: Array, ArrayList
     •	JavaScript: Array
2.	연결 리스트(Linked List)
•	Python: 기본적으로 제공되지는 않지만 collections.deque가 비슷한 기능을 제공
•	C++: std::list (이중 연결 리스트)
•	Java: LinkedList
3.	스택(Stack)
•	Python: list (스택으로 사용 가능), collections.deque
•	C++: std::stack
•	Java: Stack, Deque (Stack의 대체)
4.	큐(Queue)
•	Python: collections.deque, queue.Queue
•	C++: std::queue, std::priority_queue
•	Java: Queue, PriorityQueue, Deque
5.	트리(Tree)
•	Python: 내장 자료구조로는 제공되지 않지만, 외부 라이브러리나 직접 구현 가능
•	C++: 트리 구조는 표준 라이브러리에서 제공되지 않지만, std::map, std::set 등이 내부적으로 균형 이진 탐색 트리를 사용
•	Java: TreeMap, TreeSet (레드-블랙 트리 기반)
6.	그래프(Graph)
•	Python: 내장 자료구조로는 제공되지 않지만, networkx와 같은 외부 라이브러리에서 지원
•	C++: 그래프는 표준 라이브러리에서 제공되지 않지만, 직접 구현하거나 Boost 라이브러리 사용
•	Java: 내장 자료구조로 제공되지는 않지만, 외부 라이브러리(JGraphT 등)에서 지원
7.	해시 테이블(Hash Table)
•	Python: dict, set
•	C++: std::unordered_map, std::unordered_set
•	Java: HashMap, HashSet

앞으로 하나씩 구현을 다해봐야겠다..