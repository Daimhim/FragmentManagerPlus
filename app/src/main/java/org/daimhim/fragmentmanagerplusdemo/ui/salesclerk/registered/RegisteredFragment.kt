package org.daimhim.fragmentmanagerplusdemo.ui.salesclerk.registered

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_registered.*
import org.daimhim.fragmentmanagerplusdemo.R
import org.daimhim.fragmentmanagerplusdemo.ui.salesclerk.SalesClerkActivity

class RegisteredFragment : Fragment(R.layout.fragment_registered) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }
        tv_login.setOnClickListener {
            SalesClerkActivity.goMain(requireActivity())
        }
    }
}