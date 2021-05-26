package navigation

import androidx.compose.runtime.*

class Navigator(startDestination: Destination) {

  var currentDestination: MutableState<Destination> = mutableStateOf(startDestination)

  fun navigate(destination: Destination) {
    currentDestination.value = destination
  }
}

@Composable
fun rememberNavigator(startDestination: Destination): Navigator {
  return remember { Navigator(startDestination) }
}
