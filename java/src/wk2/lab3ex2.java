package wk2;

import java.util.ArrayList;

public class lab3ex2 {
    private ArrayList shoppingList;

    public lab3ex2(){
        shoppingList = new ArrayList();
    }

    public void addItem(String item){
        shoppingList.add(item);
    }
    public int numberOfItems(){
        return shoppingList.size();
    }
    public void listItem(int itemNumber){
        if ((itemNumber - 1) < numberOfItems()) {
            System.out.println(itemNumber + "-th item in the shopping list is " + shoppingList.get(itemNumber - 1));
        }
        else {
        }
    }

    public void listShopping(){
        int list = 0;
        while(list < shoppingList.size()) {
            System.out.println(shoppingList.get(list));
            list++;
        }
    }
}
