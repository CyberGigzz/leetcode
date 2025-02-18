package main

import "fmt"

func smallerNumbersThanCurrent(nums []int) []int {

	maxVal := 0
	for _, num := range nums {
		if num > maxVal {
			maxVal = num
		}
	}

	count := make([]int, maxVal+1)

	for _, num := range nums {
		count[num]++
	}

	for i := 1; i <= maxVal; i++ {
		count[i] += count[i-1]
	}

	result := make([]int, len(nums))
	for i, num := range nums {
		if num == 0 {
			result[i] = 0
		} else {
			result[i] = count[num-1]
		}
	}

	return result
}

func main() {
	nums := []int{8, 1, 2, 2, 3}
	result := smallerNumbersThanCurrent(nums)
	fmt.Println(result)
}
