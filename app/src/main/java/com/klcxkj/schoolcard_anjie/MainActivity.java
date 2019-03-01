package com.klcxkj.schoolcard_anjie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.klcxkj.reshui.ACT_CardCenter;
import com.klcxkj.reshui.RechagePayBak;

public class MainActivity extends AppCompatActivity implements RechagePayBak {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 登录/注册
                Intent intent =new Intent(MainActivity.this, ACT_CardCenter.class);
                intent.putExtra("tellPhoneNum","17728031092");//手机号码
                intent.putExtra("prjRecId","2");//项目ID
                startActivity(intent);
            }
        });
    }

    @Override
    public void payBack(String info, String type, String monney) {
        Toast.makeText(this, info + type + monney, Toast.LENGTH_SHORT).show();
    }
}
