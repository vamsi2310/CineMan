package com.CineMan.cineman.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "location")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Location {
@Id
private String id;
private String name;
private String address;
private String[] coordinates;
private String logisticsCategory;

    
}
