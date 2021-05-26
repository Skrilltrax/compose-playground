import androidx.compose.web.css.StyleSheet
import androidx.compose.web.css.value

object AppStyleSheet : StyleSheet() {
  init {
    "body" style {
      property(
        "font-family",
        value("-apple-system,BlinkMacSystemFont,segoe ui,Roboto,Oxygen-Sans,Ubuntu,Cantarell,helvetica neue,sans-serif")
      )
    }
  }
}