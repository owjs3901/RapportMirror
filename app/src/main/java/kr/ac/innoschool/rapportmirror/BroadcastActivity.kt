package kr.ac.innoschool.rapportmirror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BroadcastActivity : SuperActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
        title="공지사항"
    }
}
