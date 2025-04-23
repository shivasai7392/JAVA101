public class Shapefactory{
    public Shape getInstanceShape(String shapeName){
        Shape shape = switch (shapeName) {
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            case "Triangle" -> new Triangle();
            default -> null;
        };
        return shape;
    }
}
