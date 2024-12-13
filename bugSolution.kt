```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val sum = list.sum()
    println(sum) // Output: 15

    // Safe way to access list elements
    val element = list.getOrNull(10) ?: -1 //Safe call operator
    println(element) //Output: -1
    //Another safe way to access list elements is using the when expression
    val element1 = when{
        10 in list.indices -> list[10]
        else -> -1
    }
    println(element1) // Output: -1
}
```