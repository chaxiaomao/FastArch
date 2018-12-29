package com.dev.autosize.module_shop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fec.core.router.arouter.RouterURLS;

/**
 * Created by Administrator on 2018-12-29.
 */

@Route(path = RouterURLS.MODULE_UI)
public class UIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_activiy);
    }
}
