package main

import (
	"os"
	"fmt"
	"encoding/csv"
	"strings"
	"slices"
)

func eval_string(s string) int {
	sum :=  0
	for _, c := range s {
		c_value := int(c - 'A' + 1)
		sum += c_value
	}
	
	return sum
}

func main() {
	dat, err := os.ReadFile("names.txt")
	if err != nil {
		panic(err)
	}

	reader := csv.NewReader(strings.NewReader(string(dat)))

	names, err := reader.Read()
	if err != nil {
		panic(err)
	}

	slices.Sort(names)

	sum := 0
	for index, name := range names {
		name_value := eval_string(name)
		name_score := (index + 1) * name_value 
		sum += name_score
		fmt.Printf("name = %v, value = %d, score = %d\n", name, name_value, name_score)
	}

	fmt.Printf("Names Scores Sum = %d\n", sum)
}
