public class Deletesmallnumber {
	 public static int[] solution(int[] arr) {
	      int min = arr[0];
	      int[] answer = new int[arr.length - 1];//최솟값이 빠지니 -1한 길이의 배열 생성 

	      if (arr.length <= 1) {
	         int[] a = { -1 };
	         return a;
	      }

	         for (int i = 0; i < arr.length; i++) {

	            if (min > arr[i]) {
	               min = arr[i];
	            }

	         }
	           int index = 0;
	         for (int j = 0; j < arr.length; j++) {
	            if (min == arr[j]) {
	               continue;
	            } else { 
	               answer[index++] = arr[j];
	            }

	         }


	      return answer;

	   }
	public static void main(String[]args) {
		int [] arr= {4, 3, 2, 1};
		
		System.out.println(solution(arr));	
		
	}	
}
