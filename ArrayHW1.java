package Array;

public class ArrayHW1 {
    public static void main(String[] args) {
        //HW:1 Write a Java program to calculate the average value of array elements [example array values: 5, 6, 8, 9,11]

        //int myVar[] = {5, 6, 8, 9,11};
        // int result = 0;
        //  for (int i = 0; i<=4; i++) {

        // result = result + myVar[i];
        // }
        // float result2 = result/5.00F;
        // System.out.println(result2);
        int[] myArray = {5, 10, 15, 20, 25, 30, 37, 40, 5, 10, 15, 20, 25, 30, 37, 40,};
        int sum = 0;
        for(
                int i = 0;
                i <=myArray.length-1;i++)
            sum += myArray.length;
        double average = sum/myArray.length;
        System.out.println(sum);
        System.out.println(average);
    }
}


