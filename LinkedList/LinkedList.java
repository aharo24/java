public class LinkedList
{
    static Node head;

    public void insert( int data )
    {
        Node node = new Node();
        node.data = data;
        node.next = null;       // NEXT is like next_node[obj]

        if( head == null)
            head = node;
        else
        {
            Node n = head;  // set iteration
            while( n.next != null)
            {
                n = n.next;     // iterate ~ nth = [elems]
            } n.next = node;                    // finished now place NEW[next] node;
        }

    }

    public void insertAtStart( int data )
    {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
    }

    public void insertAt(int index, int data )
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if ( index == 0 ) insertAtStart(data);
        else{
            Node n = head;
            for(int i=0; i < index - 1; ++ i )
            {
                n = n.next;
            }
            newNode = n.next;
            n.next =  newNode;
        }
    }


//    public void insertAt ( int index, int data )
//    {
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.next = null;
//
//        if(index == 0) insertAtStart(data);
//        else{
//            Node n = head;  //trans ~~~ objsss[e]
//
//            for(int i=0; i < index - 1; ++ i )
//            {
//                n = n.next;
//            }
//            newNode.next = n.next;
//            n.next = newNode;
//
//        }
//    }


    public void deleteAt(int index)
    {
        Node n = head;      // head is assigned to n to ~~~~~~~~
        Node headRemover = null;    // temp assignation to overrite;
        if( index == 0) head = head.next;
        else {
            for(int i=0; i < index - 1; ++ i)
            {
                n = n.next;
            }
            headRemover = n.next;
         //   n.next = headRemover;
            n.next = headRemover;
            // optional step????
            System.out.println( "Elem deleted: "+ headRemover.data);
        }
    }

//    public void deleteAt( int index )
//    {
//        Node n = head;
//        Node headRemover = null;        // is the temp reference caller/pointer
//
//
//
//        if (index == 0) head = head.next;   // index 0 == 0th index i.o
//                                           //  head.next is the command
//                                            /// head just stores
//        else
//        {
//            for(int i=0; i < index - 1; ++ i)
//            {
//                n = n.next;                 // iterate like the rest of the stuff
//            }
//            headRemover = n.next;         // new .next[obj] will be assigned to headRemover
//
//            n.next = headRemover.next;     // OVERRITES the new [n.next]
//    // n.next is the [box] = the actions of overriting to HEAD[index]
//            System.out.println("Deleted Elem: " + headRemover.data);
//
//        }
//    }

    public void show()
    {
        Node n = head;
        while(n.next != null )
        {
            System.out.println("[ " + n.data + " ]");
            n = n.next;                         // order matters.... idk why?

        }
        System.out.println("[ " + n.data + " ]");
    }

}