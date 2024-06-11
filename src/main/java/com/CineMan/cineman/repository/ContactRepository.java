package com.CineMan.cineman.repository;

// import org.springframework.stereotyp/e.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.CineMan.cineman.model.Contact;


@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
    Contact findByName(String name);
}
