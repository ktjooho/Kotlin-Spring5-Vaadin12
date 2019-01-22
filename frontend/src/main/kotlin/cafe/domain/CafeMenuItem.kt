package cafe.domain

import java.net.URI

data class CafeMenuItem(val name:String, val quantity:Int, val imgUrl:URI, val price:Int) {
    internal  val isRecommended : Boolean = true

}
