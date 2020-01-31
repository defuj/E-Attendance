package id.co.bigtek.attendance.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import id.co.bigtek.attendance.fragments.FragmentAttendance
import id.co.bigtek.attendance.fragments.FragmentHistory
import id.co.bigtek.attendance.fragments.FragmentProfile

class AdapterHome
constructor(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val pages = listOf(
        FragmentAttendance(),
        FragmentHistory(),
        FragmentProfile()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }
}