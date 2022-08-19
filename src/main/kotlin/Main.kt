fun main(args: Array<String>) {

    val bmwCar: Bmw = Bmw(model = "BMW M550", color = "blue", speed = 240.0)
    println("bmw fuelType is ${bmwCar.getFuleType()} ")

    val teslaCar: Tesla = Tesla(model = "Tesla model X", color = "White", speed = 220.0)
    println("\ntesla fuelType is ${teslaCar.getFuleType()}")

}