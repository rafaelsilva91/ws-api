package com.client.ws.wsapi.repository;

import com.client.ws.wsapi.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserTypeRepository extends JpaRepository<UserType, Long> {
}
