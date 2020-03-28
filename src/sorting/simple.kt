package sorting

import java.util.Collections.swap

fun insertionSort(lst: List<Int>): List<Int> {
    val mut = lst.toMutableList()
    for (i in 1 until mut.size) {
        val key = mut[i]
        var j = i - 1
        while (j >= 0 && mut[j] > key) {
            mut[j + 1] = mut[j]
            j--
        }
        mut[j + 1] = key
    }
    return mut
}

fun bubbleSort(lst: List<Int>): List<Int> {
    val mut = lst.toMutableList()
    var swapped: Boolean
    do {
        swapped = false
        for (i in 1 until mut.size) {
            if (mut[i - 1] > mut[i]) {
                swap(mut, i - 1, i)
                swapped = true
            }
        }
    } while (swapped)
    return mut
}

fun selectionSort(lst: List<Int>): List<Int> {
    val mut = lst.toMutableList()
    for (i in 0 until mut.size - 1) {
        var min = mut[i]
        for (j in i + 1 until mut.size) {
            if (mut[j] < min) {
                min = mut[j]
            }
        }
        mut[i] = min
    }
    return mut
}
