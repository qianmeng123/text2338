package com.xzj.service;

import com.xzj.domain.City;

import java.util.List;

public interface CityService {
    List<City> selectCity(int provinceid);
}
