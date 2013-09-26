#include <stdio.h>

#define SUCCESS 1
#define DEBUG 0

char str[] = "chaitanya";

int size();
void strRvrse();


int main () {	

	strRvrse();
	printf("%s\n", str);
	return SUCCESS;
}

int size ()
{
	int count = 0;
	char* pstr = str;
	while(*pstr != '\0')
	{
		count++;
		pstr++;
	}
	if (DEBUG) printf("%d\n", count);
	return count;
}

void strRvrse ()
{
	int i = 0;
	int len = size();
	if (DEBUG) printf("%d\n", len);
	for(; i < len/2; ++i)
	{
		char temp = str[i];
		if (DEBUG) printf("%c\n", temp);
		str[i] = str[len - i - 1];
		if (DEBUG) printf("%c\n", str[i]);
		str[len-i-1] = temp;
	}
	
}
