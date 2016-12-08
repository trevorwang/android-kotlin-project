package mingsin.andoridkotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import mingsin.andoridkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.tvHello.text = "Google Hello world!!!!!"
    }

}
