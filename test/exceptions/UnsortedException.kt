package exceptions

class UnsortedException(private val list: List<Int>, private val index: Int) : Exception() {
    override val message: String?
        get() = "Unsorted element ${list[index]} at index $index in $list"
}