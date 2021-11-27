package com.neppplus.jickbangcopy_20211127.datas

import java.text.NumberFormat
import java.util.*

class RoomData(

    val price: Int,
    val address: String,
    val floor: Int,
    val description: String

) {

//    방 데이터의 기능 :  가격을 가공해서 String으로 주는 기능. => 리스트뷰 / 상세화면 두군데에서 사용.

    fun getFormattedPrice() : String {

        if (this.price < 10000) {

//            ex. 8000 => 8,000

            return NumberFormat.getNumberInstance( Locale.KOREA ).format(this.price)
        }
        else {
            return "1억이상"
        }

    }

//    추가 기능 : 층수도 가공해서 String으로 주자.

    fun getFormattedFloor() : String {

        if ( this.floor > 0 ) {
            return "${this.floor}층"
        }
        else if ( this.floor == 0) {
            return "반지하"
        }
        else {
            return  "지하 ${-this.floor}층"  // -2 :  지하 -2층
        }

    }

}