package Naincy

  import scala.collection.immutable.Queue


  class DoubleQueue extends Quu {
    override def Enque(): Unit = {
      println(" the elements in the queue are:");
      var queue = Queue(11, 25, 9, 43, 21);
      queue.foreach { (element: Int) => print((element) + " ") }
      println();
      println("Enqueues the Element After Doubling Them:");
      queue.foreach { (element: Int) => print((element * 2) + " ") }
      println();
      println("First Element  after Enqueuing is: " + (queue.front) * 2);
      var dq = queue.dequeue;
      println("Dequeued First Element From Queue: " + dq)

    }
  }
