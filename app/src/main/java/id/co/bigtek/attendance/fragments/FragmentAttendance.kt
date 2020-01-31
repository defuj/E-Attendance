package id.co.bigtek.attendance.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.co.bigtek.attendance.R
import kotlinx.android.synthetic.main.fragment_attendance.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentAttendance : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attendance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val now = Date()
        val hrs = now.hours
        when {
            hrs <= 9 -> {
                txtSelamat!!.text = "Selamat Pagi"
                txtKata2!!.text = "Jangan lupa sarapan ya"
            }
            hrs <= 14 -> {
                txtSelamat!!.text = "Selamat Siang"
                txtKata2!!.text = "Jangan lupa makan siang oke"
            }
            hrs <= 17 -> {
                txtSelamat!!.text = "Selamat Sore"
                txtKata2!!.text = "Sudah saatnya istirahat nih"
            }
            else -> {
                txtSelamat!!.text = "Selamat Malam"
                txtKata2!!.text = "Jangan begadang oke"
            }
        }
    }


}
