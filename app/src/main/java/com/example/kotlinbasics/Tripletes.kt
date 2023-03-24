package com.example.kotlinbasics


fun main(){

    val myArray = intArrayOf(-1, 0, 1, 2, -1, -4)

    println(threeSum(myArray))

}


fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort() // Sort the input array in ascending order
    for (i in 0 until nums.size - 2) { // Iterate over the array using a for loop
        if (i > 0 && nums[i] == nums[i - 1]) continue // Skip duplicates
        var j = i + 1 // Set the j pointer to the next element after i
        var k = nums.size - 1 // Set the k pointer to the last element in the array
        while (j < k) { // Start a while loop that continues while j is less than k
            val sum = nums[i] + nums[j] + nums[k] // Calculate the sum of the current triplet
            when {
                sum == 0 -> { // If the sum is zero, add the triplet to the result list
                    result.add(listOf(nums[i], nums[j], nums[k]))
                    j++ // Move j one position to the right
                    k-- // Move k one position to the left
                    while (j < k && nums[j] == nums[j - 1]) j++ // Skip duplicates of j
                    while (j < k && nums[k] == nums[k + 1]) k-- // Skip duplicates of k
                }
                sum < 0 -> j++ // If the sum is less than zero, move j one position to the right
                sum > 0 -> k-- // If the sum is greater than zero, move k one position to the left
            }
        }
    }
    return result // Return the result list containing all triplets that sum up to zero
}

