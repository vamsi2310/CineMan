package com.CineMan.cineman.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "user")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String email;
    private String password;
}
