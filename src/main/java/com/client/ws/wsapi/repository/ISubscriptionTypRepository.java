package com.client.ws.wsapi.repository;

import com.client.ws.wsapi.model.SubscriptionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubscriptionTypRepository extends JpaRepository<SubscriptionType, Long> {
}
