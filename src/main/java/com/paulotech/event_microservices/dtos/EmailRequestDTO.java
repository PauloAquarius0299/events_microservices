package com.paulotech.event_microservices.dtos;

public record EmailRequestDTO(String to, String subject, String body) {
}
