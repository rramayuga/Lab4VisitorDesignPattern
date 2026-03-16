public class FurnitureStore {

    public static void main(String[] args) {

        Furniture chair = new Chair(5);
        Furniture table = new Table(4, 3);
        Furniture sofa = new Sofa(20, 10);

        ShippingVisitor shippingCalculator = new ShippingCostVisitor();

        System.out.println("Chair Shipping Cost: " + chair.accept(shippingCalculator));
        System.out.println("Table Shipping Cost: " + table.accept(shippingCalculator));
        System.out.println("Sofa Shipping Cost: " + sofa.accept(shippingCalculator));
    }
}