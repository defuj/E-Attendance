package id.co.bigtek.attendance.activity

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import id.co.bigtek.attendance.R

class ActivitySplahScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        object : CountDownTimer(2000,1000){
            override fun onFinish() {
                startActivity(Intent(this@ActivitySplahScreen,ActivityHome::class.java))
            }

            override fun onTick(millisUntilFinished: Long) {

            }
        }.start()
    }
}
