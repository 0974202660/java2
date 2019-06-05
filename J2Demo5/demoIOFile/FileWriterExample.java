/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoIOFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {   
   try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     File f = new File("FileWriter.txt");
     FileWriter fw = new FileWriter(f);

     //Bước 2: Ghi dữ liệu
     fw.write("Ghi dữ liệu bằng luồng character");
     fw.write("\n");
     fw.write("Ghi chán chê mê mỏi mệt mãi mệt mỏi ");

     //Bước 3: Đóng luồng
     fw.close(); 
   } catch (IOException ex) {
     System.out.println("Lỗi " + ex);
 }
 }
}
