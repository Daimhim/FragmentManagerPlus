package org.daimhim.fragmentplus

import android.content.Intent
import android.os.Bundle
import android.util.SparseArray
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import org.daimhim.fragmentmanagerplus.FragmentItem
import java.lang.ref.SoftReference
import java.util.*

open class ActivityPlus : AppCompatActivity() {
    private var fragmentStackManager = SparseArray<Stack<Stack<FragmentItem>>>()

    protected fun startFragment(@IdRes id:Int, intent: Intent){
        startFragment(id, intent,null)
    }
    protected fun startFragment(@IdRes id:Int, intent: Intent,bundle: Bundle?){
        if (!fragmentStackManager.contains(id)){
            fragmentStackManager.put(id,Stack<Stack<FragmentItem>>())
        }
        if (fragmentStackManager[id].empty()){
            fragmentStackManager[id].push(Stack<FragmentItem>())
        }
//        if (intent.flags == )
//        if (!fragmentStackManager[id].peek().empty()){
//            val search = fragmentStackManager[id].peek().search(intent)
//
//        }
        val fragmentItem = FragmentItem()
        fragmentItem.withIntent = intent
        fragmentStackManager[id].peek().push(fragmentItem)
        getSystemManager()
            .beginTransaction()
            .setPrimaryNavigationFragment(fragmentItem.fragmentItem.get())
            .commit()
//        fragmentItem.fragmentItem = SoftReference()

    }

    fun getSystemManager(): FragmentManager {
        return supportFragmentManager
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }


    fun proxyBackPressed(){
        super.onBackPressed()
    }
}