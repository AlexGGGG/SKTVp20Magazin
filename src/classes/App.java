/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Buyer;
import entity.History;
import entity.Shoes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class App {
    List<Shoes> listShoes = new ArrayList<>();
    List<Buyer> listBuyers = new ArrayList<>();
    List<History> listHistories = new ArrayList<>();
    private final Iterable<shoes> listshoes;

    public App() {
        SaveToFile saveToFile = new SaveToFile();
        listShoes = saveToFile.loadShoes();
        listBuyers = saveToFile.loadBuyers();
        listHistories = saveToFile.loadHistories();
    }
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
        HistoryProvider historyProvider = new HistoryProvider();
        SaveToFile saveToFile = new SaveToFile();
        boolean flagExit = true;
        do{
            System.out.println("Список задач: ");
            System.out.println("0. Закрыть программу");
            System.out.println("1. Добавить Модель");
            System.out.println("2. Добавить покупателя");
            System.out.println("3. Список продоваемых Моделей");
            System.out.println("4. Список зарегистрированных покупателей");
            System.out.println("5. Покупка покупателем обуви");
            System.out.println("Введите номер задачи:");
            String numberTask = scanner.nextLine();
            if(null != numberTask)
                switch (numberTask) {
                    case "0":
                    flagExit = false;
                    System.out.println("Заканчиваем работу программы");
                    break;
                case "1":
                    System.out.println("Новая модель обуви.");
                    ShoesProvider shoesProvider;
            shoesProvider = new ShoesProvider();
                    ShoesProvider.Shoes shoes = null;
                    listShoes.add(shoes);
                    saveToFile.saveShoes(listShoes);
                    listShoes.forEach((c) -> {
                        System.out.println(c.toString());
            });
                    break;
                    case "2":
                    System.out.println("Новый покупатель.");
                    BuyerProvider buyerProvider = new BuyerProvider();
                    Buyer buyer = buyerProvider.createBuyer();
                    listBuyers.add(buyer);
                    saveToFile.saveBuyers(listBuyers);
                    listBuyers.forEach((b) -> {
                        System.out.println(b.toString());
            });
                    break;

                case "3":
                    System.out.println("Список обуви:");
                    int i = 1;
                    for(Shoes c : listShoes){
                        System.out.println(i+". "+c.toString());
                        i++;
                    }
                    break;
                case "4":
                    System.out.println("Список зарегистрированных покупателей:");
                    for(int j=0;j<listBuyers.size();j++){
                        System.out.println(j+1+". "+listBuyers.get(j).toString());
                    }
                    break;
                case "5":
                    System.out.println("Покупка покупателем обуви");
                    
                    History history = historyProvider.createHistory(listShoes, listBuyers);
                    if(history != null){
                        listHistories.add(history);
                        saveToFile.saveHistories(listHistories); 
                    }else{
                        
                    }
                       
                    break;
                
            }
        }while(flagExit);
    }

    private static class shoes {

        public shoes() {
        }
    }
}
     