package com.example.mayada.homework4.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.mayada.homework4.R
import com.example.mayada.homework4.fragments.MonthFragment
import com.example.mayada.homework4.fragments.WeekDayFragment
import com.example.mayada.homework4.fragments.ZodiacSignFragment


class CategoryAdapter(
    private val mContext: Context, fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> WeekDayFragment()
            1 -> MonthFragment()
            else -> ZodiacSignFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return return when (position) {
            0 -> mContext.getString(R.string.category_week_days)
            1 -> mContext.getString(R.string.category_months)
            else -> mContext.getString(R.string.category_zodiac_signs)
        }
    }
}
