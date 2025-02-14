package main

import "fmt"

func findDisappearedNumbers(nums []int) []int {
	numSet := make(map[int]bool)
	for _, num := range nums {
		numSet[num] = true
	}

	missing := []int{}
	for i := 1; i <= len(nums); i++ {
		if !numSet[i] {
			missing = append(missing, i)
		}
	}
	return missing
}

func main() {
	nums := []int{4, 3, 2, 7, 8, 2, 3, 1}
	result := findDisappearedNumbers(nums)
	fmt.Println(result)
}
