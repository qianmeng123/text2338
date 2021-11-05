package com.xzj.service.imple;

import com.xzj.dao.ProvinceDao;
import com.xzj.domain.Province;
import com.xzj.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

      @Resource
     private  ProvinceDao provinceDao;

       @Override
    public List<Province> selectProvinceList() {
         List<Province> list=provinceDao.selectProvinceList();
          return list;
    }
}
