import java.util.Arrays;

public class TwoSum {
	public static int[] findTwoSum(int[] list, int sum) {
    	int[] returnArray = new int[list.length];
    	Arrays.sort(list);
        // printArray(a);

        int top = 0;
        int bott = list.length - 1;

        while (top < bott) {

            while (list[bott] > sum)
                bott--;

            int num = list[top] + list[bott];

            if (sum == num) {
                System.out.println(list[top] + " " + list[bott]);
                returnArray[0] = list[top];
                returnArray[1] = list[bott];
                top++;
                bott--;
            }

            if (num < sum)
                top++;
            if (num > sum)
                bott--;
        }


        return returnArray;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
//        for (int i = 0; i<indices.length; i++) {
 //           System.out.println(indices[0] + " " + indices[1]);
            
 //       }
    }
}