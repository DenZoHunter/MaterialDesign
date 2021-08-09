package geekbarains.material.ui.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import geekbarains.material.R
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val data = arrayListOf(
            Data("Earth"),
            Data("Earth"),
            Data("Mars", ""),
            Data("Earth"),
            Data("Earth"),
            Data("Earth"),
            Data("Mars", null)
        )
        recyclerView.adapter = RecyclerActivityAdapter(
            object : RecyclerActivityAdapter.OnListItemClickListener {
                override fun onItemClick(data: Data) {
                    Toast.makeText(this@RecyclerActivity, data.someText, Toast.LENGTH_SHORT).show()
                }
            },
            data
        )
    }
}