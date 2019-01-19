package comparision

class KotlinUser(val id: Int) {
   init { // 주 생성자를 호출하면 init block을 실행한다.
       println("It's init block...")
   }

    val name: String = "Shawn"
        get() {     // val은 불변이지만, 항상 동일한 값을 리턴한다고 보장할 수 없다.
            if(age > 32) {
                return "old ${field}" // `field`는 getter/setter 에서만 사용하는 예약어
            } else {
                return "still young ${field}"
            }
        }
    var age: Int = 32
        get() = field
        set(value) {
            println("나이를 더 먹었구나.")
            field = value
        }
}
