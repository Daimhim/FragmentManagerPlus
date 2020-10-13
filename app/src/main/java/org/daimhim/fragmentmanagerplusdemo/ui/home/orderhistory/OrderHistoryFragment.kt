package org.daimhim.fragmentmanagerplusdemo.ui.home.orderhistory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_order_history.*
import org.daimhim.fragmentmanagerplusdemo.R
import timber.log.Timber

class OrderHistoryFragment : Fragment(R.layout.fragment_order_history) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.i("onViewCreated")
        tv_go_details.setOnClickListener {
            findNavController().navigate(R.id.order_history_to_order_details)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.i("onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume")
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy")
    }
}