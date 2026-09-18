# Selection Sort in Java

A clean and modular Java implementation of the **Selection Sort** algorithm. The program reads an array of integers from the user via the console, sorts it in ascending order, and prints the final sorted array.

## Complexity Analysis

Selection Sort is known for its predictable performance characteristics regardless of the initial order of the input data.

### Time Complexity: O(n²)
The time complexity is quadratic in all cases because the algorithm uses **two nested loops** to scan the array. It does not have an early-exit mechanism, meaning it performs the same number of comparisons even if the array is already sorted.

* **Best Case:** O(n²) (Array is already sorted)
* **Average Case:** O(n²) (Array elements are in random order)
* **Worst Case:** O(n²) (Array is sorted in reverse order)

#### Mathematical Derivation:
The total number of comparisons can be calculated using the sum of the first (n-1) integers:
Total Comparisons = (n-1) + (n-2) + ... + 2 + 1 = n(n-1) / 2 = (n² - n) / 2 -> O(n²)

### Space Complexity: O(1)
The algorithm is an **in-place sorting algorithm**. It operates directly on the input array (`arr`) and only uses a fixed amount of extra memory for temporary variables (`i`, `j`, `minIndex`, `temp`), which do not scale with the size of the input.

| Scenario | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Best Case** | O(n²) | O(1) |
| **Average Case** | O(n²) | O(1) |
| **Worst Case** | O(n²) | O(1) |

---

## How It Works

1. The array is divided conceptually into a sorted region (left) and an unsorted region (right).
2. The inner loop scans the unsorted region to find the **minimum element**.
3. That minimum element is swapped with the first element of the unsorted region.
4. This process repeats until the entire array is processed.

---

## Project Structure

The code is organized into a single file `sSort.java` containing:
* **`sSort`**: The main driver class that handles user input and output.
* **`selection_sort`**: A static inner class encapsulating the sorting logic, which automatically triggers the sorting routine via its constructor.

---

## Prerequisites

Make sure you have the **Java Development Kit (JDK)** installed on your machine (JDK 8 or higher is recommended).

---

## How to Run

Follow these steps to compile and run the program using your terminal:

1. **Save the file:** Ensure the code is saved exactly as `sSort.java`.
2. **Compile the code:**
   ```bash
   javac sSort.java
   ```
3. **Execute the program:**
   ```bash
   java sSort
   ```

---

## Example Usage

### Input Format
* The first integer defines the **size** of the array (n).
* The subsequent integers are the **elements** of the array.

### Console Interaction
```text
5
64 25 12 22 11
Sorted array is: 11 12 22 25 64 
```
