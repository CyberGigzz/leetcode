package main

import (
	"fmt"
	"strings"
)

func reverseVowels(s string) string {
	vowels := "aeiouAEIOU"
	sArr := []rune(s)
	i, j := 0, len(sArr)-1
	for i < j {
		if !strings.ContainsRune(vowels, sArr[i]) {
			i++
			continue
		}
		if !strings.ContainsRune(vowels, sArr[j]) {
			j--
			continue
		}
		sArr[i], sArr[j] = sArr[j], sArr[i]
		i++
		j--
	}
	return string(sArr)
}

func main() {
	input := "hello"
	output := reverseVowels(input)
	fmt.Println(output) // holle
}
