package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

//    @Test
//    public void setNameTest() {
//        Dog testDog = new Dog("Fido", null, null);
//        String expectedName = "Fido";
//        String actualName = testDog.getName();
//        Assert.assertEquals(expectedName, actualName);
//    }

    // TODO - Create tests for `speak`

        @Test
        public void speakTest()
        {
            Dog testDog = new Dog("Fido", null, null);
            String expected = "bark!";
            String actual = testDog.speak();
            Assert.assertEquals(expected, actual);
        }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    public void setBirthDateTest()
    {
        Dog testDog = new Dog("Fido", new Date(1982, 9, 6), null);
        Date expected = new Date(1982, 9, 6);
        Date actual = testDog.getBirthDate();
        Assert.assertEquals(expected,actual);
    }


    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIdTest ()
    {
        Dog testDog = new Dog("Misty", null, 43580);
        Integer expected = 43580;
        Integer actual = testDog.getId();
        Assert.assertEquals(expected,actual);
    }



    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void checkAnimalInheritance() {
        Dog testDog = new Dog("Simon", null, null);
        Assert.assertEquals(true, testDog instanceof Animal);
    }



    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void checkMammalInheritance()
    {
        Dog testDog = new Dog ("Mary", null, null);
        Assert.assertEquals(true, testDog instanceof Mammal);
    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
