package com.neppplus.jickbangcopy_20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20211127.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20211127.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ArrayList의 add 기능 활용 + 내부 재료로 RoomData클래스의 생성자 활용
        mRoomList.add(  RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다.")  )
        mRoomList.add(  RoomData(18000, "서울시 동대문구", 15, "2번째 방입니다.")  )
        mRoomList.add(  RoomData(25700, "서울시 동대문구", 10, "3번째 방입니다.")  )
        mRoomList.add(  RoomData(9700, "서울시 서대문구", 8, "4번째 방입니다.")  )
        mRoomList.add(  RoomData(158000, "서울시 서대문구", -2, "5번째 방입니다.")  )
        mRoomList.add(  RoomData(56000, "서울시 서대문구", -1, "6번째 방입니다.")  )
        mRoomList.add(  RoomData(26000, "서울시 서대문구", 0, "7번째 방입니다.")  )
        mRoomList.add(  RoomData(3000, "서울시 종로구", 5, "8번째 방입니다.")  )
        mRoomList.add(  RoomData(79000, "서울시 종로구", -1, "9번째 방입니다.")  )
        mRoomList.add(  RoomData(23500, "서울시 종로구", 0, "10번째 방입니다.")  )
        mRoomList.add(  RoomData(17000, "서울시 종로구", 3, "11번째 방입니다.")  )

        mRoomAdapter = RoomAdapter( this, R.layout.room_list_item, mRoomList )
        roomListView.adapter =  mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom  =  mRoomList[position]

            val myIntent = Intent( this, ViewRoomDetailActivity::class.java )
            myIntent.putExtra("room", clickedRoom)
            startActivity(myIntent)

        }


    }
}