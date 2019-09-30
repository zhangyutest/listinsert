package com.winterchen.service;

import com.winterchen.mapper.Pmmapper;
import com.winterchen.model.Pm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmserviceImpl implements Pmservice{


    @Autowired
    private Pmmapper pmmapper;


    public  int addlistpm(List<Pm> pm){
        return pmmapper.addlistpm(pm);

    }
}
