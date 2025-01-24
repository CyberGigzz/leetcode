package main

import (
	"fmt"
)

func isPalindrome(x int) bool {
	if x < 0 || (x != 0 && x%10 == 0) {
		return false
	}
	reversedHalf := 0
	for x > reversedHalf {
		reversedHalf = reversedHalf*10 + x%10
		x /= 10
	}
	return x == reversedHalf || x == reversedHalf/10
}

func main() {
	testCases := []int{121, 34543, 121, 10, 12321, 0}
	for _, tc := range testCases {
		fmt.Printf("isPalindrome(%d) = %v\n", tc, isPalindrome(tc))
	}
}
