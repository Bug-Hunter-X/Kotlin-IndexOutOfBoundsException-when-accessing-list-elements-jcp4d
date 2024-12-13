# Kotlin IndexOutOfBoundsException Bug

This repository demonstrates a common error in Kotlin: the `IndexOutOfBoundsException`. This exception occurs when you try to access an element in a list or array using an index that is outside the valid range of indices (0 to size - 1).

## Bug Description

The `bug.kt` file contains code that attempts to access an element at index 10 in a list of size 5. This results in an `IndexOutOfBoundsException` being thrown.

## Solution

The `bugSolution.kt` file provides a corrected version of the code. It uses the `getOrNull()` function to safely access list elements. If the index is out of bounds, it returns `null` instead of throwing an exception.  We handle this null safely by using the Elvis operator `?:` to provide a default value.