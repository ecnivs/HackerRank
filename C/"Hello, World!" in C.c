// "Hello, World!" in C
#include <stdio.h>
int main() 
{
    char s[100];
    printf("Hello, World!\n");
    scanf("%[^\n]%*c", &s);
    printf(s);
    
}
