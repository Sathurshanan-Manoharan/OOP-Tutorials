import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mark = 0;
        int[] marks = new int [6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter your marks : ");
            mark = input.nextInt();
            marks[i] = mark;
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int fail = 0;
        int pass = 0;
        int twoIsTwo = 0;
        int twoIsOne =0;
        int first = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >=  70){
                first++;
            } else if (marks[i] >= 60) {
                twoIsOne++;
            }else if (marks[i] >= 50) {
                twoIsTwo++;
            }else if (marks[i] >= 40) {
                pass++;
            }else {
                fail++;
            }
        }

        System.out.println("No of people failed : " + fail);
        System.out.println("No of people passed : " + pass);
        System.out.println("No of people from 50 to 59 (2:2) : " + twoIsOne);
        System.out.println("No of people from 60 to 69 (2:1) : " + twoIsTwo);
        System.out.println("No of people who got above 70 : " + first);


        //Calling the method to get the average
        double average = averageCalculator(marks);
        System.out.println("\nThe average is : "+ average);

        //Calling the method to get the max marks
        int maxMark = maxMarks(marks);
        System.out.println("\nThe maximum mark is : "+ maxMark);

        //Calling the method to get the min marks
        int minMark = minMarks(marks);
        System.out.println("\nThe minimum mark is : "+ minMark);

        //Calling the method to sort the max marks
        int[] sortedList = sortMarks(marks);
        System.out.print("Sorted List : ");
        for (int i = 0; i < sortedList.length; i++) {
            System.out.print(sortedList[i] + ", ");
        }
    }

    public static double averageCalculator(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return (double) total / 6;
    }

    public static int maxMarks(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int minMarks(int[] array){
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i+1]){
                min = array[i];
            }else{
                min = array[i+1];
            }
        }
        return min;
    }

    public static int[] sortMarks(int[] array){
        int min = 0;
        for (int i = 0; i < array.length -1; i++) {
            if(array[i] > array[i+1]){
                min = array[i+1];
                array[i+1] = array[i];
                array[i] = min;
            }
        }
        return array;
    }
}
