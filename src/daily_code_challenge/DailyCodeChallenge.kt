package daily_code_challenge

class DailyCodeChallenge {
    companion object {

        /**
         * 451. Sort Characters By Frequency
         *
         * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
         *
         * Return the sorted string. If there are multiple answers, return any of them.
         *
         *
         *
         * Example 1:
         *
         * Input: s = "tree"
         * Output: "eert"
         * Explanation: 'e' appears twice while 'r' and 't' both appear once.
         * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
         * Example 2:
         *
         * Input: s = "cccaaa"
         * Output: "aaaccc"
         * Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
         * Note that "cacaca" is incorrect, as the same characters must be together.
         * Example 3:
         *
         * Input: s = "Aabb"
         * Output: "bbAa"
         * Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
         * Note that 'A' and 'a' are treated as two different characters.
         *
         *
         * Constraints:
         *
         * 1 <= s.length <= 5 * 105
         * s consists of uppercase and lowercase English letters and digits.
         */
        fun frequencySort(s: String): String {
            val frequencyMap: MutableMap<Char, Int> = mutableMapOf()
            val newStr = StringBuilder()

            s.forEach {
                if (!frequencyMap.containsKey(it))
                    frequencyMap[it] = 1
                else
                    frequencyMap[it] = frequencyMap[it]!! + 1
            }

            frequencyMap.entries.sortedByDescending { it.value }
                .forEach { mutableEntry ->
                    for (i in 1..mutableEntry.value)
                        newStr.append(mutableEntry.key)
                }

            return newStr.toString()
        }

        /*
        * 206. Reverse Linked List
        * Given the head of a singly linked list, reverse the list, and return the reversed list.
        *
        * Example 1:
        * Input: head = [1,2,3,4,5]
        * Output: [5,4,3,2,1]
        *
        * Example 2:
        * Input: head = [1,2]
        * Output: [2,1]
        *
        * Example 3:
        * Input: head = []
        * Output: []
        *
        * Constraints:

        * The number of nodes in the list is the range [0, 5000].
        * -5000 <= Node.val <= 5000


        * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

        * */

        /**
         * Example:
         * var li = ListNode(5)
         * var v = li.`val`
         * Definition for singly-linked list.
         * class ListNode(var `val`: Int) {
         *     var next: ListNode? = null
         * }
         */

        fun reverseList(head: ListNode?): ListNode? {
            var prevNode: ListNode? = null
            var currNode: ListNode? = head
            var nextNode: ListNode?

            while (currNode != null) {
                nextNode = currNode.next
                currNode.next = prevNode
                prevNode = currNode
                currNode = nextNode
            }
            return prevNode
        }

    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return if (next != null)
            "$`val` -> $next"
        else
            "$`val`"
    }
}