import java.util.ArrayList;

public class QuestionTwo {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-1);
        array.add(3);
        array.add(28);
        array.add(17);
        array.add(9);
        array.add(30);
        listDemo(array);
    }

    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }
}

/*
1. [16, 11, 6]
2. [5, 8, 9, 3, 9]
3. [31, 10, 18, 29, 4, 0]
*/