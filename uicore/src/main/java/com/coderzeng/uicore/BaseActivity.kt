package com.coderzeng.uicore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * <pre>
 *     author : zengy
 *     e-mail : zengyonghao@outlook.com
 *     time   : 2019/08/29
 *     desc   :
 *     version: 1.0
 * </pre>
 */

 abstract class BaseActivity : AppCompatActivity() {
    abstract var layoutId:Int
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        setContentView(layoutId)

    }

}