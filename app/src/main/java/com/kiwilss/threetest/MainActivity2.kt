package com.kiwilss.threetest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.kiwilss.threetest.enum_test.Color2
import com.kiwilss.threetest.java.model.Person
import com.kiwilss.threetest.java.model.Rectangle

class MainActivity2 : AppCompatActivity() {
    val TAG="MMM";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

            

        val a=4;
        val b: Int = 8889
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
        Log.e(TAG,rectangle.isSuqare.toString()+"|||"+rectangle.hw)
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

    fun max2(a: Int,b: Int) = if (a>b) a else b

    //when的使用

    fun geMnumonic(color: Color2) =//直接返回一个when表达式
            when(color){


                Color2.RED -> "Richard"
                Color2.ORANGE -> "of"
                Color2.YELLOW -> "york"
                Color2.GREEN -> "gave"
                Color2.BLUE -> "battle"
                Color2.INDIGO -> "in"
                Color2.VIOLET -> "Vain"
                else -> "other"
            }

    fun getWarmth(color: Color2)=when(color){

        Color2.RED,Color2.BLUE,Color2.GREEN -> "warm"

        Color2.ORANGE -> "neutral"
        Color2.YELLOW , Color2.INDIGO , Color2.VIOLET -> "cold"

    }
    //简写
    fun getWarmth2(color: Color2)=when(color){
        Color2.RED -> "red"
        else -> "else"
    }

}
