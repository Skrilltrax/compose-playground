package sidebar

import androidx.compose.web.css.*

object NavStyleSheet : StyleSheet() {
  val container by style { /* define a class `container` */
    display(DisplayStyle.Block)
    marginTop(3.em)
    width(100.px)
    justifyContent(JustifyContent.Center)
    alignItems(AlignItems.Center)
    backgroundColor("#fff")
    fontSize(16.px)
  }

  val navList by style {
    property("text-align", StylePropertyValue("right"))
    property("list-style", StylePropertyValue("none"))
  }

  val anchor by style {
    property("text-decoration", StylePropertyValue("none"))
    color("#9b9b9b")
    fontSize(1.em)
  }

  val selected by style {
    color("#111")
  }
}