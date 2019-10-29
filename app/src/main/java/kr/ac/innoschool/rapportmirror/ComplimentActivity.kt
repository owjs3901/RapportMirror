package kr.ac.innoschool.rapportmirror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ComplimentActivity : SuperActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compliment)
        title="칭찬하기"
    }
}
