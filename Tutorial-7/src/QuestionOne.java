public class QuestionOne {
    public static void main(String[] args) {
        int num = loadArray(new int[]{8, 4, 2, 0, 4});
        System.out.println(num);
    }

    public static int loadArray(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
            return list[i];
        }
        return 0;
    }
}


/*
1. 0
2. 9
3. 10
4. 3
5. 12
*/