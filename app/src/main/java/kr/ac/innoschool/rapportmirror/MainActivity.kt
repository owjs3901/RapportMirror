package kr.ac.innoschool.rapportmirror

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : SuperActivity() {

    var isLogin:Boolean=false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(!isLogin)
            startActivity(Intent(this,LoginActivity::class.java))

        val b:AlertDialog.Builder=AlertDialog.Builder(this)
        b.setTitle("동 선택")
        b.setItems(arrayOf("칭찬하기","건의하기"),null)
        val g=((findViewById<ViewGroup>(android.R.id.content).getChildAt(0) as ViewGroup).getChildAt(1) as ViewGroup).getChildAt(0) as ViewGroup
        for (i in 0..10){
            val ac=layoutInflater.inflate(R.layout.door,null);
            ac.findViewById<TextView>(R.id.door0).setText("${100*(i+1)+1}")
            ac.findViewById<View>(R.id.door).setOnLongClickListener{
                b.show();
                return@setOnLongClickListener true
            }
            ac.findViewById<View>(R.id.door2).setOnLongClickListener{
                b.show();
                return@setOnLongClickListener true
            }
            ac.findViewById<TextView>(R.id.door1).setText("${100*(i+1)+2}")
            g.addView(ac)
        }
    }

}
