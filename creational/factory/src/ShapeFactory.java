public class ShapeFactory {
    public Shape getShape(String type)
    {
        if (type == null) return null;

        switch (type)
        {
            case "RECTANGLE":
                return new Rectangle();
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
