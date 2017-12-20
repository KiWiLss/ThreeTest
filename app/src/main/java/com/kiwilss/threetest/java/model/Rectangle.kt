package com.kiwilss.threetest.java.model

/**
 * Created by kiwilss on 2017/11/6.
 */
class Rectangle(val height: Int ,val width: Int) {

    val isSuqare: Boolean
            //自定义访问器
//        get():Boolean {//声明属性的getter
//        return height==width
//    }
    //这个方法还可以写成
    get() = height==width

    val hw: Int
    get() = height+width

}