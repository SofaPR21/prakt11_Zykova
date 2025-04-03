fun main() {
    val today: DayWeek = DayWeek.MONDAY
    println(today.DayInfo(today))
    println("Порядковый номер: ${today.DayInfoCount(today)}")
    println("Выходной? ${today.isWeekend(today)}")
    println("Следующий день: ${today.getNextDay(today)}")

    val color: Color = Color.GREEN
    println(color.getColorOrdinal(color))
    println("Порядковый номер цвета: ${color.getColorOrdinal(color)}")
    println("Основной цвет? ${color.isPrimaryColor(color)}")

    val orderStatus: Status = Status.SHIPPED
    println(orderStatus.getOrderStatusString(orderStatus))
    println("Порядковый номер статуса: ${orderStatus.getOrderStatusOrdinal(orderStatus)}")
    println("Финальный статус? ${orderStatus.isFinalStatus(orderStatus)}")
}

