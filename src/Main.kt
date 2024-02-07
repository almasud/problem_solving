import leet_code.top_inverview_150.TopInterView150

/**
 * The main method where we call the solution function to evaluate the result
 */
fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
//    val nums1 = intArrayOf(0,0,0,0,0)
    val nums2 = intArrayOf(2, 5, 6)
//    val nums2 = intArrayOf(1,2,3,4,5)
    val m = 3
    val n = 3

    TopInterView150.merge(nums1, m, nums2, n)
}