package mod.repositories;

import mod.models.City;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CityRepository {
    private List<City> cityList = Arrays.asList(new City("Odessa"), new City("Kiev"));

    public List<City> getAllCities() {
        return cityList;
    }

    public City getCityByID(Integer id) {
        return (City) cityList.get(id);
    }

}
