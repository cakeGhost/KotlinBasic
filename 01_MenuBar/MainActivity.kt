package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    
    // menuInflater는 MenuInflater 타입의 속성
    // 이 객체의 inflate() 함수에 매개변수로 메뉴 XML 파일을 명시하면 액티비티에 메뉴가 적용 됨 
    
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu_main, menu)
       return super.onCreateOptionsMenu(menu)
    }

}



