package sidebar

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.HTMLUListElement

@Composable
fun NavList() {
  Style(NavStyleSheet)

  Div(attrs = { classes(NavStyleSheet.container) }) {
    Ul(attrs = { classes(NavStyleSheet.navList) }) {
      NavListItem("about", "/", true)
      NavListItem("blog", "/blog", false)
    }
  }
}

@Composable
fun DOMScope<HTMLUListElement>.NavListItem(text: String, relativePath: String, isSelected: Boolean) {
  Li({
    style {
      property("margin-bottom", 1.75.em)
      property("line-height", 1.5.em)
    }
  }) {
    A(attrs = {
      href(relativePath)
      classes(NavStyleSheet.anchor)
      if (isSelected) classes(NavStyleSheet.selected)
    }) {
      Text(text)
    }
  }
}
