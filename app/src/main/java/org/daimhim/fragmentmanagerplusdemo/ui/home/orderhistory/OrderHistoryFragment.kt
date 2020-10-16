package org.daimhim.fragmentmanagerplusdemo.ui.home.orderhistory

import android.content.Context
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
        Timber.i("onViewCreated" + view?.hashCode())
//        tv_go_details.setOnClickListener {
//            findNavController().navigate(R.id.order_history_to_order_details)
//        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate" + view?.hashCode())
    }
    var onCreateView:View? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.i("onCreateView" + view?.hashCode())
        if (onCreateView == null) {
            onCreateView = super.onCreateView(inflater, container, savedInstanceState)
        }
        return onCreateView
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause" + view?.hashCode())
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume" + view?.hashCode())
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart" + view?.hashCode())
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop" + view?.hashCode())
    }
    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy" + view?.hashCode())
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Timber.i("onActivityCreated" + view?.hashCode())
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.i("onAttach" + view?.hashCode())
    }

    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
        Timber.i("onAttachFragment" + view?.hashCode())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.i("onDestroyView" + view?.hashCode())
    }

    override fun onDetach() {
        super.onDetach()
        Timber.i("onDetach" + view?.hashCode())
    }
}