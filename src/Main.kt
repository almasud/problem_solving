import leet_code.top_inverview_150.TopInterView150

/**
 * The main method where we call the solution function to evaluate the result
 */
fun main() {
    val nums = intArrayOf(3,2,2,3)
    val value = 3
    println(TopInterView150.removeElement(nums, value))
    nums.forEach { print("$it ") }
}
