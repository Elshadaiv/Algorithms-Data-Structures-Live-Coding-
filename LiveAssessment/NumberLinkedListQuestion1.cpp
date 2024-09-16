//************************************
//
// Question 3     
// 
// Name :          Elshadai Veloso                   
// Class : TU914/2                 
//	
// You may add any extra variables 
// you need to this program						        
//**********************************/

#define _CRT_SECURE_NO_WARNINGS 1
#define bool int
#define false 0
#define true (!false)

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define SIZE 10


//Structure Template
struct data {
	int num;
};

struct LinearNode {
	struct data* element;
	struct LinearNode* next;
};


//Global Variable - pointers to first and last elements in the list
struct LinearNode* first = NULL;  //pointer to the first element in the list
struct LinearNode* last = NULL;  //pointer to the last element in the list



//Function Prototypes
void addNumber();
void displayNumbers();
void reverseNumbers();
bool isEmpty();


/***** MAIN FUNCTION *******/
int main()
{
	//Input 10 numbers into the linked list
	for (int index = 0; index < SIZE; index++) {
		printf("\n****** Enter Details for element %d ********\n", index + 1);
		addNumber();
		printf("****** Finished with element %d\n\n", index + 1);
	}

	displayNumbers();
	reverseNumbers();

	getchar();
	getchar();

	return 0;
}


// check to see if the list is empty
// the function returns true or false.
bool isEmpty()
{
	if (first == NULL)
		return true;
	else
		return false;
}



/*** COMPLETE THE FOLLOWING FUNCTIONS ***/

//ADD A NEW ELEMENT TO THE END OF THE LIST
void addNumber()
{
	int aNumber;
	struct LinearNode* aNode;
	struct data* anElement;

	printf("Enter a number: ");
	scanf("%d", &aNumber);

	// create space for new node
	aNode = (struct LinearNode*)malloc(sizeof(struct LinearNode));
	anElement = (struct data*)malloc(sizeof(struct data));

	if (aNode == NULL || anElement == NULL)
		printf("Error - no space for the new node\n");
	else { // add data part to the node
		anElement->num = aNumber;
		aNode->element = anElement;
		aNode->next = NULL;
	}//end else
  /** ADD CODE HERE - INSERT THE NEW NODE AT THE END OF THE LIST */
	if (isEmpty()) //if the list is empty
	{
		first = aNode; //first node is the new node
		last = aNode; //the last node is also the new node
	}
	else
	{
		last->element = aNode->element; //the last node is now the new node
		last = aNode; 
	}
}//end addNumber



// DISPLAY FIRST, FOURTH, FIFTH, EIGHTH and NINTH NUMBERS IN THE LIST
void displayNumbers() {
	int i;
	struct LinearNode* current = NULL;
	current = first;

	/** Starting with the first element in the list, iterate though all elements
	and only display the 1st, 4th, 5th, 8th and 9th numbers in the list */
	for ( i = 1; i <= SIZE; i++) //adding a for loop
	{
		if (i == 1 || i == 4 || i == 5 || i == 8 || i == 9) //if the element is the 1st, 4th, 5th, 8th or 9th element
		{
			printf("element %d %d", current->element->num); //displays this
			current = current->next; //the current node now links to the next
		}
		else
		{
			current = current->next;
		}
	}

}//end displayNumbers


// DISPLAY THE ELEMENTS IN THE LIST IN REVERSE
void reverseNumbers() {
	struct LinearNode* current = NULL;
	current = last;// declaring that current is the last node

	/** Starting with the 10th (ie. last ) element in the list,
	display it, then display the 9th, 8th, 7th, 6th, etc until until you have displayed the first element
	*/
	while (current != NULL) //while the current node is not empty
	{
		printf("element %d %d", current->element->num); //display the element
		current = current->next; 

	}

	

}//end reverseNumbers