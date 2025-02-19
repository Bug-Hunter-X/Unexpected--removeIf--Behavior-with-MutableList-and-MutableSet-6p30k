# Kotlin `removeIf` Behavior with MutableList and MutableSet

This example demonstrates a subtle difference in how Kotlin's `removeIf` function operates on `MutableList` and `MutableSet` collections.

The code shows that `removeIf` modifies the collections in place, removing elements that satisfy the given predicate.  However, the iteration order might influence the behavior, especially when removing elements based on a condition that depends on other elements.

The solution is to be aware of this behavior when using `removeIf` and ensure the code correctly handles the order of removal if necessary.  For instance, iterating over a copy of the collection before removing elements might be required in certain cases to avoid unexpected results.