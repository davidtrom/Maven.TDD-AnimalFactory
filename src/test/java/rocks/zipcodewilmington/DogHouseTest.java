package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void addTest()
    {
        Dog testDog = new Dog("Dewey", null, 335);
        DogHouse.add(testDog);
        Assert.assertEquals(testDog, DogHouse.getDogById(335));
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTestById()
    {
        Dog testDog = new Dog("Dewey", null, 337);
        DogHouse.add(testDog);
        DogHouse.remove(337);
        Assert.assertEquals(null, DogHouse.getDogById(337));
    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeTestByName()
    {
        Dog testDog = new Dog("Dewey", null, 331);
        DogHouse.add(testDog);
        DogHouse.remove(testDog);
        Assert.assertEquals(null, DogHouse.getDogById(331));
    }



    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByIdTest()
    {
        Dog testDog3 = new Dog("Dewey", null, 339);
        DogHouse.add(testDog3);
        Assert.assertEquals(testDog3, DogHouse.getDogById(339));
    }



    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
