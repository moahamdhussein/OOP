class Bmw(
    override var model: String, override var color: String, override var speed: Double,
) : Car {
    override fun getFuleType(): String {
        return "Gasoline"
    }


}