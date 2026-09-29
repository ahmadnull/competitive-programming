#include <cstdint>
#include <iostream>

#define u32 uint32_t

u32 collatz(u32 n) {
    if (n % 2 == 0) return n / 2;
    return 3 * n + 1;
}

u32 chain_length(u32 n) {
    u32 length = 1;
    while (n != 1) {
        n = collatz(n);
        length++;
    }

    return length;
}

int main(void) {
    u32 max_length = 0;
    u32 n = 1;
    for (u32 i = 1; i < 1000000; i++) {
        u32 length = chain_length(i);
        max_length = std::max(max_length, length);
        if (max_length == length)
            n = i;
        std::cout << i << " " << length << " " << max_length << std::endl;
    }

    std::cout << n << " " << max_length << std::endl;

    return 0;
}
