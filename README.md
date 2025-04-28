The program starts with the definition of "node." A node can hold a number (data) and a pointer to the next node so that they can be chained. The chained nodes are employed in the implementation of two distinct data structures: a stack and a queue.

Elements in the stack are pushed and popped from the top. When you push an element it becomes the new top of the stack with a reference pointing to what used to be the top. When you pop an element the current top is discarded and the next element becomes the new top. It also has a method that allows you to see the top item without taking it out (peeking), and some methods for counting the number of items in the stack and clearing it completely.

The queue is different it inserts items at the back and takes them out at the front, following the "first in, first out" principle. When a new item is inserted it becomes attached to the end of the list. If one element is to be removed the frontmost one is removed and the second item in queue becomes the front. Similar to the stack, peeking at the front element, getting the count of the items, and clearing all the elements are supported by the queue as well.

In the program proper, both the stack and the queue are exercised. A few elements are pushed into each, then displayed and popped off in turn, with size.
