/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntListInterface.java
 * Purpose    :  Practice with arrays
 * @author    :  BJ Johnson
 * @author    :
 * Date       :  2018-09-13
 * Description:  
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntList implements IntListInterface {
      private int[] theList;
      private int   size;

      private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

      public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
         theList = new int[STARTING_SIZE];
         size = 0;
      }

      public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
         checkIndex(index);
         return theList[index]
      }

      public boolean append( int valueToAdd ) {
         if( size < theList.length ) {
            theList[size] = valueToAdd;
            size++;
            return true;
         } else {
            insertValueAtIndex(valueToAdd, (theList.length + 1) );
         }
         return false;
      }

      public boolean insertValueAtIndex( int value, int index) {

         if (index >= theList.length) {
            int[] newArray = new int[ STARTING_SIZE + size ];
         for (int j = 0; j < theList.length ; j++) {
            newArray[j] = theList[j];
         }
        theList = newArray;
      }
      for (int j = index; j < theList.length; j++){
        theList[j+1] = theList[j];
      }
        theList[index] = value;
        size++;
        return true;
      }

      public boolean checkIndex(int index){
         try {
            if( size == 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The list is empty" );
         } else if( index > size ) {
          throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
        } else if( index < 0 ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too small");
        }
      }
         catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Invalid index value");
        }
        return true;
      }

      public boolean prepend( int valueToAdd ) {
         insertValueAtIndex(valuetoAdd, 0);
         return true;
      }

      public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
         int value = theList[index];
         if( size == 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
         } else if( index > size ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
         } else if( index < 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too small");
         } else {
            holeFiller( index );
         }
         return value;
      }

      private void holeFiller( int index ) {
         for( int i = index; i < size - 1; i++ ) {
            theList[i] = theList[i+1];
         }
         size--;
      }

      public static void main( String[] args ) {
         IntList list = new IntList();
         list.append( 2 );
         list.append( 3 );
         list.append( 5 );
         list.append( 7 );
         System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
         list.insertValueAtIndex(5,17);
         list.insertValueAtIndex(7,21);
         list.insertValueAtIndex(25,50);
         list.insertValueAtIndex(13,3);
         list.append( 11 );
         list.append( 13 );
         list.append( 17 );
         list.append( 19 );
         System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
         System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
         System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
         System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens

      }
   }
