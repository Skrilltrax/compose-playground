import androidx.compose.web.css.Style
import androidx.compose.web.renderComposable
import navigation.Destination
import navigation.rememberNavigator
import sidebar.NavList
import sidebar.NavListWidget

fun main() {
  widgetMain()
}

fun widgetMain() {
  renderComposable(rootElementId = "root") {
    val navigator = rememberNavigator(Destination.AboutDestination)

    Style(AppStyleSheet)
    NavListWidget(Destination.values().toList(), navigator.currentDestination.value)
  }
}

fun coreMain() {
  renderComposable(rootElementId = "root") {
    Style(AppStyleSheet)
    NavList()
  }
}