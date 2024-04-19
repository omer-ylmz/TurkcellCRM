package com.turkcell.CustomerService.dataAccess.abstracts;

import com.turkcell.CustomerService.entities.concretes.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
