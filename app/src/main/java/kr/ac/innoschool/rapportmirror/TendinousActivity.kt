package kr.ac.innoschool.rapportmirror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TendinousActivity : SuperActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tendinous)
        title="건의하기"
    }
}
