package org.daimhim.fragmentmanagerplus

import android.content.Intent
import java.util.*

class FragmentStack : Stack<FragmentItem>() {
    override fun search(o: Any?): Int {
        if (o == null){
            return -1
        }
        if (o !is Intent){
            return -1
        }
        var index = size
        findLast {
            index--
            return@findLast o.component?.equals(it) == true
        }
        return index
    }
}