package kr.ac.innoschool.rapportmirror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class BroadcastActivity : SuperActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
        title="공지사항"
        findViewById<ListView>(R.id.list).adapter=ArrayAdapter.createFromResource(applicationContext,R.array.data,android.R.layout.simple_list_item_1)
    }
}
