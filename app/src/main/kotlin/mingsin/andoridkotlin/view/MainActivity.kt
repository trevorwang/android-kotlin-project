package mingsin.andoridkotlin.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.orhanobut.logger.Logger
import mingsin.andoridkotlin.R
import mingsin.andoridkotlin.data.ApiService
import mingsin.andoridkotlin.databinding.ActivityMainBinding
import mingsin.andoridkotlin.viewmodel.MainViewModel
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        MainViewModel(binding).onCreate()
        val apiService = mRestApi.createRetrofit().create(ApiService::class.java)
        requestIp(apiService)
    }

    private fun requestIp(apiService: ApiService) {
        apiService.getIp()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ //onNext
                    Logger.i(it.origin)
                }) { // onError
                    Logger.e(it, it.message)
                }
    }

    override fun onInject() {
         activityComponent.inject(this)
    }

    override fun onResume() {
        super.onResume()

    }
}
