package cafe.ui.fragment

import cafe.domain.CafeMenuItem
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.button.ButtonVariant
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import kotlin.random.Random
import kotlin.random.nextInt


class CafeMenuItemFragment(item:CafeMenuItem) : VerticalLayout() {

    val addButton = Button()
    val itemDesclabel = Label()
    val image = VaadinIcon.values()[Random.nextInt(IntRange(0, VaadinIcon.values().size -1))]


    init {
        itemDesclabel.text = item.name
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY)
        addButton.addThemeVariants(ButtonVariant.LUMO_SMALL)
        addButton.text = "Order"
        add(itemDesclabel)
        add(addButton)
    }
}