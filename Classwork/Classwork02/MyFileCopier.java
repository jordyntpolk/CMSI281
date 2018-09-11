/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  MyFileCopier.java
 *  Purpose       :  To copy read and copy a user inputted file
 *  @author       :  Jordyn Polk
 *  Date written  :  2018-09-07
 *  Description   :  Takes the file given by the user and copies
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 import copiersupport.SourceFile;
 import copiersupport.TargetFile;
 import java.util.Scanner;

 public class MyFileCopier{
     public static void main(String args[]) {
          System.out.println("Input the name of the file:");
          Scanner userInput = new Scanner( System.in );
          String fileInputName = userInput.nextLine();
          SourceFile requestedFile = new SourceFile(fileInputName);
          String content = requeestedFile.getContent();
          TargetFile copiedFile = new TargetFile(content, fileInputName + ".copy");
     }
 }
