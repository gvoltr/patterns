package behavioral.template_method

import org.junit.Test

class HotBeverageTest {

    @Test
    fun `difference between tea and espresso preparation showcase` () {
        val tea = Tea()
        val espresso = Espresso()

        println("__Tea preparation__")
        tea.prepareRecipe()
        println("__Espresso preparation__")
        espresso.prepareRecipe()
    }
}