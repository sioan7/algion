package sorting

import java.util.Collections.swap

class MaxHeap<E : Comparable<E>>(lst: List<E>) {
    private val lst: MutableList<E> = lst.toMutableList()
    private var heapSize: Int = lst.size

    val size: Int get() = lst.size
    val underlyingList: List<E> get() = lst.toList()

    init {
        (lst.size / 2 downTo 0).forEach { heapify(it) }
    }

    fun sort(): MaxHeap<E> {
        for (i in lst.size - 1 downTo 1) {
            swap(lst, i, 0)
            heapSize--
            heapify(0)
        }
        return this
    }

    private fun left(i: Int) = 2 * i

    private fun right(i: Int) = 2 * i + 1

    private fun parent(i: Int) = i / 2

    private fun heapify(i: Int) {
        val l = left(i)
        val r = right(i)
        var largest = if (l < heapSize && lst[l] > lst[i]) l else i
        if (r < heapSize && lst[r] > lst[largest]) {
            largest = r
        }
        if (largest != i) {
            swap(lst, largest, i)
            heapify(largest)
        }
    }
}
