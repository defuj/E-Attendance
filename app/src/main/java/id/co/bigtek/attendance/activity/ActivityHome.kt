package id.co.bigtek.attendance.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.co.bigtek.attendance.R
import id.co.bigtek.attendance.adapter.AdapterHome
import kotlinx.android.synthetic.main.activity_home.*

class ActivityHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
        runFunction()
    }

    private fun init(){
        bottomBar!!.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_attendance -> viewPager!!.setCurrentItem(0,false)
                R.id.menu_history -> viewPager!!.setCurrentItem(1,false)
                R.id.menu_profile -> viewPager!!.setCurrentItem(2,false)
            }
            true
        }
        val adapterHome = AdapterHome(supportFragmentManager)
        viewPager!!.adapter = adapterHome
        viewPager!!.offscreenPageLimit = 4
    }

    private fun runFunction(){

    }

    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}
