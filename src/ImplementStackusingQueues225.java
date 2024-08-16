import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues225 {
    public static void main(String[] args) {

    }

    class MyStack {
        Queue<Integer> queue = new LinkedList<>();


        public void push(int x) {
// 요소 x를 스택의 맨 위로 밀어넣는다.
            queue.add(x);
            for (int i = 1; i < queue.size(); i++) {
                queue.add(queue.remove());
            }
        }

        public int pop() {
//스택 상단의 요소를 제거하고 반환합니다.
            return queue.remove();
        }

        public int top() {
//스택 상단의 요소를 반환합니다.
            return queue.peek();
        }

        public boolean empty() {
//스택이 비어 있으면 true 반환하고, 그렇지 않으면 false.
            return queue.size()==0;
        }
    }
}
