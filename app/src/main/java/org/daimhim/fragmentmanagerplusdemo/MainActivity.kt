package org.daimhim.fragmentmanagerplusdemo

import android.os.Bundle
import org.daimhim.fragmentplus.ActivityPlus

class MainActivity : ActivityPlus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}