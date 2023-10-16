public class TaskTwo {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 2; i <= 50; i += 2) {
            sum += i;
            count++;
        }
        System.out.println("Sum of all even numbers : " + sum);
        System.out.println("Count of the even numbers : "+ count);
    }
}
