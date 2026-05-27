import java.util.Arrays;
public class TaskOne{
	public static int[] sumOfTarget(int[] arr){
      int target = 9;
	  int firstNum = arr[0];
      int secondNum = arr[0];
	for (int counter = 0; counter < arr.length; counter++) {
		for (int count = counter+1; count < arr.length; count++) {
			if (arr[counter] + arr[count] == target) {
                firstNum = arr[counter];
                secondNum = arr[count];
            }
        }

    }
       int[] newArray = {firstNum, secondNum};
        return newArray;

}

    public static void main(String[] args){
    int[] array = {3,2,4,6,5,1,8,9,2,0};
    System.out.println(Arrays.toString(sumOfTarget(array)));
}

}
