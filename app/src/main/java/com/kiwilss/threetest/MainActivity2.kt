package com.kiwilss.threetest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.kiwilss.threetest.java.model.Person
import com.kiwilss.threetest.java.model.Rectangle

class MainActivity2 : AppCompatActivity() {
    val TAG="MMM";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val a=4;
        val b: Int = 8
        val max = max(a, b)
        Log.e("MMM", "字符串模板,max=$max,等价于max="+max.toString());

        //声明一个类
        val person=Person("Bob",true);
        //调用get方法
        Log.e(TAG,person.name);
        //调用set方法
        person.isMarrid=false
        //调用自定义访问器
        val rectangle=Rectangle(88,25)
        Log.e(TAG,rectangle.isSuqare.toString())
    }

    //声明变量,先是关键词,然后是变量名称,最后是类型(可以不加类型)
    //一般变量,不可变引用
    //使用val声明的变量不能在初始化最后再次赋值
    val answer: Int = 44
    val question = 88
    //可变引用
    var hello=99

    /**
     * 比较两个数的大小并返回较大的值
     */
    fun max(a:Int,b:Int): Int {
        return if (a>b) a else b
    }
    //max等同于max1方法
    fun max1(a:Int,b:Int):Int=if (a>b) a else b
}
