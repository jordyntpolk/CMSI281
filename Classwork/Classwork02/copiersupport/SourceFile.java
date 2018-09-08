/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  SourceFile.java
 *  Purpose       :  To read the given text file
 *  Author        :  Jordyn Polk
 *  Date          :  2018-09-7
 *  Description   :  Looks for a file and places its contents into a string
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

 package copiersupport;

 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.IOException;

 public class SourceFile {
   private String fileCopy;

   public SourceFile(String source){
     try {
       BufferedReader buffread = new BufferedReader(new FileReader(source));
       fileCopy = buffread.readLine();
     }
     catch (IOException ioe ) {
     System.out.println("File may not exist");
     }
   }

   public String getContent() {
     return fileCopy;
   }
 }
