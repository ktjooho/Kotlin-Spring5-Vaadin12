package cafe.ui.view

import cafe.domain.CafeMenuItem
import cafe.service.OrderService
import cafe.ui.fragment.CafeMenuItemFragment
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.spring.annotation.SpringComponent
import com.vaadin.flow.spring.annotation.VaadinSessionScope

@SpringComponent
@VaadinSessionScope
class CafeOrderView(orderService: OrderService) : VerticalLayout() {
    //Order
    //TakeOut
    private final val items = orderService.createRandomMenu()

    init {
        this.add(Label("Cafe Order View")).run {

        }
        this.items.forEach { add(CafeMenuItemFragment(it)) }
    }


}