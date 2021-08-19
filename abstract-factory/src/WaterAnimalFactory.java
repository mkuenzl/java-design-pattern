public class WaterAnimalFactory extends AbstractAnimalFactory {
    @Override
    Animal getAnimal(String animalType) {
        switch (animalType)
        {
            case "CROCODILE":
                return new Crocodile();
            default:
                return null;
        }
    }
}
