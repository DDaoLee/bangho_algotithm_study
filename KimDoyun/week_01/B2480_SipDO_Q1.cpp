#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int maxDice(int firstDice, int secondDice, int thirdDice)
{
	int max = firstDice;
	if (max < secondDice) max = secondDice;
	if (max < thirdDice) max = thirdDice;

	return max;
}

int findDuplicate(int firstDice, int secondDice, int thirdDice, int* duplicateNum)
{
	int dupNum = 0;
	int dupCount = 0;
	if (firstDice == secondDice)
	{
		dupNum = firstDice;
		dupCount++;
	}
	if (firstDice == thirdDice)
	{
		dupNum = firstDice;
		dupCount++;
	}
	if (secondDice == thirdDice)
	{
		dupNum = secondDice;
		dupCount++;
	}
	*duplicateNum = dupCount;
	return 	dupNum;
}

int main()
{
	int firstDice=0, secondDice=0, thirdDice = 0;
	int dupNum=0, dupCount=0;
	scanf("%d %d %d", &firstDice, &secondDice, &thirdDice);

	dupNum = findDuplicate(firstDice, secondDice, thirdDice, &dupCount);
	switch (dupCount)
	{
		case 0 :
			printf("%d", maxDice(firstDice, secondDice, thirdDice) * 100);
			break;
		case 1 :
			printf("%d", dupNum * 100 + 1000);
			break;
		case 2:
		case 3:
			printf("%d", dupNum * 1000 + 10000);
			break;
	}
	return 0;
}