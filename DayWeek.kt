enum class DayWeek {
    SUNDAY {
        fun dayWeek() = "понедельник";
        val dayCount = 1
    },
    MONDAY{
        fun dayWeek() = "вторник";
        val dayCount = 2
    },
    TUESDAY{
        fun dayWeek() = "среда";
        val dayCount = 3
    },
    WEDNESDAY{
        fun dayWeek() = "четверг";
        val dayCount = 4
    },
    THURSDAY{
        fun dayWeek() = "пятница";
        val dayCount = 5
    },
    FRIDAY{
        fun dayWeek() = "суббота";
        val dayCount = 6
    },
    SATURDAY{
        fun dayWeek() = "воскресенье";
        val dayCount = 7
    };

    //функция для вывода дня недели
    fun DayInfo (day: DayWeek): String {
        return "День недели: ${day}"
    }

    //функция для вывода номера позиции дня недели
    fun DayInfoCount(day: DayWeek): Int{
        return day.ordinal
    }

    //проверяет, является ли день выходным
    fun isWeekend(day: DayWeek): Boolean {
        return day == DayWeek.SUNDAY || day == DayWeek.SATURDAY
    }

    //получает следующий день недели
    fun getNextDay(day: DayWeek): DayWeek {
        return DayWeek.values()[(day.ordinal + 1) % DayWeek.values().size]
    }
}