# sort-o_NAMESPACE
Roster: Paul Serbanescu, Max Schneider, Orion Roven

## Bubble sort

N: the number of passes will always be length - 1

N: the number of comparisons will always be (length - 1) + (length - 2) + ... + 1

Best case: ArrayList is already sorted. Time complexity is O(1).

Worst case: Because the number of passes and comparisons will always be the same for sorting lists of the same length, we defined the worst case scenario as the greatest number of swaps, which occurred when the original unsorted list was descending eg: [5, 4, 3, 2, 1]. Time complexity of O(n).

## Insertion sort

N: the number of passes will always be length - 1

Best case: ArrayList is already sorted

Worst case: Because the number of passes will always be length - 1, and making a comparison between 2 adjacent values doesn't require as much memory as swapping 2 values because swapping requires allocating memory to a new temporary variable, we decided to define worst case as the greatest number of swaps. According to our test cases, it seems that a list originally in descending order took the most amount of swaps so the worst case is the list is in descending order.

## Selection sort
Best case: ArrayList is already sorted
Worst case:
