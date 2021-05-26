import androidx.compose.web.css.Style
import androidx.compose.web.renderComposable
import sidebar.NavList

fun main() {
  renderComposable(rootElementId = "root") {
    Style(AppStyleSheet)
    NavList()
  }
}