package com.winterchen.mapper;


import com.winterchen.model.Pm;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Pmmapper {



    public  int addlistpm(List<Pm> pm);
}
