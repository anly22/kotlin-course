package lessons.lesson18.homework

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

//Задача 1. Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.
//
//Холодильник
//Стиральная машина
//Умная лампа
//Электронные часы
//Робот-пылесос
//Механические часы
//Фонарик
//Кофемашина
//Умная колонка
abstract class Device(val deviceName: String = "Device") {
    abstract val brand: String
    abstract val serialNumber: String
}

abstract class Fridge() : Device(), Powerable, Openable, LightEmitting, Cleanable
abstract class WashingMachine() : Powerable, Openable, WaterContainer, WaterConnection, TemperatureRegulatable, Drainable, Timable
abstract class SmartLamp() : Powerable, Programmable, Movable, Rechargeable, LightEmitting
abstract class DigitalWatch() : Programmable, Movable, BatteryOperated
abstract class RobotVacuumCleaner() : Powerable, Programmable, Movable, Timable, Rechargeable
abstract class MechanicalWatch() : Mechanical, Movable
abstract class Flashlight() : Powerable, LightEmitting, BatteryOperated
abstract class CoffeeMachine() : Powerable, Programmable, TemperatureRegulatable, WaterContainer, WaterConnection, Drainable, Timable
abstract class SmartSpeaker() : Powerable, AutomaticShutdown, SoundEmitting, Programmable, Movable

// Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс с реализацией методов (достаточно println с выполняемым действием).
abstract class PowerableDevice(deviceName: String = "Device") : Device(deviceName), Powerable {
    var isOn: Boolean = false
        protected set

    override fun powerOn() {
        isOn = true
        println("Device $deviceName $brand is on")
    }

    override fun powerOff() {
        isOn = false
        println("Device $deviceName $brand is off")
    }
}

//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса
// и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.

abstract class ProgrammableDevice(deviceName: String = "Device") :
    PowerableDevice(deviceName), Programmable {

    override fun programAction(action: String) {
        if (!isOn) {
            println("$deviceName $brand is off. Cannot program action")
            return
        }
        println("$action is programmed for $deviceName $brand")
    }

    override fun execute() {
        if (!isOn) {
            println("$deviceName $brand is off. Cannot execute")
            return
        }
        println("Action executed")
    }
}

//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться
// и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.

abstract class OpenableTemperatureRegulatableDevice(deviceName: String = "Device") :
    ProgrammableDevice(deviceName), Openable, TemperatureRegulatable {

    var isOpen: Boolean = false
        protected set

    override fun open() {
        isOpen = true
        println("$deviceName $brand is opened")
    }

    override fun close() {
        isOpen = false
        println("$deviceName $brand is closed")
    }

    override val maxTemperature: Int
        get() = 90

    override fun setTemperature(temp: Int) {
        if (!isOn) {
            println("$deviceName $brand is off. Cannot set temperature")
            return
        }

        if (temp > maxTemperature || temp < 0) {
            println("Cannot set temperature to $temp")
        } else {
            println("Temperature is set to $temp")
        }
    }
}

//Задача 5. Создай не абстрактные классы устройств с наследованием от абстрактного класса с возможностью устанавливать
// температуру и открываться. Пусть это будет холодильник, стиральная машина, чайник, духовка.
// Добавь недостающие интерфейсы и реализуй необходимые методы (достаточно вывод в консоль производимого действия).
// Обрати внимание на то, что установка температуры и программирование устройства (считай - задание режима работы)
// не имеет смысла при выключенном питании - добавь эту проверку.

// Холодильник
class FridgeDevice(
    override val brand: String,
    override val serialNumber: String
) : OpenableTemperatureRegulatableDevice("Fridge"),
    LightEmitting, Cleanable {

    override val maxTemperature: Int
        get() = 10


    override fun emitLight() {
        println("$deviceName light is on")
    }

    override fun completeLiteEmission() {
        println("$deviceName light is off")
    }

    override fun clean() {
        println("$deviceName is cleaned")
    }
}

// Стиральная машина
class WashingMachineDevice(
    override val brand: String,
    override val serialNumber: String
) : OpenableTemperatureRegulatableDevice("Washing machine"),
    WaterContainer, WaterConnection, Drainable, Timable {

    override val capacity: Int = 50

    override fun fillWater(amount: Int) {
        println("Filled $amount liters of water")
    }

    override fun getWater(amount: Int) {
        println("Got $amount liters of water")
    }

    override fun connectToWaterSupply() {
        println("Connected to water supply")
    }

    override fun connectToDrain() {
        println("Connected to drain")
    }

    override fun drain() {
        println("Water drained")
    }

    override fun setTimer(time: Int) {
        println("Timer set to $time minutes")
    }
}

// Чайник
class KettleDevice(
    override val brand: String,
    override val serialNumber: String
) : OpenableTemperatureRegulatableDevice("Kettle"), WaterContainer {

    override val capacity: Int = 2

    override val maxTemperature: Int
        get() = 100

    override fun fillWater(amount: Int) {
        println("Filled kettle with $amount liters")
    }

    override fun getWater(amount: Int) {
        println("Poured $amount liters of water")
    }
}

// Духовка
class OvenDevice(
    override val brand: String,
    override val serialNumber: String
) : OpenableTemperatureRegulatableDevice("Oven"), Timable {

    override val maxTemperature: Int
        get() = 220

    override fun setTimer(time: Int) {
        println("Oven timer set to $time minutes")
    }
}

//Создай объекты этих устройств и позапускай их с различными методами.

fun main() {

    val fridge = FridgeDevice( "Samsung", "FR-001")
    val washingMachine = WashingMachineDevice( "LG", "WM-001")
    val kettle = KettleDevice( "Philips", "KT-001")
    val oven = OvenDevice( "Bosch", "OV-001")

    // Холодильник
    fridge.powerOn()
    fridge.setTemperature(8)
    fridge.open()
    fridge.emitLight()
    fridge.close()
    fridge.powerOff()

    println()

    // Стиральная машина
    washingMachine.powerOn()
    washingMachine.connectToWaterSupply()
    washingMachine.connectToDrain()
    washingMachine.fillWater(30)
    washingMachine.setTemperature(40)
    washingMachine.programAction("Cotton wash")
    washingMachine.execute()
    washingMachine.drain()
    washingMachine.powerOff()

    println()

    // Чайник
    kettle.powerOn()
    kettle.fillWater(1)
    kettle.setTemperature(100)
    kettle.programAction("Boil water")
    kettle.execute()
    kettle.powerOff()

    println()

    // Духовка
    oven.powerOn()
    oven.open()
    oven.setTemperature(180)
    oven.setTimer(30)
    oven.programAction("Bake")
    oven.execute()
    oven.close()
    oven.powerOff()
}
