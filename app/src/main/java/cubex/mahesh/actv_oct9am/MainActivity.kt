package cubex.mahesh.actv_oct9am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var values = resources.getStringArray(R.array.countries)
    //  var values = arrayOf("Saudi Arebia","South Africa","Sri Lanka")
        var adapter = ArrayAdapter<String>(
                this@MainActivity,R.layout.indiview, values)
        actv.setAdapter(adapter)
        actv.threshold = 1
    }
}
