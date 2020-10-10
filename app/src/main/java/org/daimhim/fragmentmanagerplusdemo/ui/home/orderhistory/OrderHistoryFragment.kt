package org.daimhim.fragmentmanagerplusdemo.ui.home.orderhistory

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_order_history.*
import org.daimhim.fragmentmanagerplusdemo.R

class OrderHistoryFragment : Fragment(R.layout.fragment_order_history) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_go_details.setOnClickListener {
            findNavController().navigate(R.id.order_history_to_order_details)
        }
    }
}