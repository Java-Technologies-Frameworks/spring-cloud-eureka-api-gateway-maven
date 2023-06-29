package com.jtf.cloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderFallBack")
    public Mono<String> orderServiceFallBack() {
        return Mono.just("Order service is taking too long time to respond or is down , PLease try again later");
    }

    @RequestMapping("/paymentFallBack")
    public Mono<String> paymentServiceFallBack() {
        return Mono.just("Payment service is taking too long time to respond or is down , PLease try again later");
    }

}
