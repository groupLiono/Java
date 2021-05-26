package com.example.second.service.impl;

import com.example.second.dao.CqnuDao;
import com.example.second.entity.Cqnu;
import com.example.second.service.CqnuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class CqnuServiceBean implements CqnuService {

    @Autowired
    private CqnuDao cqnuDao;

    //@Autowired
    //private CqnuCountDao cqnuCountDao;

    //@Autowired
    //CqnuCopyDao cqnuCopyDao;

    public List<Cqnu> findAllCqnus() {
        return this.cqnuDao.findAllCqnus();
    }


    @Transactional
    public void addCqnu(Cqnu cqnu) {
        this.cqnuDao.addCqnu(cqnu);
//        this.cqnuCopyDao.addCqnu(cqnu);
     //   Integer count = this.cqnuDao.getCountCqnus();
   //     this.cqnuCountDao.addCount(count);
    }

    public void deleteCqnuById(Long uid) {
        this.cqnuDao.deleteCqnuById(uid);
        Integer count = this.cqnuDao.getCountCqnus();
        //this.cqnuCountDao.addCount(count);
    }

    public void updateCqnu(Cqnu cqnu) {
        this.cqnuDao.updateCqnu(cqnu);
    }

    public List<Cqnu> findCqnuByName(String name) {
        return this.cqnuDao.findCqnuByName(name);
    }

    public Integer deleteCqnusByIds(Integer[] ids) {
        return this.cqnuDao.deleteCqnusByIds(ids);
    }

}
