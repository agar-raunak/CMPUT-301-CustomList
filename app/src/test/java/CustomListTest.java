import static org.junit.Assert.assertEquals;
import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
    public void setup(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        City c = new City("Edmonton", "Alberta");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size+1,list.getCount());

    }

    @Test
    public void hasCityTest(){
        City c = new City("Edmonton", "Alberta");
        list.addCity(c);
        boolean b = list.hasCity(c);
        assertEquals(true,b);

    }

    @Test
    public void deleteCityTest(){
        City c = new City("Edmonton", "Alberta");
        list.addCity(c);
        int size = list.getCount();
        list.deletecity(c);
        assertEquals(size-1,list.getCount());
    }

    @Test
    public void countCitiesTest(){
        int size = list.getCount();
        City c = new City("Calgary", "Alberta");
        list.addCity(c);
        assertEquals(size+1, list.getCount());

    }

}
