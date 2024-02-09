#include <stdio.h>
int countAlphabet(char ch, char s[]);
int main(void)
{
	char s[100], c;
	int i;

	scanf("%s", s);

	for (c = 'a'; c <= 'z'; c++)
		printf("%d ", countAlphabet(c, s));
	printf("\n");

}
int countAlphabet(char ch, char s[])
{
	int i;

	for (i = 0; s[i] != '\0'; i++)
		if (ch == s[i])
			return i;
	return -1;

}