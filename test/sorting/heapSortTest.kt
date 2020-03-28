package sorting

fun main() {
    testSortingAlgorithm { input -> MaxHeap(input).sort().underlyingList }
}
