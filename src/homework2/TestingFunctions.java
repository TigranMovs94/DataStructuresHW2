package homework2;

public class TestingFunctions {


    public static void testListFunctions(DequeADT<Person> l) {
        System.out.println("Running tests for " + l.getClass().getSimpleName() + " functions");
        System.out.println("==========================================");



        Professor first = new Professor();
        Professor second = new Professor();
        Professor third = new Professor();
        int size = l.size();

        l.pushFront(first);

        //Push Front
        if (l.front()==first && size < l.size()) {
            System.out.println("pushFront test - Success");
        } else {
            System.out.println("pushFront test - Failure");
        }
        l.pushBack(third);

        //Push Back
        if (l.size()>size && l.back().equals(third)) {
            System.out.println("pushBack test - Success");
        } else {
            System.out.println("pushBack test - Failure");
        }

        //Pop Front

        if (l.popFront()) {
            System.out.println("popFront test - Success");
        } else {
            System.out.println("popFront test - Failure");
        }


        //Pop Back

        if (l.popBack()) {
            System.out.println("popBack test - Success");
        } else {
            System.out.println("popBack test - Failure");
        }


    }


    public static void main(String[] str) throws Exception {
        DoubleLinkedListDeque<Person> ll = new DoubleLinkedListDeque<>();
        testListFunctions(ll);
        System.out.println();

        ArrayDeque<Person> al = new ArrayDeque();
        testListFunctions(al);

    }
}

