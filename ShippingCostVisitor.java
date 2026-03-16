public class ShippingCostVisitor implements ShippingVisitor {

    @Override
    public double visit(Chair chair) {
        return 50.0;
    }

    @Override
    public double visit(Table table) {
        return table.getArea() * 2;
    }

    @Override
    public double visit(Sofa sofa) {
        return (sofa.getWeight() * 5) + (sofa.getDistance() * 2);
    }
}