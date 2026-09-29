#include <stdio.h>

// Triangular Number Functions
static long long T(long long n) {
    return (int) ((n * (n + 1)) / 2);
}

static int count_divisors(long long n) {
    if (n <= 0) return 0;
    if (n == 1) return 1;

    int count = 2;
    for (long long i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            count++;
            if (i * i != n) count++;
        }
    }

    return count;
}

int main(void) {
    int c = 0;
    for (long long n = 1; c < 500; n++) {
        long long T_n = T(n);
        c = count_divisors(T_n);
        printf("%d %d\n", T_n, c);
    }
    return 0;
}
