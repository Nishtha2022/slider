package com.example.cheqclone

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class mPagerAdaptor(val mContext: Context, val layouts: List<Int> ) : PagerAdapter(){
    var layoutInflater: LayoutInflater? = null
    init {
        layoutInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }
        override fun getCount(): Int {
        return layouts.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInflater!!.inflate(layouts[position],container,false)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        var view = `object` as View
        container.removeView(view)



    }

}
