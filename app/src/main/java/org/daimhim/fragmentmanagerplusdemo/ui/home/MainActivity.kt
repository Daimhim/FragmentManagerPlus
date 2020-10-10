package org.daimhim.fragmentmanagerplusdemo.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*
import org.daimhim.fragmentmanagerplusdemo.R
import org.daimhim.fragmentmanagerplusdemo.ui.home.homemenu.HomeMenuAdapter
import rv.daimhim.rvdecoration.DecorationBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var mHomeMenuAdapter : HomeMenuAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initListener()
    }

    private fun initListener() {
        mHomeMenuAdapter.setOnItemClickListener { view, position ->
            val create : NavHostFragment
            when(mHomeMenuAdapter.getItem(position)){
                "快餐"->{
                    create = NavHostFragment.create(R.navigation.place_order_navigation)
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_content, create)
                        .setPrimaryNavigationFragment(create) // this is the equivalent to app:defaultNavHost="true"
                        .commit()
                }
                "正餐"->{
                    create = NavHostFragment.create(R.navigation.table_order_navigation)
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_content, create)
                        .setPrimaryNavigationFragment(create) // this is the equivalent to app:defaultNavHost="true"
                        .commit()
                }
                "历史"->{
                    create = NavHostFragment.create(R.navigation.order_history_navigation)
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_content, create)
                        .setPrimaryNavigationFragment(create) // this is the equivalent to app:defaultNavHost="true"
                        .commit()
                }
                "报表"->{

                }
                "打印"->{

                }
                "菜品"->{

                }
                "后台"->{

                }
                "设置"->{

                }
                else->{}
            }
            dl_slide_layout.closeDrawer(fl_menu)
        }
    }

    private fun initView() {
        mHomeMenuAdapter = HomeMenuAdapter()
        val mutableListOf = mutableListOf<String>()
        mutableListOf.add("快餐")
        mutableListOf.add("正餐")
        mutableListOf.add("历史")
        mutableListOf.add("报表")
        mutableListOf.add("打印")
        mutableListOf.add("菜品")
        mutableListOf.add("后台")
        mutableListOf.add("设置")
        mHomeMenuAdapter.onRefresh(mutableListOf)
        rv_menu.adapter = mHomeMenuAdapter
        DecorationBuilder
            .Builder(rv_menu)
            .spacing(R.dimen.dimen_size_1)
            .divider(R.color.colorPrimary)
            .create(101)
    }

}