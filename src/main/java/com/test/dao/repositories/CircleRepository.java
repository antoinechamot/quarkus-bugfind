package com.test.dao.repositories;

import com.test.dao.entities.Circle;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public interface CircleRepository  extends PanacheRepositoryBase<Circle, UUID> {

    Circle update(Circle pipeline);
}
