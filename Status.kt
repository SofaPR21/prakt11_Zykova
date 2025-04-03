enum class Status {
    PENDING{
        fun status() = "в ожидании";

    },
    PROCESSING{
        fun status() = "в обработке";

    },
    SHIPPED{
        fun status() = "отправлен";

    },
    DELIVERED{
        fun status() = "доставлен";

    },
    CANCELLED{
        fun status() = "отменен";

    };

    //статус заказа
    fun getOrderStatusString(status: Status): String {
        return "Статус заказа: ${status.name}"
    }

    //возвращает индекс статуса заказа
    fun getOrderStatusOrdinal(status: Status): Int {
        return status.ordinal
    }

    //проверяет, доставлен или отменен заказ
    fun isFinalStatus(status: Status): Boolean {
        return status == Status.DELIVERED || status == Status.CANCELLED
    }


}