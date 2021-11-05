package com.xzj.service.imple;

import com.xzj.dao.CityDao;
import com.xzj.domain.City;
import com.xzj.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
      @Resource
      private CityDao cityDao;

      @Override
    public List<City> selectCity(int provinceid) {


             List<City> list=cityDao.selectCity(provinceid);

          return list;
    }
}
