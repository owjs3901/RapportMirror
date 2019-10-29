package kr.ac.innoschool.rapportmirror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MessageActivity : SuperActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        title="메세지"
    }
}
