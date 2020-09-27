package org.daimhim.fragmentmanagerplus

import java.util.*

class FragmentStack : Stack<FragmentItem>() {
    override fun search(o: Any?): Int {
        if (o == null){
            return -1
        }
        if (o !is FragmentItem){
            return -1
        }
        o.withIntent?.component?.toShortString()
        return super.search(o)
    }
}