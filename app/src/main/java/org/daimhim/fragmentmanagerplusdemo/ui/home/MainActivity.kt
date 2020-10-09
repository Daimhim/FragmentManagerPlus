package org.daimhim.fragmentmanagerplusdemo.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import org.daimhim.fragmentmanagerplusdemo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.findFragmentById(R.id.fl_content) as NavHostFragment
        findNavController(R.id.fl_content)
            .navigate(R.id.action_home_menu_to_place_order)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        return Navigation.findNavController(this)super.onSupportNavigateUp()
//    }
}