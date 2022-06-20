package decorator.old;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        setDescription("최고의 다크로스트 커피");
    }

    public double cost() {
        return 1.99 + super.cost();
    }
}
