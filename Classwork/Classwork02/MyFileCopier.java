/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  TargetFile.java
 *  Purpose       :  To copy the file
 *  @author       :  Jordyn Polk
 *  Date written  :  2018-09-07
 *  Description   :  Takes the string from the Source File and copies it
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 package copiersupport;

 import java.io.BufferedWriter;
 import java.io.IOException;
 import java.io.FileWriter;

 public class TargetFile{
   public TargetFile(String uploadedFile, String newFile) {
     try{
       BufferedWriter bW = new BufferedWriter(new FileWriter(newFile));
       bW.write(uploadedFile);
     } catch(IOException ioe){
       System.out.println("Could not find file:");
     }
   }
 }
