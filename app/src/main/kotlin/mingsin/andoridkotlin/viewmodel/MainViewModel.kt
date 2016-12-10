package mingsin.andoridkotlin.viewmodel

import mingsin.andoridkotlin.databinding.ActivityMainBinding

/**
 * Created by trevorwang on 10/12/2016.
 */

class MainViewModel(override var binding: ActivityMainBinding) : ViewModel<ActivityMainBinding>() {
    fun onCreate() {
        binding.hello = "Google Hello!!!"
    }
}