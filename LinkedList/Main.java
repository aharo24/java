public class Main {
    public static void main(String[] args)
    {
        LinkedList link = new LinkedList();

        link.insert(2);
        link.insert(4);
        link.insert(6);
        link.show();


        System.out.println("-------------change----------------");
        link.insertAtStart(1);
        link.show();

        System.out.println("-------------change----------------");
        link.insertAt(2,5);
        link.show();

    }
}
