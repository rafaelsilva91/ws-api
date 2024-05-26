package com.client.ws.wsapi.repository;

import com.client.ws.wsapi.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}
