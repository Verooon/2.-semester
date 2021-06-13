package Synchronized;

public class SynchronizedQueue implements Buffer
{
  private QueueADT boundedArrayQueue;

  public SynchronizedQueue(int capacity)
  {
    boundedArrayQueue = new BoundedArrayQueue(capacity);
  }

  @Override public synchronized void put(Object element)
  {
    boundedArrayQueue.enqueue(element);
  }

  @Override public synchronized Object take()
  {
    return boundedArrayQueue.dequeue();
  }

  @Override public synchronized Object look()
  {
    return boundedArrayQueue.first();
  }

  @Override public synchronized boolean isEmpty()
  {
    return boundedArrayQueue.isEmpty();
  }

  @Override public synchronized boolean isFull()
  {
    return boundedArrayQueue.isFull();
  }

  @Override public synchronized int size()
  {
    return boundedArrayQueue.size();
  }

  @Override public synchronized String toString()
  {
    return boundedArrayQueue.toString();
  }
}
