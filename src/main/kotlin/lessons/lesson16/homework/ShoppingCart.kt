package lessons.lesson16.homework

class ShoppingCart {

    private val items = mutableMapOf<Int, Int>()

    // Добавление одного товара
    fun addToCart(itemId: Int) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    // Добавление товара с указанным количеством
    fun addToCart(itemId: Int, amount: Int) {
        require(amount > 0) {
            "Amount must be greater than zero"
        }

        items[itemId] = (items[itemId] ?: 0) + amount
    }

    // Добавление словаря товаров
    fun addToCart(newItems: Map<Int, Int>) {
        for ((itemId, amount) in newItems) {
            addToCart(itemId, amount)
        }
    }

    // Добавление списка ID товаров
    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    override fun toString(): String {
        val result = buildString {
            appendLine("========== SHOPPING CART ==========")
            appendLine("ID\t\tQuantity")
            appendLine("-----------------------------------")

            for ((itemId, quantity) in items) {
                appendLine("$itemId\t\t$quantity")
            }

            appendLine("-----------------------------------")
            appendLine("Unique products: ${items.size}")
            appendLine("Total quantity: ${items.values.sum()}")
            append("===================================")
        }

        return result
    }
}

fun main() {
    val cart = ShoppingCart()

    // Добавляем один товар
    cart.addToCart(101)

    // Добавляем товар с количеством
    cart.addToCart(102, 3)

    // Добавляем словарь
    cart.addToCart(
        mapOf(
            101 to 2,
            103 to 5,
            104 to 1
        )
    )

    // Добавляем список ID
    cart.addToCart(listOf(102, 103, 105, 105))

    println(cart)
}