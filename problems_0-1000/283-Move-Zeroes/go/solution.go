package main

import "fmt"

func moveZeroes(nums []int) {
	n := len(nums)
	lastNonZeroIndex := 0

	for i := 0; i < n; i++ {
		if nums[i] != 0 {
			nums[lastNonZeroIndex], nums[i] = nums[i], nums[lastNonZeroIndex]
			lastNonZeroIndex++
		}
	}
}

func main() {
	nums := []int{0, 1, 0, 3, 12}
	moveZeroes(nums)
	fmt.Println(nums)

}
