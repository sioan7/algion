package sorting

import assertSorted

fun testSortingAlgorithm(alg: (List<Int>) -> List<Int>) {
    assertSorted(alg(listOf()))
    assertSorted(alg(listOf(0, 1)))
    assertSorted(alg(listOf(1, 0)))
    assertSorted(alg(listOf(1, 2, 3)))
    assertSorted(alg(listOf(-1, -2, -3)))
    assertSorted(alg(listOf(-1, 0, 1)))
    assertSorted(alg(listOf(1, 0, -1)))
    assertSorted(alg(listOf(0, Int.MAX_VALUE)))
    assertSorted(alg(listOf(0, 0, 0)))
    assertSorted(alg(listOf(0, 1, 1)))
    assertSorted(alg((0..10000).shuffled()))
}