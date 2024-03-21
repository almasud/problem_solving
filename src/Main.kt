import daily_code_challenge.DailyCodeChallenge
import daily_code_challenge.ListNode

/**
 * The main method where we call the solution function to evaluate the result
 */
fun main() {
    val listNode1 = ListNode(`val` = 1)
    val listNode2 = ListNode(`val` = 2)
    val listNode3 = ListNode(`val` = 3)
    val listNode4 = ListNode(`val` = 4)

    listNode1.next = listNode2
    listNode2.next = listNode3
    listNode3.next = listNode4

    println(listNode1)
    println(DailyCodeChallenge.reverseList(listNode1))
}
