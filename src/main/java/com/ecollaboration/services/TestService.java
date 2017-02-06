package com.ecollaboration.services;

import com.ecollaboration.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dailybird on 17/2/6.
 *
 */
@Service
public class TestService {
    @Resource
    private SessionFactory sessionFactory;

    public void getTest(){
        Session session = this.sessionFactory.getCurrentSession();
        UserEntity userEntity = (UserEntity) session.get(UserEntity.class, 3);
        System.out.println(userEntity);
    }
}
