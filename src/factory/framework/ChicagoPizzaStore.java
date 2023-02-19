package factory.framework;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
