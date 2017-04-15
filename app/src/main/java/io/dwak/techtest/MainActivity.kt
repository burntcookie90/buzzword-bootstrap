package io.dwak.techtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout
import butterknife.BindView
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router

class MainActivity : AppCompatActivity() {
  private lateinit var router: Router
  @BindView(R.id.container) lateinit var container: FrameLayout

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    router = Conductor.attachRouter(this, container, savedInstanceState).also {
      if(!it.hasRootController()) {
        it.setRoot(MainControllerBuilder().asTransaction())
      }
    }
  }

  override fun onBackPressed() {
    if(!router.handleBack()) {
      super.onBackPressed()
    }
  }
}
