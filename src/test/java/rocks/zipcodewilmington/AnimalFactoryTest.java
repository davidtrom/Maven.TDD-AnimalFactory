package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest (){
        String name = "Henry";
        Dog testDog = AnimalFactory.createDog(name, null);

        Assert.assertTrue(testDog instanceof Dog);
    }

    @Test
    public void createCatTest (){
        String name = "Fluffy";
        Cat testCat = AnimalFactory.createCat(name, null);

        Assert.assertTrue(testCat instanceof Cat);
    }

}
