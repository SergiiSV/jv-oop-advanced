package core.basesyntax;

public class Rectangle extends Figure {
    private int leftLeg;
    private int rightLeg;

    Rectangle(String color, int leftLeg, int rightLeg) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    public int getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(int leftLeg) {
        this.leftLeg = leftLeg;
    }

    public int getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(int rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    double area() {
        return getLeftLeg() * getRightLeg();
    }

    @Override
    String nameOfFigure() {
        return "rectangle";
    }

    @Override
    void infoAboutFigure() {
        System.out.println(new StringBuilder().append("Figure: rectangle, area: ").append(area())
                .append(" sq.units, leftLeg: ").append(getLeftLeg()).append(" units, rightLeg: ")
                .append(getRightLeg()).append(" units, color: ").append(getColor()));
    }
}
