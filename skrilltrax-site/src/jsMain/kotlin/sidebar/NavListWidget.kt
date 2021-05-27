package sidebar

import androidx.compose.runtime.Composable
import androidx.compose.web.css.*
import androidx.compose.web.elements.Div
import navigation.Destination
import org.jetbrains.compose.common.foundation.layout.Column
import org.jetbrains.compose.common.foundation.layout.Row
import org.jetbrains.compose.common.material.Text
import org.jetbrains.compose.common.ui.Modifier

@Composable
fun NavListWidget(destinations: List<Destination>, selectedDestination: Destination) {
  /*for (destination in destinations) {
    Row {
      Text(destination.name)
    }
  }*/

  CustomColumn {
    Text("AAAAA")
    Text("BBBBBBBBBB")
  }
}

@Composable
fun CustomColumn(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
  Div(
    style = {
      display(DisplayStyle.Flex)
      flexDirection(FlexDirection.Column)
    }
  ) {
    content()
  }
}