public class AnimalFactoryProducer {
    public static AbstractAnimalFactory getFactory(String type)
    {
        switch (type){
            case "AIR":
                return new AirAnimalFactory();
            case "LAND":
                return new LandAnimalFactory();
            case "WATER":
                return new WaterAnimalFactory();
            default:
                return null;
        }
    }
}
