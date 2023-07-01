package com.example.affirmations_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations_view.adapter.ItemAdapter
import com.example.affirmations_view.model.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Datasource 인스턴스 만들기
        val myDataset = Datasource().loadAffirmations()
        //activity_main.xml의 RecyclerView 참조를 찾는다.
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        //recycler의 adapter 속성에 전에 만든 ItemAdapter 연결
        recyclerView.adapter = ItemAdapter(this,myDataset)
        //RecyclerView의 레이아웃 크기를 고정한다는 것을 명시
        //크기가 계속 변한다면 크기를 측정하고 다시 뷰를 그리는 등 불필요한 작업이 발생한다.
        recyclerView.setHasFixedSize(true)

    }
}