/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo5;

/**
 *
 * @author 
 */
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExample {
 public static void main(String[] args) { 
  try {
   //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
   FileOutputStream fos = new FileOutputStream("a.txt");
   DataOutputStream dos = new DataOutputStream(fos);

   //Bước 2: Ghi dữ liệu
   dos.writeInt(100);
   dos.writeDouble(9.5);

   //Bước 3: Đóng luồng
   fos.flush();
   fos.close();
   dos.flush();
   dos.close();
   System.out.println("Done!");
  } catch (IOException ex) {
    ex.printStackTrace();
  } 
 }
} 
