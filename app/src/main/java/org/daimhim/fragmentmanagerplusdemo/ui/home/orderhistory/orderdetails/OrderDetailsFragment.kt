package org.daimhim.fragmentmanagerplusdemo.ui.home.orderhistory.orderdetails

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_order_details.*
import org.daimhim.fragmentmanagerplusdemo.R

class OrderDetailsFragment : Fragment(R.layout.fragment_order_details) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}