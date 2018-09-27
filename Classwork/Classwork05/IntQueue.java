/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueue.java
 *  Purpose       :  To practice working with Nodes
 *  @author       :  Jordyn Polk w/ Gabe
 *  Date written  :  2018-09-27
 *  Description   :  This is a revised version of the IntStack class and turns it into IntQueue
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-27  Jordyn Polk   Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntQueue {

      IntLinkedList myQueue;

      IntQueue() {
        myQueue = new IntLinkedList();         // constructor
      }

      public void insert( int itemToinsert ) {
         myQueue.prepend( itemToinsert );
      }

      public int peek() {
         return myQueue.getIteratorAt( myQueue.getSize() - 1 ).getCurrentInt();     // we use the iterator
      }

      public int remove() {
         return myQueue.removeAt( myQueue.getSize() - 1 );
      }
      

      public static void main( String[] args ) {
         IntQueue testQueue = new IntQueue();
         testQueue.insert( 19 );
         testQueue.insert( 23 );
         testQueue.insert( 29 );
         testQueue.insert( 31 );
         testQueue.insert( 37 );
         testQueue.insert( 41 );
         testQueue.insert( 43 );
         testQueue.insert( 47 );
         testQueue.insert( 51 );
         testQueue.insert( 57 );
         System.out.println();
         testQueue.display();
         System.out.println();
         System.out.println( "The front of the queue: " + testQueue.peek() );      // 57
         System.out.println( "Removing front thing: " + testQueue.remove() );         // 57 removed
         System.out.println( "The front of the queue: " + testQueue.peek() );      // 51
         System.out.println( "Removing front thing: " + testQueue.remove() );         // 51 removed
         System.out.println( "The front of the queue: " + testQueue.peek() );      // 47
         System.out.println( "Removing front thing: " + testQueue.remove() );         // 47 removed
         System.out.println( "The front of the queue: " + testQueue.peek() );      // 43
         testQueue.insert( testQueue.remove() + testQueue.remove() );
         System.out.println( "The top of the queue: " + testQueue.peek() );      // what'll it be?
         System.out.println();
         testQueue.display();
         System.out.println();
      }

   }
