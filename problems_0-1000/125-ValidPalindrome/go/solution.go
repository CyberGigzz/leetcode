package main

func isPalindrome(s string) bool {
	var cleaned []byte
	for _, c := range s {
		if (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') {
			cleaned = append(cleaned, byte(c))
		} else if c >= 'A' && c <= 'Z' {
			cleaned = append(cleaned, byte(c+32))
		}
	}

	left, right := 0, len(cleaned)-1
	for left < right {
		if cleaned[left] != cleaned[right] {
			return false
		}
		left++
		right--
	}

	return true
}

func main() {
	isPalindrome("A man, a plan, a canal: Panama")
}
