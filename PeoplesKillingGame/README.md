# 100 peoples standing in a circle with one sword puzzle. 

100 people standing in a circle in an order 1 to 100. No. 1 has a sword. He kills the next person (i.e. No. 2) and gives the sword to the next (i.e. No. 3). All people do the same until only 1 survives. Which number survives at the last?

There are 100 people starting from 1 to 100 in a circle.

Solution:  73rd person will survive at last

Explanation: 
Here, we can define an array with 100 elements with values from 1 to 100.

No.1 has a sword. He kills next person (i.e. no. 2) and gives sword to next to next (i.e no. 3).

We have taken array element as a person. 1st person kills the next. So, starting from 1, we�ll remove next element i.e. 2. Then first person gives sword to next to next i.e. 3. That person will also kill next person and this continues. Means, in array, we need to start with 1 and remove the every other (alternate) element till 100. (all the even numbers will be removed and we�ll be left with odd numbers only in array).

Round 1: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99

Round 2: 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61, 65, 69, 73, 77, 81, 85, 89, 93, 97

Round 3: 1, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97

Round 4: 9, 25, 41, 57, 73, 89

Round 5: 9, 41, 73

Round 6: 9, 73

Round 7: 73



