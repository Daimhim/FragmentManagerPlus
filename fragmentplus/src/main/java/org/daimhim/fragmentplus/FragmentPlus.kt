package org.daimhim.fragmentplus

import android.content.Context
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.fragment.app.Fragment

open class FragmentPlus : Fragment() {
    protected lateinit var onBackPressed :OnBackPressedCallback
    override fun onAttach(context: Context) {
        super.onAttach(context)
        onBackPressed = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                isEnabled = onBackPressed()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, onBackPressed)
    }

    fun onFragmentResult(requestCode: Int, resultCode: Int, data: Bundle?) {

    }

    fun onBackPressed():Boolean{
        return false
    }

}