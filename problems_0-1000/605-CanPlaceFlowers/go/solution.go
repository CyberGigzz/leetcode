package main

import "fmt"

func canPlaceFlowers(flowerbed []int, n int) bool {
	length := len(flowerbed)
	i := 0

	for i < length && n > 0 {
		if flowerbed[i] == 0 {
			leftEmpty := i == 0 || flowerbed[i-1] == 0
			rightEmpty := i == length-1 || flowerbed[i+1] == 0

			if leftEmpty && rightEmpty {
				flowerbed[i] = 1
				n--
				i++
			}
		}
		i++
	}

	return n <= 0
}

func main() {
	flowerbed1 := []int{1, 0, 0, 0, 1}
	n1 := 1
	fmt.Println(canPlaceFlowers(flowerbed1, n1))

	flowerbed2 := []int{1, 0, 0, 0, 1}
	n2 := 2
	fmt.Println(canPlaceFlowers(flowerbed2, n2))
}
