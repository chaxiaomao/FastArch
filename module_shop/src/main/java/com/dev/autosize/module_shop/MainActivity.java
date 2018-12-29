package com.dev.autosize.module_shop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.fec.core.router.arouter.RouterCenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018-12-27.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R2.id.to_ui_btn)
    Button toUiBtn;
    @BindView(R2.id.to_data_btn)
    Button toDataBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.to_ui_btn, R2.id.to_data_btn})
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.to_ui_btn) {
            RouterCenter.toUi();
        } else if (id == R.id.to_data_btn) {
            RouterCenter.toTato();
        }
    }
}
