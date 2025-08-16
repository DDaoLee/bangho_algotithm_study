#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
	int a=0, b=0, c=0, d=0;
	int sum = 0, i=0;

	while (i < 3)
	{
		scanf("%d %d %d %d", &a, &b, &c, &d);
		sum = a + b + c + d;
		switch (sum) {
		case 0:
			printf("D\n");
			break;
		case 1:
			printf("C\n");
			break;
		case 2:
			printf("B\n");
			break;
		case 3:
			printf("A\n");
			break;
		case 4:
			printf("E\n");
			break;
		}
		i++;
	}
	return 0;
}