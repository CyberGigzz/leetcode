package main

func twoSum(nums []int, target int) []int {

	m := make(map[int]int)

	for i, v := range nums {

		diff := target - v
		if j, ok := m[diff]; ok {
			return []int{i, j}
		} else {
			m[v] = i
		}

	}
	return []int{}
}

func main() {

	nums := []int{2, 7, 11, 15}
	result := twoSum(nums, 9)
	println(result[0], result[1])
}
