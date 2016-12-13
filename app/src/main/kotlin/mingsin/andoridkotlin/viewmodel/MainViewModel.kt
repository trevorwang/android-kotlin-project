package mingsin.andoridkotlin.viewmodel

import android.content.Context
import android.databinding.ObservableField
import android.databinding.adapters.TextViewBindingAdapter
import android.view.View
import android.widget.Toast
import javax.inject.Inject

/**
 * Created by trevorwang on 12/12/2016.
 */
class MainViewModel @Inject constructor(val context: Context) : ViewModel<String>() {
    val input = ObservableField<String>()
    val text = BindableString()
    val onClick = View.OnClickListener { v ->
        Toast.makeText(context, input.get(), Toast.LENGTH_SHORT).show()
    }


    val textChange = TextViewBindingAdapter.AfterTextChanged { println(it.toString()) }

}