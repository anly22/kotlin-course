package lessons.lesson14.homework

// Мероприятие: концерт. Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
// Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию о концерте и метод “купить билет”,
// который увеличивает количество проданных билетов на один.

class Concert(
    val band: String,
    val location: String,
    val cost: Int,
    val capacity: Int
) {
    private var ticketsSold = 0

    fun buyTicket() {
        if (ticketsSold < capacity) {
            ticketsSold++
            println("Ticket purchased.")
        } else {
            println("Sorry, no tickets available.")
        }
    }

    fun printDetails() {
        println("Concert: $band")
        println("Location: $location")
        println("Ticket price: $cost")
        println("Capacity: $capacity")
        println("Tickets sold: $ticketsSold")
        println("Available places: ${capacity - ticketsSold}")
    }
}