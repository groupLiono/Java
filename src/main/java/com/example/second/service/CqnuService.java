package com.example.second.service;

import com.example.second.entity.Cqnu;

import java.util.List;


public interface CqnuService {

    public List<Cqnu> findAllCqnus();

    public void addCqnu(Cqnu cqnu);

    public void deleteCqnuById(Long uid);

    public void updateCqnu(Cqnu cqnu);

    List<Cqnu> findCqnuByName(String name);

    public Integer deleteCqnusByIds(Integer[] ids);
}
