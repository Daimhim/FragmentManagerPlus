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
        var index = -1
        val item : FragmentItem? = filterIndexed { indexIt, fragmentItem ->
            if(o.withIntent?.component?.equals(fragmentItem) == true){
                index = indexIt
                return@filterIndexed true
            }
            return@filterIndexed false
        }.last()
        return index
    }
}