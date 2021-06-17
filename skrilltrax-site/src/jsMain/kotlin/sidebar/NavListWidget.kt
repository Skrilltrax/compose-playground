package sidebar

import androidx.compose.runtime.Composable
import navigation.Destination
import org.jetbrains.compose.common.foundation.layout.Column
import org.jetbrains.compose.common.material.Text
import org.jetbrains.compose.common.ui.Modifier
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.dom.Div

@Composable
fun NavListWidget(destinations: List<Destination>, selectedDestination: Destination) {
  Column {
    Text("Hello")
    Text("Compose")
  }
}

@Composable
fun CustomColumn(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
  Div({
    style {
      display(DisplayStyle.Flex)
      flexDirection(FlexDirection.Column)
    }
  }) {
    content()
  }
}