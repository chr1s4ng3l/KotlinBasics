package com.example.kotlinbasics

/**
 * Calculates the maximum units that can be loaded into a truck based on given boxes and their unit quantities.
 *
 * @param boxes An array of box quantities.
 * @param unitsPerBox An array of unit quantities per box.
 * @param truckSize The maximum capacity of the truck.
 * @return The maximum units that can be loaded into the truck.
 */
fun getMaxUnits(boxes: Array<Long>, unitsPerBox: Array<Long>, truckSize: Long): Long {
    // Combines the box quantities and unit quantities per box into pairs and sorts them in descending order of units.
    val boxList = boxes.zip(unitsPerBox).sortedByDescending { it.second }

    // Initializes the remaining truck capacity and maximum units loaded to zero.
    var truckCapacity = truckSize
    var max = 0L

    // Iterates through each box in the sorted list.
    for ((boxCount, units) in boxList) {
        // Determines the number of boxes to be loaded, which is the minimum between boxCount and the remaining truck capacity.
        val selectedBoxes = boxCount.coerceAtMost(truckCapacity)
        // Adds the units of the selected boxes to the maximum units loaded.
        max += units * selectedBoxes

        // Decreases the truck capacity by the number of selected boxes.
        truckCapacity -= selectedBoxes

        // Checks if the truck capacity is exhausted.
        if (truckCapacity == 0L) {
            break // If the capacity is reached, exits the loop.
        }
    }

    // Returns the maximum units loaded into the truck.
    return max
}

// Entry point of the program
fun main() {
    // Defines the box quantities, unit quantities per box, and maximum truck capacity.
    val boxes: Array<Long> = arrayOf(5,2,4,3)
    val unitsPerBox: Array<Long> = arrayOf(10,5,7,9)
    val truckSize: Long = 10

    // Calls the getMaxUnits function to calculate the maximum units that can be loaded into the truck.
    val maxUnits = getMaxUnits(boxes, unitsPerBox, truckSize)

    // Prints the maximum units loaded into the truck.
    println(maxUnits)
}
