package cafe.ui.view

import cafe.domain.CafeMenuItem
import cafe.service.OrderService
import cafe.ui.fragment.CafeMenuItemFragment
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.grid.Grid
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.spring.annotation.SpringComponent
import com.vaadin.flow.spring.annotation.UIScope
import javax.annotation.PostConstruct

@SpringComponent
@UIScope
class CafeOrderView(val orderService: OrderService) : VerticalLayout() {

    private lateinit var items:Collection<CafeMenuItem>
    private val itemGrid = Grid<CafeMenuItem>()
    private val orderButton = Button()
    private val cancelButton = Button()


    init {
        this.add(itemGrid)
        this.add(Label("Cafe Order View")).run {
            println("After Init ")
        }
    }

    @PostConstruct
    fun init() {
        items = orderService.createRandomMenu()
        items.forEach { add(CafeMenuItemFragment(it)) }
        val menu = itemGrid.addContextMenu()
        menu.addItem("Hello") {
            print("Touch Hello")
        }
        //apply, let, run, also
        //Explicit Parameter : you can't change state. Add some logical checking or validating.
        //Implicit (Receiver) : You're allowed to change state.
        itemGrid.run {
            addColumn(CafeMenuItem::name).setHeader("Name")
            addColumn(CafeMenuItem::price).setHeader("Price")
            setItems(items)
            addContextMenu()
        }.apply {
            addItem("MenuItem") {
                println("Tester")
            }
        }



    }


}