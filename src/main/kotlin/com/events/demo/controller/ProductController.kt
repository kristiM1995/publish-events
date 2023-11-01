package com.events.demo.controller

import com.events.demo.model.Product
import com.events.demo.service.ProductEventPublisher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController {

    @Autowired
    private lateinit var productEventPublisher: ProductEventPublisher

    @GetMapping("/")
    fun productEvent(@RequestBody product: Product){
        productEventPublisher.publishProductEvent(product)
    }

}