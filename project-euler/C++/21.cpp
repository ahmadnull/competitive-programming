#include <iostream>
#include <cstdint>

#define u16 uint16_t
#define u64 uint64_t

static u16 d(u16 n) {
    if (n <= 1) return 0;
 
    u16 sum = 1;
    for (u16 i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            if (i * i == n) sum += i;
            else {
                sum += i;
                sum += n / i;
            }
        }
    }

    return sum;
}

u64 amicable_sum(u16 limit, bool verbose) {
    u64 sum = 0;
    for (u16 a = 1; a < limit; a++) {
        u16 b = d(a);
        u16 d_b = d(b);
        bool is_amicable = d_b == a;

        if (verbose)
            std::cout << "a = " << a
                      << ", b = d(a) = " << b
                      << ", d(b) = " << d_b
                      << (is_amicable ? " (AMICABLE)" : "")
                      << std::endl;

        if (a < b && b < limit && is_amicable)
            sum += a + b;
    }

    return sum;
}

int main(void) {
    std::cout << "d(220) = " << d(220) << std::endl;
    std::cout << "d(284) = " << d(284) << std::endl;
    std::cout << "amicable_sum(limit = 10000) = " << amicable_sum(10000, true) << std::endl;
}
