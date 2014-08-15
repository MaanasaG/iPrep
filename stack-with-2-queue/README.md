#Implement Stack using 2 queues
- Queue is 1st in first out (movie queue)
- Stack is last in first out (stack of dishes)

##Approach 1 - pop is expensive
1. whenever we call push()
    - we enqueue (push) to q1
1. whenever we call pop()
    - we dequeue (take out value) from q1 and keep enqueuing (pushing) to q2 until only one item is left in q1
    - we dequeue the last item in q1 return that value
    - now we switch names of q1 and q2

##Approach 2 - push is expensive
1. whenever we call push()
    - we enqueue (push) to q2
    - we dequeue (take out value) all items from q1 and enqueue (push) them to q2
    - we switch names of q1 and q2
1. whenever we call pop()
    - dequeue (take out value) from q1

<pre>2nd approach - when we push for the 1st time q1 will be empty
from second time q1 will have some item in queue</pre>

http://stackoverflow.com/questions/688276/implement-stack-using-two-queues
