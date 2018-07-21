package demo;

public class Jfd {

	public static void main(String[] args) {
		int[] arr=new int[] {1,8,0,5,2,3,9};
		int[] index = new  int[] {0,1,1,0,2,3,4,3,0,5,6};
		String tel = "";
		for (int i : index) {
			tel+=arr[i];
		}
	}
}
