#include <stdio.h>

int main(int argc, char* argv[])
{
        printf("sizeof(char)=%ld\n", sizeof(char));
        printf("sizeof(short)=%ld\n", sizeof(short));
        printf("sizeof(int)=%ld\n", sizeof(int));
        printf("sizeof(long)=%ld\n", sizeof(long));
        printf("sizeof(long long)=%ld\n", sizeof(long long));
        printf("sizeof(void*)=%ld\n", sizeof(void*));
        printf("sizeof(size_t)=%ld\n", sizeof(size_t));
	return 0;
}
