public class AbstractFactoryMain
{
    public static void main(String[] args) {
        AbstractAnimalFactory airAnimalFactory = AnimalFactoryProducer.getFactory("AIR");
        Animal bird = airAnimalFactory.getAnimal("BIRD");
        bird.eat();

        AbstractAnimalFactory landAnimalFactory = AnimalFactoryProducer.getFactory("LAND");
        Animal dog = landAnimalFactory.getAnimal("DOG");
        dog.eat();
        Animal cat = landAnimalFactory.getAnimal("CAT");
        cat.eat();

        AbstractAnimalFactory waterAnimalFactory = AnimalFactoryProducer.getFactory("WATER");
        Animal crocodile = waterAnimalFactory.getAnimal("CROCODILE");
        crocodile.eat();
    }
}
