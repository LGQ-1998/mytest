/*
* @Author: LGQ
* @Date:   2021-04-20 15:36:02
* @Last Modified by:   LGQ
* @Last Modified time: 2021-04-20 15:37:39
*/
public class Hello{
	public static void main(String[] args){
		System.out.println("Hello world!");
		System.out.println("Hello world!");

		String str = "Hello world!";
		for(int i=0; i < str.length(); i++){
			System.out.println(str.charAt(i));
		}

	}

	public static int getSum(int n1, int n2){
		return n1+n2;
	}
}