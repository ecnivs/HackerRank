// Sum and Difference of Two Numbers
#include <stdio.h>

int main() {
    int int1, int2;
    float float1, float2;

    scanf("%d", &int1);
    scanf("%d", &int2);
    scanf("%f", &float1);
    scanf("%f", &float2);

    int int_sum = int1 + int2;
    int int_diff = int1 - int2;
    float float_sum = float1 + float2;
    float float_diff = float1 - float2;

    printf("%d ", int_sum);
    printf("%d\n", int_diff);
    printf("%.1f ", float_sum);
    printf("%.1f", float_diff);
    return 0;
}
