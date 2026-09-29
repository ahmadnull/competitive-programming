with open("triangle.txt", "r") as f:
    triangle = [[int(n) for n in l.split()] for l in f.read().splitlines()]

for row in range(len(triangle) - 2, -1, -1):
    for col in range(len(triangle[row])):
        triangle[row][col] += max(triangle[row + 1][col], triangle[row + 1][col + 1])

print(triangle[0][0])
