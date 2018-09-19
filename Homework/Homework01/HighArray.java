/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :  Methods to manipulate arrays.
 *  Author        :  Jordyn Polk
 *  Date          :  09-18-2018
 *  Description   :  Implemented various methods to find, insert, and delete values in an array.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.lang.Math;

class HighArray
{
  private long[] a;
  private int nElems;
  
  public HighArray(int max)
  {
    a = new long[max];
    nElems = 0;
  }
  
  public int getNumElems()
  {
    return nElems;
  }

  public boolean find(long searchKey)
  {
    int j;
    for(j=0; j<nElems; j++)
    {
      if(a[j]==searchKey) break;
    }
    if(j==nElems) return false;
    else return true;
  }
  
  public void insert(long value)
  {
    a[nElems] = value;
    nElems++;
  }
  
  public long delete(long value)
  {
    int j;
    for(j=0; j<nElems; j++)
    {
      if(a[j]==value) break;
    }
    if(j == nElems) return 0;
    else
    {
      int k;
      for(k=j; k < (nElems-1); k++)
      {
        a[k] = a[k+1];
      }
      nElems--;
      return value;
    }
  }

  public long getMax() //Finds the maxium value
  {
    int j;
    long biggest = -1;
    if(nElems == 0) return biggest;
    else
    {
      for(j=0; j<nElems; j++)
      {
        if(a[j] > biggest) biggest = a[j];
      }
      return biggest;
    }
  }
  
  public long removeMax() //Finds the biggest value and deletes it
  {
    int j;
    long biggest = -1;
    if(nElems == 0) return biggest;
    else
    {
      for(j=0; j<nElems; j++)
      {
        if(a[j] > biggest) biggest = a[j];
      }
      delete(biggest);
      return biggest;
    }
  }
  
  public void noDups() // Gets rid of duplicates
  {
    //This version shrinks the array as  it goes along
    int size = nElems - 1;
    long value = 0;
    for(int i = 0; i <= size; i++)
    {
      value = a[i];
      for(int j = i+1; j <= size; j++)
      {
        if(a[j] == value)
        {
          for(int k = j; k < size; k++)
          {
            a[k] = a[k+1];
          }
          nElems--;
          j--;
          size--;
          System.out.println("Got rid of " + value + " because no Duplicates");
        }
      }
    }
  }

  public void display()
  {
    for(int j=0; j<nElems; j++)
    {
      System.out.print(a[j] + " ");
    }
    System.out.println("");
  }
}
