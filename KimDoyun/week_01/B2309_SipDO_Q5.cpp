#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

int compare(const void *a, const void *b) {
	return (*(int*)a - *(int*)b);
}
int main()
{
	int input[9] = { 0 };
	int i = 0, j=0, k=0;
	int sum = 0;

	for (i = 0; i < 9; i++)
	{
		scanf("%d", &input[i]);
		sum += input[i];
	}
	qsort(input, 9, sizeof(int), compare);

	for (i = 0; i < 8; i++)
	{
		for (j = i + 1; j < 9; j++)
		{
			if (sum - input[i] - input[j] == 100)
			{
				for (k = 0; k < 9; k++)
				{
					if (k != i && k != j)
					{
						printf("%d\n", input[k]);
					}
				}
				return 0;
			}
		}
	}

	return 0;
}