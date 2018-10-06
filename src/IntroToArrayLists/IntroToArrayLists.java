package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList <String> array = new ArrayList<>();
		//   Don't forget to import the ArrayList class
		array.add("zero");
		array.add("one");
		array.add("two");
		array.add("three");
		array.add("four");
		array.add("numberLetter");
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0 ; i < array.size() ; i++){
			System.out.println(array.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String e:array){
			System.out.println(e);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0 ; i < array.size(); i+=2){
			System.out.println(array.get(i));
		}
		//6. Print all the Strings in reverse order.
		for(int i = 4 ; i >=0; i--){
			System.out.println(array.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < 6; i++){
			if(array.get(i).contains("e")){
				System.out.println(array.get(i));
			}
			
		}
	}
}
