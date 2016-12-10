package mingsin.andoridkotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.orhanobut.logger.Logger
import mingsin.andoridkotlin.databinding.ActivityMainBinding
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.hello = "Google Hello!!!"
        val apiService = RestApi().createRetrofit().create(ApiService::class.java)
        apiService.getIp()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ //onNext
                    Logger.i(it)
                }) { // onError
                    Logger.e(it, it.message)
                }
    }


    override fun onResume() {
        super.onResume()

    }
}
