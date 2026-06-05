package Projects.Hungerbox;

import java.util.ArrayList;
import java.util.Arrays;

interface Orderable{
    double getPrice();
    String getDescription();
    void prepare();
}

interface Discounts{
    double applyDiscounts(double discount);
}

abstract class MenuItems implements Orderable,Discounts{
    private final String name;
    private double price;
    int totalNumberOfOrders=0;
    private String categories;

    public MenuItems(String name,double price,String categories){
        this.name=name;
        this.price=price;
        this.categories=categories;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }
    }

    public int getTotalNumberOfOrders() {
        return totalNumberOfOrders;
    }

    public void setTotalNumberOfOrders(int totalNumberOfOrders) {
        this.totalNumberOfOrders = totalNumberOfOrders;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public String getDescription() {
        return "Item Name : "+getName()+"Price:$"+getPrice();
    }

    @Override
    abstract public void prepare();

    @Override
    public double applyDiscounts(double discount) {
        return price-(price*discount/100);
    }
}

class VegItems extends MenuItems {
    private boolean isJain;

    public VegItems(String name, double price) {
        super(name, price, "Veg");
        isJain = false;
    }

    public VegItems(String name, double price, boolean isJain) {
        super(name, price, "Veg");
        this.isJain = isJain;   // Fixed
    }

    @Override
    public void prepare() {
        System.out.println("your Order of " +getName()+ "Of Price" +getPrice()+"Is Been Prepared");
        setTotalNumberOfOrders(getTotalNumberOfOrders()+1);
    }
}

class NonVegItems extends MenuItems{
    private String meatType;

    public NonVegItems(String name, double price, String categories, String meatType) {
        super(name, price, categories);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println("your Order of " +getName()+ "Of Price" +getPrice()+"Is Been Prepared");
        totalNumberOfOrders++;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+this.meatType;
    }
}

class Orders{
    private final int orderId;

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    private static int orderCount=0;
    private final String customerName;
    ArrayList<MenuItems>list;
    private String status;

    Orders(String customerName){
        this.customerName=customerName;
        this.list=new ArrayList<>();
        this.status="Order Placed";
        this.orderId=++orderCount;
    }

    public void addItems(MenuItems items)
    {
        list.add(items);
//        System.out.println(items.getDescription());
        System.out.println("the Items Ordered is "+ items.getName()+ "The Price is "+items.getPrice());
    }

    public void prepareOrder(){
        this.status="preparing Order";
        for(MenuItems items:list)
        {
            items.prepare();
        }
        this.status="Ready";
    }

    double calculatePrice()
    {
        double price=0;
        for(MenuItems items:list){
            price +=items.getPrice();
        }
        return price;
    }

    void generateBill(double discountPercent){
        double subtotal = calculatePrice();
        double discounted = subtotal - (subtotal * discountPercent / 100);
        double tax  = discounted * 0.05;
        double total = discounted + tax;

        System.out.println("  ┌────────────────────────────────────┐");
        System.out.println("  │         HungerBox — Bill           │");
        System.out.println("  ├────────────────────────────────────┤");
        System.out.println("  │  Order ID  : #" + orderId);
        System.out.println("  │  Customer  : " + customerName);
        System.out.println("  │  Status    : " + status);
        System.out.println("  ├────────────────────────────────────┤");

        for (MenuItems item : list) {
            System.out.printf("  │  %-22s ₹%6.2f%n", item.getName(), item.getPrice());
        }

        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  Subtotal              ₹%8.2f%n", subtotal);

        if (discountPercent > 0)
            System.out.printf("  │  Discount (%d%%)         -₹%7.2f%n",
                    (int)discountPercent,
                    subtotal - discounted);

        System.out.printf("  │  GST (5%%)              ₹%8.2f%n", tax);
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  TOTAL                 ₹%8.2f%n", total);
        System.out.println("  └────────────────────────────────────┘");
    }
}

class Res{
    private String name;
    ArrayList<MenuItems> menu;
    ArrayList<Orders> o;

    Res(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.o = new ArrayList<>();
    }

    // Added Missing Method
    void addMenu(MenuItems item){
        menu.add(item);
    }

    void showMenu()
    {
        for(int i=0;i<menu.size();i++){
            System.out.println((i+1)+" : "+menu.get(i).getDescription());
        }
    }

    Orders placeOrder(String name)
    {
        Orders order1 = new Orders(name);
        o.add(order1);
        return order1;
    }

    MenuItems getItem(int index){
        return menu.get(index);
    }

    void showOrder()
    {
        for(Orders order : o){
            System.out.println("The order of "
                    + order.getCustomerName()
                    + " "
                    + order.getStatus());
        }
    }
}

public class Hungerbox {
    public static void main(String[] args) {

        Res res = new Res("spicy garden");

        res.addMenu(new VegItems("panner butter masala", 300));
        res.addMenu(new VegItems("soya butter masala", 500, true));
        res.addMenu(new VegItems("mushroom butter masala", 200));
        res.addMenu(new VegItems("babycorn butter masala", 400));
        res.addMenu(new NonVegItems("chicken butter masala", 300, "Nonveg", "chicken"));

        res.showMenu();
        Orders ord=res.placeOrder("Deepika");
        ord.addItems(res.getItem(0));
        ord.addItems(res.getItem(1));
        ord.addItems(res.getItem(2));
        ord.addItems(res.getItem(3));
        ord.prepareOrder();
        ord.generateBill(10);
    }
}