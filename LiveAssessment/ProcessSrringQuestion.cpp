/**********************************
//
// Question 1
//
//Name : Elshadai Veloso
// Class : TU914/2
//
// You may add any extra variables
// you need to this program
*********************************/

#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <string.h>

int processString(char*, char);

int main() { //change return type to int if appropriate
	char string[50];
	int count = 0;

	printf("Enter the string: ");
	fgets(string, 50, stdin);

	count = processString(string, '?');

	printf("\nNumber of words: %d\n", count);

	getchar();
	getchar();

	return 0;
}


int processString(char* string, char c) {
	int count = 0;
	int i;

	//1. Access each character of the string, and replace each occurrance of a, e, i, o and u with the character in c
	for ( i = 0; i < strlen(string); i++) //adding a for loop
	{
		if (string[i] == 'a' || string[i] == "e" || string[i] == "i" || string[i] == "o" || string[i] == "u") //if the string = the vowels i string turns into characater c
		{
			string[i] == c;
		}

	}

	for (i = 0; i < strlen(string); i++) //adding a for loop
	{
		if (string[i] == ' ') // each time the letter is a space it will count as a word
		{
			count++;
		}

		else
		{
			count--;
		}
	}
	//2. Count the number of words in the string
	printf("\n%s\n", string);

	return count;

}
