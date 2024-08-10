import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        Map<Character,Character> table= new HashMap<>(){{
            put(')','(');
            put('}','{');
            put(']','[');
        }};
        for (int i = 0; i < s.length(); i++) {
            if (!table.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            else if (stack.isEmpty()|| table.get(s.charAt(i))!=stack.pop()) {
                return false;
            }
        }
    return stack.size()==0;
    }
}
