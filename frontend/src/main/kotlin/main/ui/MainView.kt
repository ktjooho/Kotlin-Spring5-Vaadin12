package main.ui

import cafe.ui.view.CafeOrderView
import com.vaadin.flow.component.HasElement
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouterLayout
import com.vaadin.flow.spring.annotation.SpringComponent
import com.vaadin.flow.spring.annotation.UIScope
import org.springframework.beans.factory.annotation.Autowired
import javax.annotation.PostConstruct

@Route
@SpringComponent
@UIScope
class MainView : AppLayout(), RouterLayout {

    @Autowired
    lateinit var orderView:CafeOrderView

    init {

    }

    @PostConstruct
    fun init() {
        val menu = this.createMenu()
        print("Hello")
        val x = 20
        menu.addMenuItem(VaadinIcon.COFFEE.create(), "Cafe Service") {
            setContent(orderView)
        }
        //val m = menu as AppLayoutMenu
        /*
        orderView.apply {
            m.addMenuItem(VaadinIcon.COFFEE.create(),"Cafe"){
                setContent(this)
            }
        }
        */
    }

    override fun showRouterLayoutContent(content: HasElement?) {
        super.showRouterLayoutContent(content)
    }

}
