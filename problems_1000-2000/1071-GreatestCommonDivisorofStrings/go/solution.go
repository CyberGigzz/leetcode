package main

import "fmt"

func main() {
	fmt.Println(gcdOfStrings("ABCABC", "ABC"))
}

func gcdOfStrings(str1 string, str2 string) string {

	if str1+str2 != str2+str1 {
		return ""
	}

	if str1 == str2 {
		return str1
	}

	a := len(str1)
	b := len(str2)

	for b != 0 {
		a, b = b, a%b
	}

	gcd := a

	return str1[:gcd]
}
