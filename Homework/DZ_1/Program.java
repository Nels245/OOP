package Homework.DZ_1;

public class Program {
    public static void main(String[] args) {
        BaseInfo Food = new Food();
        BaseInfo Drink = new Drink();
        BaseInfo Hygiene_items = new Hygiene_items();
        BaseInfo Child_products = new Child_products();
        BaseInfo Milk = new Milk();
        BaseInfo Limonad = new Limonad();
        BaseInfo Bread = new Bread();
        BaseInfo Eggs = new Eggs(); // Найти способ не выводит срок годности яиц
        BaseInfo Masks = new Masks(); // Найти способ не выводит кол-во масок в пачке
        BaseInfo Paper = new Paper(); // Найти способ не выводить
        BaseInfo Diapers = new Diapers(); // Найти способ не выводить
        BaseInfo Pacifier = new Pacifier(); // Найти способ не выводить

        Info(Food); // Альтернатива тому что ниже, с помощью метода)

        // System.out.println(Food.ToString());
        // System.out.println(Eggs.getInfo());
        // System.out.println(Bread.getInfo());
        // System.out.println(Drink.getInfo());
        // System.out.println(Limonad.getInfo());
        // System.out.println(Milk.getInfo());
        // System.out.println(Child_products.getInfo());
        // System.out.println(Pacifier.getInfo());
        // System.out.println(Diapers.getInfo());
        // System.out.println(Hygiene_items.getInfo());
        // System.out.println(Paper.getInfo());
        // System.out.println(Masks.getInfo());

    }

    // Метод вывода
    public static void Info(BaseInfo o) {
        System.out.println(o.getInfo()); // Или ToString т.к мы его переопределили (ovverride)
    }
}
