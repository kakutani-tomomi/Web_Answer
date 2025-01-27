package model.service;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzService {
	public List<String> getFizzBuzzList() {
		//戻り値用リスト
		List<String> fizzBuzzList = new ArrayList<String>();
		String str;
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				str = "fizzBuzz";
			} else if (i % 5 == 0) {
				str = "buzz";
			} else if (i % 3 == 0) {
				str = "fizz";
			} else {
				str = String.valueOf(i);
			}
			fizzBuzzList.add(str);
		}
		System.out.println(fizzBuzzList);
		return fizzBuzzList;
	}
}
