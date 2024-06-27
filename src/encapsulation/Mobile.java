package encapsulation;

public class Mobile {

    private String manufacturer;
    private String operatingSystem;
    private int cost;
    public String model;

     Mobile(String manufacturer, String operatingSystem, int cost, String model) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.cost = cost;
        this.model = model;
    }

    public String getModel(){
         return this.model;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile("MyCompany", "OS", 15000, "qweduns84");
        System.out.println(m.getModel());
        System.out.println(m.cost);
        System.out.println(m.operatingSystem);
    }
}
