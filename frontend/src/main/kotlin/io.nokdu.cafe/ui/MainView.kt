package io.nokdu.cafe.ui

import com.vaadin.flow.component.HasElement
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouterLayout
import com.vaadin.flow.spring.annotation.SpringComponent
import io.nokdu.cafe.service.CoffeeOrderService

@Route
@SpringComponent
class MainView(coffeeOrderService: CoffeeOrderService) : AppLayout(), RouterLayout {


    init {
        val menu = this.createMenu()
        menu.addMenuItem(VaadinIcon.COFFEE.create(),coffeeOrderService.orderCoffee("Starbucks"))
        this.setMenu(menu)
    }

    override fun showRouterLayoutContent(content: HasElement?) {
        super.showRouterLayoutContent(content)
    }

}
