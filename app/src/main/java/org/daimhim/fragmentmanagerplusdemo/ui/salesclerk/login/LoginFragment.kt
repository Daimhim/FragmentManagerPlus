package org.daimhim.fragmentmanagerplusdemo.ui.salesclerk.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*
import org.daimhim.fragmentmanagerplusdemo.R
import org.daimhim.fragmentmanagerplusdemo.ui.home.MainActivity
import org.daimhim.fragmentmanagerplusdemo.ui.salesclerk.SalesClerkActivity

class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_login.setOnClickListener {
            SalesClerkActivity.goMain(requireActivity())
        }
        tv_registered.setOnClickListener {
            findNavController().navigate(R.id.login_to_registered_action)
        }
    }
}