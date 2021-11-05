package com.xzj.dao;

import com.xzj.domain.City;

import java.util.List;

public interface CityDao {
    List<City> selectCity(int num);
}
