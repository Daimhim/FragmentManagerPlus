package org.daimhim.fragmentmanagerplusdemo.ui.home.orderhistory

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import org.daimhim.fragmentmanagerplusdemo.R

class OrderHistoryAdapter2 : BaseQuickAdapter<String, BaseViewHolder>(R.layout.adapter_order_history) {
    override fun convert(holder: BaseViewHolder, item: String) {
        holder.setText(R.id.tv_content,item)
    }
}