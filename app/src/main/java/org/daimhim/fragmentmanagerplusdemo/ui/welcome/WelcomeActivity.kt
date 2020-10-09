package org.daimhim.fragmentmanagerplusdemo.ui.welcome

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.daimhim.fragmentmanagerplusdemo.R
import org.daimhim.fragmentmanagerplusdemo.ui.salesclerk.SalesClerkActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        Thread(Runnable {
            Thread.sleep(1000)
            startActivity(Intent(this, SalesClerkActivity::class.java))
            finish()
        }).start()
    }
}