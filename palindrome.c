#include <stdio.h>
#include <stdlib.h>

#define DEBUG 0

int palindrome(char* input)
{	
	int size = 0;
	char* pa = input;
	while ( *input != '\0')
	{
		size++;
		if (DEBUG) printf("%c size: %d\n",*input, size);
		input++;
	}
	input = pa;
	int i = 0;
	for (; i < size/2; i++)
	{
		if ( input[i] != input[size-i-1] )  
		{
			if (DEBUG) printf("%d %c %c\n", i, input[i], input[size-i-1]);
			return 0;

		}
	}
	return 1;
}

int palindromeXOR(char* input){

	int size = 0;
	char* pa = input;
	while ( *input != '\0')
	{
		size++;
		if (DEBUG) printf("%c size: %d\n",*input, size);
		input++;
	}
	input = pa;
	int i = 0;
	for(; i < size/2; ++i){
		if (DEBUG) printf("%d %c %c\n", i, input[i], input[size-i-1]);
		if ((int)(input[i] ^ input[size-i-1])!= '\0')
		{
			return 0;	
		} 
	}
	return 1;
}

int palindromeNoSize(char* input)
{
	int count = 0;
	int size = 0;
	char* pa = input;
	while( *input != '\0') 
	{
		count = count ^ (int)*input;
		size++;
		input++;
		if (DEBUG) printf("%d %d %c\n", size, count, *input);
	}
	if (size & 1 == 1) count ^= pa[size/2];
	if(count == 0)
	{
		return 1;
	}
	else {
		return 0;
	}
}
int main ()
{	
	printf("This program checks if the given input is a palindrome or not\n");

	char *inputs[] = {"chaitanya", "nalin", "sayan", "aakash", "rhushal", "racecar"};
	int size = 6, i = 0;
	for( ;i < size; i++) 
	{			
	 	printf ("%s ",inputs[i]);
		palindromeNoSize(inputs[i]) == 1 ? printf("is a palindrome\n"):printf("is not a palindrome \n");		
	 	
	}
	return 0;
}
