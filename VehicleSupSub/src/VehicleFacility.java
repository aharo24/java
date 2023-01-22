public class VehicleFacility
{
    public static void main(String[] args)
    {
        CarOne carOne = new CarOne(1999,"Honda",1500);
        CarTwo carTwo = new CarTwo(8000,"Toyota",23000);

        System.out.println(carOne.year+"\t" + carOne.make +"\t"+ carOne.cost);

        System.out.println(carTwo.weight+"\t" + carTwo.make +"\t"+ carTwo.cost);

    }
}
