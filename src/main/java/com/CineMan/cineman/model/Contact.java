package com.CineMan.cineman.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "contact")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Contact {
     @Id
    private String id;
    private String name;
    private String profession;
    private String phone;
    private String email;
}
