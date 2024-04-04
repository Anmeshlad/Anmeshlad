package StringDemos;

//Q. Write a program to replace all the 'd' characters with 'f' characters..

public class Demo16 {

	public static void main(String[] args) {
		String str="abcdddefgddgijk";
		System.out.println("Old String  characters : "+str);
		System.out.println("new String characters : "+str.replace('d', 'f'));
	}
}
