public class Driver
{
    public static void main(String[] args) 
    {
        CircularQueque Q = new CircularQueque<>();
        // Q.offer(10); System.out.println(Q);

        // Q.offer(20); System.out.println(Q);

        // Q.offer(30); System.out.println(Q);
        // Q.offer(40); System.out.println(Q);
        // Q.offer(50); System.out.println(Q);

        // Q.offer(30); System.out.println(Q);
        // Q.offer(30); System.out.println(Q);

        Q.offer(4); System.out.println(Q);
        Q.offer(8); System.out.println(Q);
        Q.offer(6); System.out.println(Q);
        Q.poll(); System.out.println(Q);
        Q.offer(9); System.out.println(Q);
        Q.poll(); System.out.println(Q);
        Q.offer(2); System.out.println(Q);
        Q.offer(12); System.out.println(Q);



    }
}