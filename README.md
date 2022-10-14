# Sorting Lab

## Instruction

NOTE: The junit test classes won't compile until after tasks 1-3 are completed.

### TASK #1:

The `StockItem` class represents a concession item sold at a movie theater.
Each stock item is uniquely identified by the `sku` (stock keeping unit).
The `quantityOnHand` indicates the available amount of inventory for the item.

The `main` method in `StockItemMain` creates an array of `StockItem` objects and calls `Arrays.sort`
to sort the array elements.  The program will throw an exception if executed
because `StockItem` does not implement `java.lang.Comparable`. 

Update the `StockItem` class to implement the `java.lang.Comparable` interface. 
The class should override `compareTo` to compare stock item objects based on `quantityOnHand`.

Rerun the `main` method in `StockItemMain` and confirm the output:

```text
Sorted by quantity on hand:[
StockItem{sku='bev-cup-36oz', quantityOnHand=50}, 
StockItem{sku='bev-cup-24oz', quantityOnHand=100}, 
StockItem{sku='m&m-3oz', quantityOnHand=320}]
```

### TASK #2: Do not modify the `Movie` class.

The `Movie` class has instance variables `title`, `releaseYear`, and `distributor`.
We might want to sort movies by title, year of release, or by distributor.
Let's start by creating a comparator to sort by the year of release.  

Create a new class `YearComparator` that implements `java.util.Comparator`,
overriding the `compare` method to compare two movies by the release year.

Edit the `main` method in `SortMovieMain` to sort the array using a `YearComparator` class instance.
Print the array contents after sorting the array.

```java
Arrays.sort(movies, new YearComparator());
System.out.println("Sort movies by year of release: " +  Arrays.toString(movies));
```

Rerun the `main` method in `SortMovieMain` and confirm the output:

```text
Sort movies by year of release: [
Movie{title='The Lord of the Rings: The Two Towers', releaseYear=2002, distributor='New Line Cinema'}, 
Movie{title='Cars', releaseYear=2006, distributor='Walt Disney Pictures'}, 
Movie{title='Thor, Love and Thunder', releaseYear=2022, distributor='Walt Disney Pictures'}, 
Movie{title='Top Gun: Maverick', releaseYear=2022, distributor='Paramount Pictures'}]
```

### TASK #3:

Create a second class named `TitleComparator` that implements `java.util.Comparator`.
The new comparator should  compare movies by their title.

Update the `main` method in `SortMovieMain` appending additional lines of code to sort by title:

```java
Arrays.sort(movies, new TitleComparator());
System.out.println("Sort movie by title: " +  Arrays.toString(movies));
```

Rerun the `main` method in `SortMovieMain` and confirm the new comparator sorts the array by title:

```text
Sort movie by title: [
Movie{title='Cars', releaseYear=2006, distributor='Walt Disney Pictures'}, 
Movie{title='The Lord of the Rings: The Two Towers', releaseYear=2002, distributor='New Line Cinema'}, 
Movie{title='Thor, Love and Thunder', releaseYear=2022, distributor='Walt Disney Pictures'}, 
Movie{title='Top Gun: Maverick', releaseYear=2022, distributor='Paramount Pictures'}]
```
### Task #4:

Run the 3 Junit test classes in the test/java folder to confirm the correct implementation.

- `StockItemTest` 
- `YearComparatorTest` 
- `TitleComparatorTest` 
