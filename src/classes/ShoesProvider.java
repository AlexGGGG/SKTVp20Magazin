/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ShoesProvider {

    /**
     *
     * @return
     */
    public shoes createShoes(){
        Scanner scanner = new Scanner(System.in);
        shoes shoes;
        shoes = new shoes();
        System.out.println("Марка: ");
        Shoes.setMarka(scanner.nextLine());
        System.out.println("Модель: ");
        Shoes.setModel(scanner.nextLine());
        System.out.println("Год выпуска: ");
        Shoes.setYear(new Integer(scanner.nextLine()));
        System.out.println("Стоимость: ");
        Shoes.setPrice(new Integer(scanner.nextLine()));
        System.out.println("Количество экземпляров: ");
        Shoes.setQuantity(Integer.parseInt(scanner.nextLine()));
        return shoes;
    }

    private static class shoes {

        public shoes() {
        }
    }

    static class Shoes {

        private static void setMarka(String nextLine) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setModel(String nextLine) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setYear(Integer integer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setPrice(Integer integer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setQuantity(int parseInt) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }



  

}