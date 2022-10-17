/**
 * @author : 马世豪
 * time : 2022/10/14 16
 * email : ma_shihao@yeah.net
 * des :
 */

class ListNode {
    var `val` = 0
    var next: ListNode? = null

    internal constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }
    internal constructor(`val`: Int) {
        this.`val` = `val`
    }

    internal constructor()

    override fun toString(): String {
        return "ListNode(num=$`val`, next=$next)"
    }


}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

    val returnNode = ListNode()
    var cursor = returnNode

    var temp1 = l1
    var temp2 = l2
    var carry = 0
    while (temp1 != null || temp2 != null || carry != 0) {
        val sum = (temp1?.`val` ?: 0) + (temp2?.`val` ?: 0) + carry

        carry = sum / 10


        val sumNode = ListNode(sum % 10)
        cursor.next = sumNode
        cursor = sumNode

        if (temp1 != null) {
            temp1 = temp1.next
        }
        if (temp2 != null) {
            temp2 = temp2.next
        }
    }
    return returnNode.next

}

fun main() {
//    [2,4,3]

    val l1 = ListNode(2,ListNode(4,ListNode(3)))
    val l2 = ListNode(5,ListNode(6,ListNode(4)))

    println(addTwoNumbers(l1,l2))
}
