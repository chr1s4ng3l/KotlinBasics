package com.example.kotlinbasics



fun main(){
    
}


fun deviceNamesSystem(devicenames: Array<String>): Array<String> {
    val uniqueDeviceNames = mutableListOf<String>()
    val deviceCountMap = mutableMapOf<String, Int>()

    for (deviceName in devicenames) {
        var uniqueName = deviceName
        val count = deviceCountMap.getOrDefault(deviceName, 0)
        if (count > 0) {
            uniqueName += count
        }
        uniqueDeviceNames.add(uniqueName)
        deviceCountMap[deviceName] = count + 1
    }

    return uniqueDeviceNames.toTypedArray()
}