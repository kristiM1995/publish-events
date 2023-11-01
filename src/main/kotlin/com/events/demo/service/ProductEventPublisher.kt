package com.events.demo.service

import com.events.demo.model.Product
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.ApplicationEventPublisherAware
import org.springframework.stereotype.Component

@Component
class ProductEventPublisher: ApplicationEventPublisherAware {

    private lateinit var eventPublisher: ApplicationEventPublisher

    fun publishProductEvent( product: Product){
        val event = ProductEvent(product.id, product.name)
        eventPublisher.publishEvent(event)
    }

    override fun setApplicationEventPublisher(applicationEventPublisher: ApplicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher
    }

}