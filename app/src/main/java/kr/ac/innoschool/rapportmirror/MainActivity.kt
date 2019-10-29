package kr.ac.innoschool.rapportmirror

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : SuperActivity() {

    var isLogin:Boolean=false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(!isLogin)
            startActivity(Intent(this,LoginActivity::class.java))
    }

}
