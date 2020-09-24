package org.daimhim.fragmentmanagerplus

import android.os.Bundle
import androidx.fragment.app.Fragment
import java.lang.ref.SoftReference

class FragmentItem {
    lateinit var fragmentClass:Class<in Fragment>
    lateinit var fragmentItem:SoftReference<Fragment>
    var cacheBundle: Bundle? = null
    lateinit var fragmentId: String
}