package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
