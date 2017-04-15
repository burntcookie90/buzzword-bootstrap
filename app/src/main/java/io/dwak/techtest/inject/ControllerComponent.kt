package io.dwak.techtest.inject

import dagger.Component
import io.dwak.techtest.MainController
import io.dwak.techtest.navigation.NavigatorModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(NavigatorModule::class))
interface ControllerComponent {
  fun inject(into: MainController)
}