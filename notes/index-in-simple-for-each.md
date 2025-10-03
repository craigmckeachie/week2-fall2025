The standard Java enhanced for-each loop, used for iterating over arrays and collections, does not directly provide access to the index of the current element. It is designed for simpler iteration where only the element's value is needed.

However, there are ways to achieve similar functionality while still using a for-each loop-like structure:

1. **Manual Index Counter:**  
   A common approach is to introduce a separate integer variable to manually track the index within the loop.

   ```java
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   int index = 0;
   for (String name : names) {
       System.out.println("Element at index " + index + ": " + name);
       index++;
   }
   ```

2. **Using IntStream.range with forEach (Java 8 and later):**  
   For a more functional programming style, you can use `IntStream.range` to generate a stream of indices and then use `forEach` with a lambda expression to access both the index and the element from your collection.

   ```java
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   IntStream.range(0, names.size())
            .forEach(i -> System.out.println("Element at index " + i + ": " + names.get(i)));
   ```

3. **Traditional for loop:**  
   If you need the index frequently or for modifying elements based on their position, the traditional `for` loop is often the most straightforward and efficient solution.

   ```java
   String[] namesArray = {"Alice", "Bob", "Charlie"};
   for (int i = 0; i < namesArray.length; i++) {
       System.out.println("Element at index " + i + ": " + namesArray[i]);
   }
   ```

### Choosing the right approach:
- Use the manual index counter for simple cases where you just need to display the index alongside the element.
- Use `IntStream.range` for a more functional approach, especially when working with streams and other Java 8 features.
- Use the traditional for loop when you need direct index access for operations like modifying elements or performing complex index-based logic.
