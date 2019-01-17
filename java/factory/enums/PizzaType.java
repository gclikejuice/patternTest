package factory.enums;

public enum PizzaType {
    PIZZA_1("披萨一号",1),PIZZA_2("披萨二号",2),PIZZA_3("披萨三号",3);
    private String name;
    private int index;
    private PizzaType(String name,int index){
        this.name = name;
        this.index = index;
    }
}
