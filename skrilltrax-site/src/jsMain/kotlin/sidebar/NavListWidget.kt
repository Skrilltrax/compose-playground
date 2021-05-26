package sidebar

import androidx.compose.runtime.Composable
import navigation.Destination
import org.jetbrains.compose.common.foundation.layout.Row
import org.jetbrains.compose.common.material.Text

@Composable
fun NavListWidget(destinations: List<Destination>, selectedDestination: Destination) {
  for (destination in destinations) {
    Row {
      Text(destination.name)
    }
  }
}