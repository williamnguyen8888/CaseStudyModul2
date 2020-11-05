/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseStudy;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 *
 * @author willi
 */
public class FileManage implements Serializable {
    private static final String pathFile= "userlist.dat";
   public void writeFile(List<Hotel> customer) throws IOException {
       FileOutputStream fout = new FileOutputStream(pathFile);
       ObjectOutputStream obs = new ObjectOutputStream(fout);
       obs.writeObject(customer);
       obs.close();
       fout.close();
   }
   public List<Hotel> readFile() throws IOException, ClassNotFoundException {
       FileInputStream fis = new FileInputStream(pathFile);
       ObjectInputStream ois = new ObjectInputStream(fis);
       List<Hotel> list1 =(List<Hotel>) ois.readObject();
       return list1;
   }
}
