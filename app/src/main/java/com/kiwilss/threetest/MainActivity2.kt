package com.kiwilss.threetest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    //声明变量,先是关键词,然后是变量名称,最后是类型(可以不加类型)

    /**
     * 比较两个数的大小并返回较大的值
     */
    fun max(a:Int,b:Int): Int {
        return if (a>b) a else b
    }
    //max等同于max1方法
    fun max1(a:Int,b:Int):Int=if (a>b) a else b
}
