package main.ui

import com.vaadin.flow.component.HasElement
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouterLayout
import com.vaadin.flow.spring.annotation.SpringComponent
import cafe.service.OrderService
import cafe.ui.fragment.CafeMenuItemFragment
import cafe.ui.view.CafeOrderView
import com.vaadin.flow.component.applayout.AppLayoutMenu
import org.springframework.beans.factory.annotation.Autowired
import javax.annotation.PostConstruct

@Route
@SpringComponent
class MainView : AppLayout(), RouterLayout {

    @Autowired
    lateinit var orderView:CafeOrderView

    init {
        val menu = this.createMenu()
        this.setMenu(menu)
    }

    @PostConstruct
    fun init() {
        val m = menu as AppLayoutMenu
        orderView.apply {
            m.addMenuItem(VaadinIcon.COFFEE.create(),"Cafe"){
                setContent(this)
            }
        }
    }

    override fun showRouterLayoutContent(content: HasElement?) {
        super.showRouterLayoutContent(content)
    }

}
