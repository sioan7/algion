import exceptions.UnsortedException

fun assertSorted(numbers: List<Int>) {
    for (i in 0 until numbers.size - 1) {
        if (numbers[i] > numbers[i + 1]) {
            throw UnsortedException(numbers, i)
        }
    }
}
