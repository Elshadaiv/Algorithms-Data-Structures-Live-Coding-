/********************
//
// Question 2
//
// Name :Elshadai Veloso
// Class : TU914/2
//
// You may add any extra variables
// you need to this program
/********************/

#define _CRT_SECURE_NO_WARNINGS 1
#define bool int
#define false 0
#define true (!false)

#include <stdio.h>
#include <string.h>

#define SIZE 4


//Structure Template
struct student {
	char surname[20];
	char moduleName[20];
	int examResult;
};

//Global Variable
struct student studentDetails[SIZE];

//Function Prototypes
char* findBestStudent(); //find and return the address of the name of the best student
void findADSStudents(); //find and display the number of students studying ADS2

/*  FOR EACH OF THE FUNCTIONS BELOW, YOU ARE ALLOWED TO RENAME OR IGNORE EXISTING VARIABLES;
	OR INCLUDE ANY EXTRA VARIABLES YOU NEED FOR YOUR SOLUTION */

	/***** MAIN FUNCTION *******/
int main()
{
	char* surname;
	int index;

	for (index = 0; index < SIZE; index++)
	{
		//ADD CODE HERE TO ASK USER TO INPUT THE 4 STUDENT DETAILS INTO THE ARRAY
		printf("enter surname %d", index + 1);
		scanf("%s", studentDetails[index].surname); //asking th user to input the surname

		printf("enter module %d", index + 1);
		scanf("%s", studentDetails[index].moduleName); //input the module

		printf("enter exam result %d ", index + 1);
		scanf("%d", &studentDetails[index].examResult);//input exam result

	}

	//Call the other functions
	surname = findBestStudent();
	printf("Student with surname %s has the highest exam result\n\n", surname);

	findADSStudents();

	getchar();
	getchar();

	return 0;
}//end main


// COMPLETE THE FOLLOWING FUNCTIONS 

//Find and return the surname of the student with the highest exam result.
//You can assume that the exam results are all different, you don't need to check for this.
char* findBestStudent() {
	int bestIndex = 0; //index position of student with highest result seen so far
	int bestResult = 0; //highest result seen so far


	//ADD CODE HERE 
	//1. Using a loop, access all 4 of the students in the array in turn updating the
	//bestIndex and bestResult if a new higher result is found

	for (int i = 0; i < SIZE; i++) //for loop to go through the array
	{
		if (studentDetails[i].examResult>bestResult) //if its more than best result
		{
			bestResult = studentDetails[i].examResult; //the best result is now the exam result
			bestIndex = i; //the best index is now i

			printf("best student is % s",studentDetails[i].surname); //prints out the best stdent
		}
		else
		{
			printf("no students found");
		}
	}


}//end findBestStudent


//calculate and display the number of students studying ADS2
void findADSStudents() {
	printf("\n\nThe number of students studying ADS2 are ...\n\n");
	for (int i = 0; i < SIZE; i++) //a for loop for the array
	{
		if (strcmp(studentDetails[i].moduleName, "ADS2") == 0) //if the module name is ADS2 - STRCMP gets the two strings and compares them
		{
			printf("%s",studentDetails[i].surname); //print the surname
		}
		else
		{
			printf("there are no students studying ADS2"); ///printd this if they cannot find a student studying ADS2
		}

	}


} //end findADSStudent


