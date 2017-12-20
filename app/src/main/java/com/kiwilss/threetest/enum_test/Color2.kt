package com.kiwilss.threetest.enum_test

/**
 * Created by kiwilss on 2017/11/8.
 * //声明一个带属性的枚举
 */
enum class Color2 (val r: Int, val g: Int,val b:Int){//声明枚举常量的属性

    RED(255,0,0),ORANGE(255,165,0),YELLOW(255,255,0),GREEN(0,255,0)
    ,BLUE(0,0,255),INDIGO(75,0,130),VIOLET(238,130,238);//这里必须有分号
    //在每个常量创建的时候,指定属性值

    //给枚举定义一个方法
    fun rgb() = (r*256+g)*256+b

}