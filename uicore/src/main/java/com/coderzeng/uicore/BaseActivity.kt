package com.coderzeng.uicore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * <pre>
 *     author : zengy
 *     e-mail : zengyonghao@outlook.com
 *     time   : 2019/08/29
 *     desc   :
 *     version: 1.0
 * </pre>
 */

 abstract class BaseActivity<B : ViewDataBinding> : AppCompatActivity() {
    abstract var layoutId:Int//布局ID
    lateinit var binding : B//viewDataBinding
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        binding  = DataBindingUtil.setContentView(this,layoutId)

    }

}