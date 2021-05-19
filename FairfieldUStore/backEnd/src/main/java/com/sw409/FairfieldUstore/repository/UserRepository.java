package com.sw409.FairfieldUstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sw409.FairfieldUstore.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	}


