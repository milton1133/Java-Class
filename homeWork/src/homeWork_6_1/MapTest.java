package homeWork_6_1;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

import com.sun.media.sound.ModelInstrumentComparator;

public class MapTest {

	public static void main(String[] args) {

		People p1 = new People("001", 21);
		People p2 = new People("002", 33);
		People p3 = new People("003", 41);

		// 實作1:請定義一個泛型的Map,key值為people的id,value為『People物件』,將上述三個people放入Map中

		Map<String, People> map = new HashMap<>();
		map.put(p1.getName(), p1);
		map.put(p2.getName(), p2);
		map.put(p3.getName(), p3);
		System.out.println("實作一:");
		System.out.println("Map裡面的物件數量:" + map.size());
		// 實作2:請用for迴圈或者iterator,利用實作1的Map計算三人的平均年齡至少到小數第一位。

		// 利用keySet來取得所有key值
		Set keys = map.keySet();
		System.out.println("實作二:");
		System.out.println("【利用keyset取得Value】");
		for (Object key : keys) {
			String name = (String) key;
			People a1 = map.get(name);

			System.out.println("name:" + name + ",age:" + a1.getAge());
		}

		System.out.println("-------------------------------------");

		// 利用entrySet來取得Value
		System.out.println("【利用entrySet來取得Value】");
		Set entrySet = map.entrySet();
		float sum = 0;
		float avgAge = 0;
		for (Object item : entrySet) {

			Map.Entry entry = (Map.Entry) item;
			People b1 = (People) entry.getValue();
			sum = sum + b1.getAge();
			System.out.println("name:" + entry.getKey() + ",age:" + b1.getAge());

		}
		avgAge = sum / entrySet.size();
		DecimalFormat frmt = new DecimalFormat();
		frmt.setMaximumFractionDigits(1);
		System.out.println("平均年齡:" + avgAge);
		// 使用DecimalFormat轉換
		System.out.println("平均年齡:" + frmt.format(avgAge) + "使用DecimalFormat轉換");
		// 使用String.fromat轉換
		System.out.println(String.format("平均年齡:%.1f", avgAge) + "使用String.fromat轉換");

	}
}
