#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
	int min = 100;
	int input= 0;
	int sum = 0;
	int i = 0;

	for (i = 0; i < 7; i++)
	{
		scanf("%d", &input);
		if (input % 2 != 0)
		{
			sum += input;
			if (input < min) min = input;
		}
	}
	if (sum == 0) printf("-1");
	else printf("%d\n%d", sum, min);
	return 0;
}