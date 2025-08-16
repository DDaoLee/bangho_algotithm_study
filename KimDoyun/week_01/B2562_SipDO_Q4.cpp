#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
	int max = -1;
	int input = 0;
	int i = 0;
	int index = 0;

	for (i = 0; i < 9; i++)
	{
		scanf("%d", &input);
		if (max < input)
		{
			max = input;
			index = i+1;
		}

	}
	printf("%d\n%d", max, index);
	return 0;
}