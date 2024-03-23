package com.test.dao.repositories;

import com.test.dao.entities.Circle;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CircleRepositoryImpl implements CircleRepository{
    @Override
    @Transactional
    public Circle update(Circle circle) {
        return getEntityManager().merge(circle);
    }
}
