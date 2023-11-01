package com.events.demo.service

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class ProductEventListener {

    @EventListener
    fun productEventListener(event: ProductEvent){
        println("Id = " + event.id + "name = " +event.name )
    }
}