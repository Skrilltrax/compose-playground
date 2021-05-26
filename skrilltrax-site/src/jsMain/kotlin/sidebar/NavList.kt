package sidebar

import androidx.compose.runtime.Composable
import androidx.compose.web.attributes.href
import androidx.compose.web.css.*
import androidx.compose.web.elements.*
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
  Li(style = {
    property("margin-bottom", value(1.75.em))
    property("line-height", value(1.5.em))
  }) {
    A(attrs = {
      href(relativePath)
      classes {
        +NavStyleSheet.anchor
        if (isSelected) +NavStyleSheet.selected
      }
    }) {
      Text(text)
    }
  }
}
