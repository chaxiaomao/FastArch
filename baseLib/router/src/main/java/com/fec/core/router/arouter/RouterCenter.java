package com.fec.core.router.arouter;

import android.app.Activity;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

/**
* @Created by TOME .
* @时间 2018/4/26 10:19
* @描述 ${路由中心}
*/
//ARouter 提供了大量的参数类型 跳转携带 https://blog.csdn.net/zhaoyanjun6/article/details/76165252
public class RouterCenter {

   /**
    * mpv数据测试
    */
   public static void toTato() {
       ARouter.getInstance().build(RouterURLS.MODULE_TATO).navigation();
   }

   /**
    * UI测试
    */
   public static void toUi() {
      ARouter.getInstance().build(RouterURLS.MODULE_UI).navigation();
   }

}
