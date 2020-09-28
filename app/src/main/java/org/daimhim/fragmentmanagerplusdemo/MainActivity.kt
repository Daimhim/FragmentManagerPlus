package org.daimhim.fragmentmanagerplusdemo

import android.content.Intent
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import org.daimhim.fragmentplus.ActivityPlus

class MainActivity : ActivityPlus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent()
        intent.setClass(this,HeadFragment::class.java)
        startFragment(R.id.fl_head_content,intent)
    }


}