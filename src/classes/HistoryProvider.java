/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Buyer;
import entity.History;
import entity.Shoes;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HistoryProvider {

    Scanner scanner = new Scanner(System.in);

    public History createHistory(List<Shoes> listShoes, List<Buyer> listBuyers) {
        History history = new History();

        System.out.println("Список автомобилей: ");
        int countCurrentCars = 0;
        for (int i = 0; i < listShoes.size(); i++) {
            if (listShoes.get(i).getCount() > 0) {
                System.out.printf("%d. Марка: %s, модель: %s, дата выпуска: %d, стоимость: %s%n",
                         i + 1,
                         listShoes.get(i).getMarka(),
                         listShoes.get(i).getModel(),
                         listShoes.get(i).getYear(),
                         listShoes.get(i).getPrice()
                );
                countCurrentCars++;
            }
        }
        if (countCurrentCars == 0) {
            System.out.println("Все автомобили проданы.");
            return null;
        }
        System.out.print("Выберите номер покупаемого автомобиля: ");
        int takeCarNum = scanner.nextInt();
        Shoes shoes = listShoes.get(takeCarNum - 1);
        if (shoes.getCount() > 0) {
            shoes.setCount(shoes.getCount()-1);
            System.out.println("Список клиентов: ");
            int i=0;
            for(Buyer b : listBuyers){
                System.out.printf("%d. Имя и фамилия клиента: %s%s, email: %s количество денег: %s%n"
                ,i+1
                ,b.getName()
                ,b.getLastname()
                ,b.getEmail()
                ,b.getMoney()
                );
                i++;
            }
            System.out.println("Выберите номер клиента: ");
            int buyerNum = scanner.nextInt();
            Buyer buyer = listBuyers.get(buyerNum-1);
            buyer.setMoney(buyer.getMoney()-shoes.getPrice());
            history.setShoes(shoes);
            history.setBuyer(buyer);
            history.setTakeOn(new Date());
            return history;
        }else{
            System.out.println("Обувь \""
            +shoes.getModel()
            +"\" продана."
            );
            return null;
        }
    }

    History createHistory(Iterable<Shoes> listShoes, List<Buyer> listBuyers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}