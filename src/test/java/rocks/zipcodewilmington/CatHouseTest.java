package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addTest()
    {
        Cat testCat = new Cat("Dewey", null, 335);
        CatHouse.add(testCat);
        Assert.assertEquals(testCat, CatHouse.getCatById(335));
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeTestById()
    {
        Cat testCat = new Cat("Dewey", null, 337);
        CatHouse.add(testCat);
        CatHouse.remove(337);
        Assert.assertEquals(null, CatHouse.getCatById(337));
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeTestByName()
    {
        Cat testCat = new Cat("Dewey", null, 331);
        CatHouse.add(testCat);
        CatHouse.remove(testCat);
        Assert.assertEquals(null, CatHouse.getCatById(331));
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`


    @Test
    public void getCatByIdTest()
    {
        Cat testCat3 = new Cat("Dewey", null, 339);
        CatHouse.add(testCat3);
        Assert.assertEquals(testCat3, CatHouse.getCatById(339));
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest()
    {
        Cat testCat3 = new Cat("Dewey", null, 338);
        //Cat testCat4 = new Cat("Lady", null, 235);
        //Cat testCat5 = new Cat("Tramp", null, 135);
        int originalNum = CatHouse.getNumberOfCats();
        CatHouse.add(testCat3);
        //CatHouse.add(testCat4);
        //CatHouse.add(testCat5);
        Assert.assertEquals(Integer.valueOf(originalNum + 1), CatHouse.getNumberOfCats());

    }

}
