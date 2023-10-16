public class TaskThree {
    public static void main(String[] args) {
        int array[] = {10, 35, 75, 60, 100, 2, 3};

        int largestNum = 0;
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNum){
                largestNum = array[i];
            }
            total += array[i];
        }

        System.out.println("Largest : "+largestNum);
        System.out.println("Total : "+total);
    }
}
