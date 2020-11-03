package android.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            /*/////function to lambda evolution:

            // Normalo fun
            fun benannt(i: Int): Boolean {
                return i % 6 == 0
            }


            // Anonyme fun:
            val benannt = fun(i: Int): Boolean {
                return i % 6 == 0
            }
            for (i in filtern(0..20, benannt)) {
                Log.d("mein", i.toString())
            }


            // Or direct in Parameter
            for (i in filtern(0..20, fun(i: Int): Boolean { return i % 6 == 0 })) {
                Log.d("mein", i.toString())
            }


            // Shorter:
            val benannt2 = { i: Int -> i % 6 == 0 }
            for (i in filtern(0..20, benannt2)) {
                Log.d("mein", i.toString())
            }


            // Shorter and direct in Parameter:
            for (i in filtern(0..20, { i -> i % 6 == 0 })) {
                Log.d("mein", i.toString())
            }*/


            //Shorter!!!:
            // i -> i to it


            // Shorter:
            for (i in filtern(0..20, { it % 6 == 0 })) {
                Log.d("mein", i.toString())  // Result: 0  6  12  18
            }




            /*/ Or with forEach lambda expression:
            filtern(0..20, { it % 6 == 0 }).forEach { Log.d("mein", it.toString()) }
        }*/
        }
    }

    // yield like in C#... only sequence block added  :))))
    fun filtern(range: IntRange, filter: (Int) -> Boolean): Sequence<Int> {
        return sequence {
            for (i in range) {
                if (filter(i)) {
                    yield(i)
                }
            }
        }
    }
}
