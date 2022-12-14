package com.javaoffers.infrastructure.offer.client;

import com.javaoffers.infrastructure.offer.dto.HttpOfferDto;
import org.mockito.ArgumentMatchers;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface SampleExchangeResponse {
    default ResponseEntity<List<HttpOfferDto>> getExchange(RestTemplate restTemplate) {
        return restTemplate.exchange(
                ArgumentMatchers.anyString(),
                ArgumentMatchers.any(HttpMethod.class),
                ArgumentMatchers.any(),
                ArgumentMatchers.<ParameterizedTypeReference<List<HttpOfferDto>>>any()
        );
    }
}
