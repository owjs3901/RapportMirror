package kr.ac.innoschool.rapportmirror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MessageActivity : SuperActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        title="메세지"
        findViewById<ListView>(R.id.list).adapter=
            ArrayAdapter.createFromResource(applicationContext,R.array.msg,android.R.layout.simple_list_item_1)
    }
}
