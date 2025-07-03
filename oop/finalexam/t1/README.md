# Task #1 - List Management (Final Exam)

##  Package


---

## Program Description

This Java program manipulates two predefined lists:

- `list1`: A list of integers  
- `list2`: A list of strings  

It constructs a third list, `list3`, by following these steps:

### 🔹 Step 1: Build `list3`

For each element `n` in `list1`:
1. Calculate `index = n + 1`
2. Access `list2` at this index
3. Append the result of `list2[index] + n` into `list3`

Example:
```java
list1 = [7]
list2 = [..., "hez", "xky", ...] // assume xky is at index 8

→ list2[7 + 1] = list2[8] = "xky"
→ result = "xky7"
→ list3 = ["xky7"]

Error Handling: 

If an index n + 1 from list1 goes beyond the size of list2, the program:
Does not crash
Skips that entry and continues with the rest of the list

## 💡 Example with Error Handling

```java
List<Integer> list1 = List.of(1, 2, 5, 100); // 100 will cause out-of-bounds
List<String> list2 = List.of("a", "b", "c", "d", "e", "f", "g");
List<String> list3 = new ArrayList<>();

for (int n : list1) {
    int index = n + 1;
    if (index >= 0 && index < list2.size()) {
        list3.add(list2.get(index) + n);
    }
    // else: index is invalid, so skip
}

![Screenshot](screenshot_81.png)

