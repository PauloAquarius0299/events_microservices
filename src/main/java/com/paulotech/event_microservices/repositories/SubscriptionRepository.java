package com.paulotech.event_microservices.repositories;

import com.paulotech.event_microservices.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}