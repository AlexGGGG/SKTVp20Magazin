/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Buyer;
import entity.History;
import entity.Shoes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class SaveToFile {
    public void saveShoes(List<Shoes> listShoes){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try{
        fileOutputStream = new FileOutputStream("Shoes");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listShoes);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: на диске нет файла Shoes");
        } catch (IOException ex) {
            System.out.println("Ошибка: записать в файл не удалось");
        } finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса oos", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса fos", ex);
                }
            }
        }
    }    
    public List<Shoes> loadShoes(){
        List<Shoes> listShoes = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Shoes");
            objectInputStream = new ObjectInputStream(fileInputStream);
            listShoes = (List<Shoes>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: не найден файл Shoes");
        } catch (IOException ex) {
            System.out.println("Ошибка: чтение файла Shoes не удолось");
        } catch (ClassNotFoundException ex) {
            System.out.println("Ошибка: нет класса Shoes");
        }finally{
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listShoes;
    }
    public void saveBuyers(List<Buyer> listBuyers){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Buyers");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listBuyers);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: на диске нет файла Buyers");
        } catch (IOException ex) {
            System.out.println("Ошибка: записать в файл не удалось");
        } finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса oos", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса fos", ex);
                }
            }
        }
    }
    public List<Buyer> loadBuyers(){
        List<Buyer> listBuyers = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Buyers");
            objectInputStream = new ObjectInputStream(fileInputStream);
            listBuyers = (List<Buyer>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: не найден файл Buyers");
        } catch (IOException ex) {
            System.out.println("Ошибка: чтение файла Buyers не удалось");
        } catch (ClassNotFoundException ex) {
            System.out.println("Ошибка: нет класса");
        }finally{
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listBuyers;
    }
    void saveHistories(List<History> listHistories){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Histories");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listHistories);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: на диске нет файла Histories");
        } catch (IOException ex) {
            System.out.println("Ошибка: записать в файл не удалось");
        } finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса oos", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса fos", ex);
                }
            }
        }
    }
    List<History> loadHistories() {
        List<History> listHistories = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Histories");
            objectInputStream = new ObjectInputStream(fileInputStream);
            listHistories = (List<History>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: не найден файл Histories");
        } catch (IOException ex) {
            System.out.println("Ошибка: чтение файла Histories не удалось");
        } catch (ClassNotFoundException ex) {
            System.out.println("Ошибка: нет класса History");
        }finally{
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listHistories;
    }

    void saveShoes(Iterable<Shoes> listShoes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}