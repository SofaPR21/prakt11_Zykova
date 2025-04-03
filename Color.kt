enum class Color {
    RED {
        fun сolor() = "красный";
        val сolorCount = "FF0000"
    },
    GREEN{
        fun сolor() = "зеленый";
        val сolorCount = "008000"
    },
    BLUE{
        fun сolor() = "голубой";
        val сolorCount = "0000FF"
    },
    YELLOW{
        fun сolor() = "желтый";
        val сolorCount = "FFFF00"
    },
    ORANGE{
        fun сolor() = "оранжевый";
        val сolorCount = "FFA500"
    },
    PURPLE{
        fun сolor() = "фиолетовый";
        val сolorCount = "800080"
    },
    BLACK{
        fun сolor() = "черный";
        val сolorCount = "000000"
    },
    WHITE{
        fun сolor() = "белый";
        val сolorCount = "FFFFFF"
    };

    //вывод цвета
    fun getColorString(color: Color): String {
        return "Цвет: ${color.name}"
    }

    //порядковый номер цвета
    fun getColorOrdinal(color: Color): Int {
        return color.ordinal
    }

    //является ли цвет основным
    fun isPrimaryColor(color: Color): Boolean {
        return color == Color.RED || color == Color.GREEN || color == Color.BLUE
    }

}