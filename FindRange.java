package test1;


import java.util.HashMap;
import java.util.Scanner;

public class FindRange {

	public static void main(String[] args){
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int elementCount = input.nextInt();
		int i =0;
		int[] a = new int[elementCount+1];
		while(i<elementCount && input.hasNextInt())
		{
			a[i] = input.nextInt();
			i++;
		}
	//	System.out.println(Arrays.toString(a));
		int lookFor = 0;
		if(input.hasNextInt())
			 lookFor = input.nextInt();
		System.out.println("looking for:"+lookFor);
		int index = 0;
		HashMap<Integer,String> list1 = new HashMap<Integer, String>();
		int j =0;
		while(j<elementCount){
			String start = String.valueOf(index);
			if(j<elementCount-1){
				while(a[j] == a[j+1] )
				{ 
					index++;
					j++;
					if(j >= elementCount)
						break;
				}
			}
			start = start+","+String.valueOf(index);
			list1.put(a[j], start);
			index++;
			j++;
			}
		if(list1.containsKey(lookFor)){
			System.out.println(list1.get(lookFor));
		}
		}
}
		