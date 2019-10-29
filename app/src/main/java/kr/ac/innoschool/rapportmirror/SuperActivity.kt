package kr.ac.innoschool.rapportmirror

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class SuperActivity: AppCompatActivity() {

    var title = "라포미러"
        public set;

    override fun onStart() {
        super.onStart()
        findViewById<TextView>(R.id.title).setText(title);
    }

    fun openBell(view: View){
        startActivity(Intent(this,BroadcastActivity::class.java))
        if(this !is MainActivity)
            finish()
    }
    fun openMessage(view: View){
        startActivity(Intent(this,MessageActivity::class.java))
        if(this !is MainActivity)
            finish()
    }
    fun openSetting(view: View){
        startActivity(Intent(this,SettingActivity::class.java))
        if(this !is MainActivity)
            finish()
    }
}