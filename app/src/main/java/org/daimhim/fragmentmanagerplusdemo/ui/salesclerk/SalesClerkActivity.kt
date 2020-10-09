package org.daimhim.fragmentmanagerplusdemo.ui.salesclerk

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.daimhim.fragmentmanagerplusdemo.R
import org.daimhim.fragmentmanagerplusdemo.ui.home.MainActivity

class SalesClerkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales_clerk)
    }
    companion object{
        fun goMain(activity: Activity){
            activity.startActivity(Intent(activity, MainActivity::class.java))
            activity.finish()
        }
    }
}