package Naincy

  import scala.collection.immutable.Queue


  private class SquareQueue extends Quu
  {
    override  def Enque(): Unit =
    {
      println(" The Elements in the Queue Are:");
      var queue = Queue(11, 25, 9, 43, 21);
      queue.foreach{(element:Int) => print((element) + " ")}
      println();
      println("Enqueues the Element After Squaring Them:");
      queue.foreach{(element:Int) => print((element*element) + " ")}
      println();
      println("First Element after Enqueuing is: " + (queue.front)*(queue.front));
      var dq = queue.dequeue;
      println("Dequeued First Element From Queue: " + dq);
    }



}
