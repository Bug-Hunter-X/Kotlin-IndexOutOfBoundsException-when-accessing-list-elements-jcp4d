```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val sum = list.sum()
    println(sum) // Output: 15

    // The error is caused by trying to access an element of the list at an index that is out of bounds
    val element = list.getOrNull(10) ?: -1 //Safe call operator
    println(element) //Output: -1
    val element1 = list.get(10) //This is the error, throws IndexOutOfBoundsException
    println(element1)
}
```