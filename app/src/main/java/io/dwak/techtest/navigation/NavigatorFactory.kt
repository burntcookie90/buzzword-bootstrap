package io.dwak.techtest.navigation

import com.bluelinelabs.conductor.Router
import io.dwak.freight.navigator.main.Freight_MainNavigator
import io.dwak.freight.navigator.main.MainNavigator
import javax.inject.Inject

class NavigatorFactory @Inject constructor(router: Router) {
  val mainNavigator: MainNavigator = Freight_MainNavigator(router)
}