import java.util.ArrayList;

public class Home
{
    ArrayList<Animal> pets = new ArrayList<Animal>();
    public void adoptPet(Animal pet)
    {
        pets.add(pet);
    }
    public void makeAllSounds()
    {
        for(Animal a: pets)
        {
            a.sounds();
        }
    }

    public static void main(String[] args)
    s{
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();

        home.makeAllSounds();
        home.adoptPet(dog1);
        home.adoptPet(cat1);
        home.makeAllSounds();

        System.out.println(dog1.eat());
        System.out.println(dog1.sounds());
        System.out.println(cat1.eat());
        System.out.println(cat1.sounds());

    }
}
