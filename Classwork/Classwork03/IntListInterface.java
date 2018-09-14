/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntListInterface.java
 * Purpose    :  Interface for IntList.java
 * @author    :  Jordyn Polk
 * Date       :  2018-09-13
*  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */  
    public interface IntListInterface {
        int getValueAtIndex( int index );
        boolean append( int valueToAdd );
        boolean insertValueAtIndex( int value, int index );
        int removeValueAtIndex( int index );
    }
