public class CreateItem
{
  public static void main(String[] args)
  {
    System.out.println("Test the default constructor and set methods: ");
    Item item1 = new Item();
    item1.setName("Computer");
    item1.setPrice(500);
    item1.setQuantity(10);
    System.out.printf("Item: %s, %.2f, %d%n%n",
        item1.getName(), item1.getPrice(), item1.getQuantity());

    System.out.println("Test a new item and invalid data: ");
    Item item2 = new Item("Basketball", -19.99, -10);
    System.out.printf("Item: %s, %.2f, %d%n",
        item2.getName(), item2.getPrice(), item2.getQuantity());
    item2.setPrice(-19.99);
    item2.setQuantity(-10);
    System.out.printf("Item: %s, %.2f, %d%n",
        item2.getName(), item2.getPrice(), item2.getQuantity());
    item2.setPrice(19.99);
    item2.setQuantity(10);
    System.out.printf("Item: %s, %.2f, %d%n%n",
        item2.getName(), item2.getPrice(), item2.getQuantity());

    System.out.println("Attempt to reduce the number of basketballs by -2");
    item2.reduce(-2);
    System.out.printf("Item: %s, %.2f, %d%n",
        item2.getName(), item2.getPrice(), item2.getQuantity());
    System.out.println("Attempt to reduce the number of basketballs by 2");
    item2.reduce(2);
    System.out.printf("Item: %s, %.2f, %d%n",
        item2.getName(), item2.getPrice(), item2.getQuantity());
  }
}
