/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :  Create methods to manipulate arrays.
 *  Author        :  Jordyn Polk
 *  Date          :  09-18-2018
 *  Description   :  Implemented various methods to find maximum values in the array and delete duplicates.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class HighArrayApp
{
	public static void main(String[] args)
        {
        	int maxSize = 100;               // array size
        	HighArray arr;                   // reference to array
        	arr = new HighArray(maxSize);    // create the array

        	arr.insert(77);                  // insert 15 items
        	arr.insert(99);
        	arr.insert(44);
        	arr.insert(55);
        	arr.insert(22);
        	arr.insert(88);
        	arr.insert(11);
        	arr.insert(00);
        	arr.insert(66);
        	arr.insert(33);
        	arr.insert(1399);
        	arr.insert(77);
        	arr.insert(23);
        	arr.insert(11);
        	arr.insert(77);

        	arr.display();                   // display items

        	int searchKey = 35;              // search for item
        	if( arr.find(searchKey) )
        		System.out.println("Found " + searchKey);
        	else
        		System.out.println( "Can't find " + searchKey);
        	

        	arr.delete(00);                  // delete 3 items
        	arr.delete(55);
        	arr.delete(99);

        	arr.display();                   // display items again

        	System.out.println("The Max value is " + arr.getMax());
            arr.noDups();
        }                                    // end main()
    }                                        // end class HighArrayApp
