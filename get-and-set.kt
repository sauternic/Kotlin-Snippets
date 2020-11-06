package android.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val cTest = CTest()
            cTest.i = 2
            button.text = cTest.i.toString()
            // Result: 8
        }
    }

    // 'this.i' not Work in get() and set() only field!!!
    // field is 'this.i' in Kotlin!
    class CTest {
        var i = 0
            get() {
                return field * 2
            }
            set(value) {
                field = value * 2
            }
    }
}