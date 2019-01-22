package cafe.ui.view

import cafe.domain.CafeMenuItem
import cafe.service.OrderService
import cafe.ui.fragment.CafeMenuItemFragment
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.spring.annotation.SpringComponent
import com.vaadin.flow.spring.annotation.UIScope
import com.vaadin.flow.spring.annotation.VaadinSessionScope
import javax.annotation.PostConstruct

@SpringComponent
@UIScope
class CafeOrderView(val orderService: OrderService) : VerticalLayout() {

    private lateinit var items:Collection<CafeMenuItem>

    init {
        this.add(Label("Cafe Order View")).run {
            println("After Init ")
        }

      //  this.items.forEach { add(CafeMenuItemFragment(it)) }
    }

    @PostConstruct
    fun init() {
        items = orderService.createRandomMenu()
        items.forEach { add(CafeMenuItemFragment(it)) }
    }


}