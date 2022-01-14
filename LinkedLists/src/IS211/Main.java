package IS211;

import IS211.LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> test = new LinkedList<>();
        for (int i = 0; i < 100; i++){
            test.add(i);
        }
        test.remove(0);
        System.out.println(test.contains(5));
        System.out.println(test.contains(99));
    }
}
