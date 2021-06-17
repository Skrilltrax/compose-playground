import org.jetbrains.compose.web.css.StyleSheet

object AppStyleSheet : StyleSheet() {
  init {
    "body" style {
      property(
        "font-family",
        "-apple-system,BlinkMacSystemFont,segoe ui,Roboto,Oxygen-Sans,Ubuntu,Cantarell,helvetica neue,sans-serif"
      )
    }
  }
}