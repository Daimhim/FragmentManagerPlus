package org.daimhim.fragmentmanagerplus

import android.content.Intent

open class BaseStack {
    val FLAG_FRAGMENT_NEW_TASK = Intent.FLAG_ACTIVITY_NEW_TASK

    /**
     *  如果设置，当这个fragment位于历史stack的顶端运行时，不再启动一个新的。
     */
    val FLAG_FRAGMENT_SINGLE_TOP = Intent.FLAG_ACTIVITY_SINGLE_TOP

    /**
     * 清理这个之上所有fragment
     */
    val FLAG_FRAGMENT_CLEAR_TOP = Intent.FLAG_ACTIVITY_CLEAR_TOP

    /**
     * 清空所有
     */
    val FLAG_FRAGMENT_CLEAR_TASK = Intent.FLAG_ACTIVITY_CLEAR_TASK
}