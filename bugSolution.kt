fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val listCopy = list.toList()
    list.removeIf { listCopy.contains(it) && it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]
    
    //Alternative approach for List using an iterator
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()){
        if(iterator.next() > 2) iterator.remove()
    }
    println(list2) // Output: [1, 2]
}