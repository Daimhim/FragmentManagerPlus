package org.daimhim.fragmentmanagerplusdemo.ui.home.homemenu

import org.daimhim.fragmentmanagerplusdemo.R
import org.daimhim.rvadapter.SimpleViewHolder
import org.daimhim.rvadapterex.SimpleRvAdapter

class HomeMenuAdapter : SimpleRvAdapter<String>() {
    override fun onBindDataViewHolder(holder: SimpleViewHolder?, position: Int) {
        holder?.setText(R.id.tv_content,getItem(position))
        holder?.performItemClick(holder.getView(R.id.tv_content),this)
    }

    override fun onCreateDataViewHolder(viewType: Int): Int {
         return R.layout.adapter_home_menu
    }
}