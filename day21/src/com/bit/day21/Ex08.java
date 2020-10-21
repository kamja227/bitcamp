package com.bit.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

   public static void main(String[] args) {
      // ByteStream - output
      File file = new File("ex08.bin");
      java.io.FileOutputStream fos = null;

      try {
         fos = new FileOutputStream(file);
         String msg="hello";

         byte[] byt=msg.getBytes();
         for(int i=0; i<byt.length; i++){
            fos.write(byt[i]); //한바이트씩 쪼개서 작성
         }
         
//         fos.write('a');
//         fos.write('b');
//         fos.write('c');

         fos.close();
         System.out.println("작성완료");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}