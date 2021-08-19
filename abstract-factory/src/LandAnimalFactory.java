public class LandAnimalFactory extends AbstractAnimalFactory{
    @Override
    Animal getAnimal(String animalType) {
        switch (animalType)
        {
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
            default:
                return null;
        }
    }
}
