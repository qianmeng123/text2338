package com.xzj.controller;

import com.xzj.domain.City;
import com.xzj.domain.Province;
import com.xzj.service.CityService;
import com.xzj.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MyController {
       @Resource
    private ProvinceService  provinceService;

       @Resource
       private CityService cityService;

     @RequestMapping(value = "/querySheng")
     @ResponseBody
      public List<Province> queryProvince(){
         List<Province> list=provinceService.selectProvinceList();
           return list;
     }

     @RequestMapping(value = "/queryCity")
     @ResponseBody
      public List<City>  queryCity(int name){
           List<City> list=cityService.selectCity(name);
           return list;
     }

     @RequestMapping(value = "/show")
    public ModelAndView dengLu(){
                 ModelAndView mv=new ModelAndView();
                mv.addObject("name","登录成功");
                 mv.setViewName("/show.jsp");
                 return mv;
    }




}
