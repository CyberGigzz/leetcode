package main

import (
	"fmt"
)

func mergeAlternately(word1 string, word2 string) string {
	var result []byte

	for i := 0; i < len(word1) || i < len(word2); i++ {
		if i < len(word1) {
			result = append(result, word1[i])
		}
		if i < len(word2) {
			result = append(result, word2[i])
		}
	}
	return string(result)
}

func main() {
	word1 := "abc"
	word2 := "pqr"
	fmt.Println(mergeAlternately(word1, word2)) // Output: "apbqcr"
}
