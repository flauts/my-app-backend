package com.flauta.myapp.coordinate;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionIdJavaType;
import org.hibernate.annotations.CompositeType;
import org.hibernate.annotations.MapKeyCompositeType;

@Embeddable
public class Coordinate {
    private Double latitude;
    private Double longitude;
}
