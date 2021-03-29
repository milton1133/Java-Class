package homeWork_5_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ShoppingCart {
	public static void main(String[] args) {

		// 實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)

		
		Product n1 = new Notebook("Asus",30000);
		Product n2 = new Notebook("Acer",20000);
		Product f1 = new Food("Cookie",200);
		System.out.println("實作一:");
		System.out.println("產品名稱:" + n1.getName() +","+ "產品價格:" + n1.getPrice());
		System.out.println("產品名稱:" + n2.getName() +","+ "產品價格:" + n2.getPrice());
		System.out.println("產品名稱:" + f1.getName() +","+ "產品價格:" + f1.getPrice());
		
		//實作2.利用for迴圈,計算shoppingList中的總金額,並印在Console中
		
		List<Product> shoppingList = new ArrayList<Product>();
		shoppingList.add(n1);
		shoppingList.add(n2);
		shoppingList.add(f1);
		int sum = 0 ;
		for (Product product : shoppingList) {
			sum = sum + product.getPrice();
		}
		System.out.println("-------------------------------");
		System.out.println("實作二:");
		System.out.println("shoppingList中的總金額:" + sum);
		
		//實作3.利用for迴圈,加總shoppingList中是Notebook型態的總金額,並印在Console中
		System.out.println("-------------------------------");
		System.out.println("實作三:使用初階for迴圈");
		int sum3 = 0;
		for (int i =0 ; i < shoppingList.size(); i++) {
			if (shoppingList.get(i) instanceof Notebook) {
				sum3 = sum3 + shoppingList.get(i).getPrice();		
			}		
		}
		System.out.println("shoppingList中是Notebook型態的總金額:" + sum3);
		
		
		System.out.println("實作三:使用進階for迴圈");
		int sum2 = 0 ;
		for (Product product : shoppingList) {
			if(product instanceof Notebook) {
				sum2 = sum2 + product.getPrice();
			}
		}
		System.out.println("shoppingList中是Notebook型態的總金額:" + sum2);
		int sum4 = 0;
		System.out.println("實作三:使用Iterator");
		Iterator<Product> ite1 = shoppingList.iterator();
		while (ite1.hasNext()) {
			Product str = ite1.next();
			if(str instanceof Notebook) {
				sum4 = sum4 + str.getPrice();
			}
			
		}
		System.out.println("shoppingList中是Notebook型態的總金額:" + sum4);
		
		
	}
}