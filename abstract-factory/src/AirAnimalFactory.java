public class AirAnimalFactory extends AbstractAnimalFactory{
    @Override
    Animal getAnimal(String animalType) {
        switch (animalType)
        {
            case "BIRD":
                return new Bird();
            default:
                return null;
        }
    }
}
