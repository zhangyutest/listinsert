package com.winterchen.controller;

import com.winterchen.model.Pm;
import com.winterchen.service.PmserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v2")
public class PmController {


    @Autowired
    private PmserviceImpl pmservice;


    @RequestMapping(value = "/addUserpm",method = RequestMethod.POST, produces="application/json")

    public int addPmlist(@RequestBody List<Pm> p){

        int result =pmservice.addlistpm(p);

        return  result;

    }


}
