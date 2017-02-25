import java.util.Arrays;
import java.util.Scanner;

public class SecurityInvolution {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean check = false;
		int arr[] = new int[n+1];
		for (int i = 1; i <=n; i++) {
			// Onto Function
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);
		// For make one to one function every domain element has distinct value
		//so no duplicate allowed
		check = Duplicate(arr);

		if (check) {
			int temp=0;
			for (int i = 1; i <=n; i++) {
				temp = arr[i];
				arr[temp] = i;
			}
		
		System.out.println("YES");
		
		} 

		else {
			System.out.println("NO");

		}
	}

	//check bijective
	private static boolean Duplicate(int[] arr) {
		int length = arr.length;
		for (int i = 1; i <length - 1; i++) {

			if (arr[i] == arr[i + 1]) {

				return false;

			}

		}
		return true;
	}

}