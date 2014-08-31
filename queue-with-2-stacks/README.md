#Implement Queue with 2 stacks

Keep 2 stacks, let's call them inbox and outbox.

Queue:
- Push the new element onto inbox

Dequeue:
- If outbox is empty, refill it by popping each element from inbox and pushing it onto outbox
- Pop and return the top element from outbox

Using this method, each element will be in each stack exactly once - meaning each element will be pushed twice and popped twice, giving amortized constant time operations.

<pre>
public class Queue<E>
{

   private Stack<E> inbox = new Stack<E>();
   private Stack<E> outbox = new Stack<E>();

   public void queue(E item) {
       inbox.push(item);
   }

   public E dequeue() {
       if (outbox.isEmpty()) {
           while (!inbox.isEmpty()) {
              outbox.push(inbox.pop());
           }
       }
       return outbox.pop();
   }

}
</pre>

http://stackoverflow.com/questions/69192/how-to-implement-a-queue-using-two-stacks