package com.coderzeng.binding.ui

import android.widget.Toast
import com.coderzeng.binding.R
import com.coderzeng.binding.databinding.BindingActivityBinding
import com.coderzeng.uicore.BaseActivity

/**
 * <pre>
 *     author : zengy
 *     e-mail : zengyonghao@outlook.com
 *     time   : 2019/08/29
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class BindingActivity : BaseActivity<BindingActivityBinding>() {
    override var layoutId: Int
        get() = R.layout.binding
        set(value) {}

    fun actionBiding(code:String){
        Toast.makeText(this,code,0).show();
    }
}