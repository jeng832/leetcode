import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        try {
            for (i in 0..s.lastIndex) {
                when (s[i]) {
                    '(', '{', '[' -> stack.push(s[i])
                    ')' -> if (stack.pop() != '(') return false
                    '}' -> if (stack.pop() != '{') return false
                    ']' -> if (stack.pop() != '[') return false
                }
            }
        } catch (e : EmptyStackException) {
            return false
        }
        if (stack.isEmpty()) return true
        return false
    }
}