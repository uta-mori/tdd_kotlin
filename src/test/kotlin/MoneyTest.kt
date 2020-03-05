import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
        five.times(3)
        assertEquals(15, five.amount)
    }
}

/*
TODO $5+$10CHF=$10
TODO amoutをprivateにする
TODO Dollarの副作用どうする
TODO Moneyの丸め処理どうする
*/


