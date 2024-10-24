// Playing with Characters
#include <stdio.h>

int main() 
{
    char ch,s[100],sen[122];
    scanf("%c", &ch);
    scanf("%s", &s);
    scanf(" %[^\n]%*c", &sen);
    printf("%c\n%s\n%s",ch,s,sen);
    return 0;
}

