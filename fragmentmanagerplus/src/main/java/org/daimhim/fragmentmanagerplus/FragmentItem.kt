package org.daimhim.fragmentmanagerplus

import android.content.Intent
import androidx.fragment.app.Fragment
import java.lang.ref.SoftReference

class FragmentItem {
    lateinit var fragmentItem:SoftReference<Fragment>
    var withIntent: Intent? = null
    var backIntent: Intent? = null

}