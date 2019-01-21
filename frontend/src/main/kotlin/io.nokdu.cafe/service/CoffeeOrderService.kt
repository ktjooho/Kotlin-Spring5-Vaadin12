package io.nokdu.cafe.service

import org.springframework.stereotype.Service

@Service
class CoffeeOrderService {

    fun orderCoffee(coffeeName:String):String = "Order ${coffeeName}"

}