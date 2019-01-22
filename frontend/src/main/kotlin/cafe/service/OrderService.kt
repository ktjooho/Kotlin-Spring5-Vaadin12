package cafe.service

import cafe.domain.CafeMenuItem
import org.springframework.stereotype.Service
import java.net.URI
import java.util.stream.IntStream

@Service
class OrderService {

    fun orderCoffee(coffeeName:String):String = "Order ${coffeeName}"
    fun createRandomMenu():Collection<CafeMenuItem> {
        val size = setOf(10,15,20,25,32)
        val names = setOf("Dolche Latte", "Cold Brew", "Avocado Blended")
        val quantities = setOf(100,200,300,400,500)
        val prices = setOf(4_000, 2_000, 3_200, 10_000)

        return generateSequence { size.random() }.map {
            CafeMenuItem(names.random(), quantities.random(), URI.create("Not Yet"), prices.random())
        }.toHashSet()
    }

}