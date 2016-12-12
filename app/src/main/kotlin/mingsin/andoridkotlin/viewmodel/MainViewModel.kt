package mingsin.andoridkotlin.viewmodel

import android.content.Context
import android.databinding.ObservableField
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import javax.inject.Inject

/**
 * Created by trevorwang on 12/12/2016.
 */
class MainViewModel @Inject constructor(val context: Context) : ViewModel<String>() {
    val input = ObservableField<String>()
    val onClick = View.OnClickListener { v ->
        Toast.makeText(context, input.get(), Toast.LENGTH_SHORT).show()
    }


    val textWatcher = object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val a = p0 as String
            input.set(a)

        }

    }
}