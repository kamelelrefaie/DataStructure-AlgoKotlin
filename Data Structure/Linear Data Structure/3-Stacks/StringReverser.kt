import java.util.*

fun stringReverser(s: String): String {
    val stack = Stack<Char>()
    val reversed = StringBuffer()

    for (character in s) stack.push(character)

    while (!stack.isEmpty()) reversed.append(stack.pop())

    return reversed.toString()
}
