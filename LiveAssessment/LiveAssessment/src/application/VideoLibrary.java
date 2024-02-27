/*
 * VideoLibrary class - this is the main class which contains the code
 * to add, delete and display videos in a queue.
 * 
 * Student Name:
 * Student Number:
 * Date :  
 */

package application;

 
import java.util.Queue;
import java.util.Scanner;
import dataStructures.*;

public class VideoLibrary {

	final int DEFAULT_CAPACITY = 10;
	final int CURRENT_SIZE = 5;
	
	ArrayQueue<Video> theVideoLibrary;

	/** Constructor which returns 5 videos, allows the user to borrrow a video,
	 *  displays the remaining 4 videos, and finally allows the user to view a specific video
	 */
	public VideoLibrary() {
		theVideoLibrary = new ArrayQueue<Video>(DEFAULT_CAPACITY);

                //1. Return(i.e. add) 5 videos to the library
		for (int i = 1; i <= CURRENT_SIZE; i++)
			returnVideo(i);

                //2. Borrow a video from the library
		borrowVideo();
		
		//3. Display all videos
		displayVideos();
		
		//4. View a specific video
		viewASpecificVideo();

	} // end constructor

	/************ BORROW A VIDEO ***********************/
	/*
	 * This method allows the user to borrow a video.
	 */
	public void borrowVideo() {
		System.out.println("\n\nBorrow a video ....");

		
		System.out.println("top video is :");
		theVideoLibrary = Video.first();
			System.out.println( theVideoLibrary.getTitle() );
   			theVideoLibrary.dequeue();
   			

		
		// ADD CODE HERE
		/**
		 * The steps involved in this are: 
		 * 1. Check to see that the queue is not empty, display an error message if it is empty. 
		 * 2. If there are videos in the queue,then delete the element at the front of the queue. 
		 * 3. Display a message with the title of the video indicating that this video has been borrowed.
		 */
	} // end borrowVideos
	
	

	/**************** RETURN A VIDEO ***********************/
	/*
	 * This method allows the user to return a borrowed video assuming that there
	 * are not already 10 videos returned to the queue.
	 */
	public void returnVideo(int i) {
		System.out.println("\nReturn video " + i + "....");
		String Rating, VideoTitle;
		
	
		
		Scanner scan = new Scanner(System.in);
		while(!(Queue.isEmpty())
		{
	System.out.println("Size : " + CURRENT_SIZE);
	if(CURRENT_SIZE >5)
	{
		System.out.println("The list is full");
	}
	else
	{
		for( i = 1; i < CURRENT_SIZE; i++)
		{
			System.out.println("Enter the video title" + i++);
			VideoTitle = scan.nextLine();
			
			System.out.println("Enter the rating" + i++);
			Rating = scan.nextLine();
			scan.nextLine();
			
			theVideoLibrary = new ArrayQueue(videoTitle, rating);
			theVideoLibrary.enqueue(Video);
			
			System.out.println("The video been added to the queue");
			
		}
	}
		// ADD CODE HERE
		/*
		 * The steps involved in this are: 
		 * 1. Check to see that the queue isn't already
		 *    full (i.e. has 10 videos),, display an error message if it is full. 
		 * 2. If the queue isn't full then ask the user to input the video details and create a
		 *    new video 
		 * 3. Add the video to the end of the queue 
		 * 4. Display a message indicating that the video has been returned to the queue.
		 */

	} // end returnVideo

	/********** DISPLAY ALL VIDEOS ********************/
	/*
	 * This method displays all videos by displaying the video at the front of the
	 * queue, copying it to a temporary queue and repeating this action until all
	 * videos have been displayed. Then the contents of the temporary queue are
	 * copied back to the main queue.
	 */
	}
	public void displayVideos() {
		System.out.println("\n\nDisplay all videos....");

		
		while(!Queue.isEmpty())
		{
			if(Queue.isEmpty())
			{
				System.out.println("Sorry, there are no videos on display");
			}
			
			ArrayQueue<Video> TempQueue = new ArrayQueue<>();
			TempQueue = null;
			
			while(!Queue.isEmpty)
			{
				System.out.println(" The top video is " + Video.getTitle());
				
				theVideoLibrary.dequeue();
				TempQueue.enqueue(theVideoLibrary.dequeue());
				
			}
			
			theVideoLibrary = TempQueue;
			}
		}
		// ADD CODE HERE
		/*
		 * The steps involved in this are: 
		 * 1. Check to see that the queue isn't empty, display an error message if it is. 
		 * 2. If it is not empty then create a second temporary empty queue. 
		 * 3. Using a loop, delete and display the element at the front of the main queue, and copy it 
		 *    to the temporary queue. Repeat this process until the main queue is empty. 
		 * 4. Now with a second loop, copy all elements from the temporary queue one at a time to the main queue.
		 *    The loop will end when the temporary queue is empty.
		 * 
		 */

	} // end displayVideos

	
	/********** VIEW A SPECIFIC VIDEO ********************/
	/*
	 * This method searches for a specific video input by the user,
	 * deleting each video at the front of the queue until the specific video
	 * is found and displayed, or the end of the queue is reached.
	 */
	public void viewASpecificVideo() {
		System.out.println("\n\nView a specific vide0....");
		
		String VideoTitle, Rating;
		Scanner scan = new Scanner(System.in);

		for(int count = 1; count < CURRENT_SIZE; count++)
		{
			System.out.println("Enter the video title" + count++);
			VideoTitle = scan.nextLine();
			
			System.out.println("Enter the rating" + count++);
			Rating = scan.nextLine();
			scan.nextLine();
		}
		theVideoLibrary = ArrayQueue(videoTitle, rating);
		theVideoLibrary.enqueue(theVideoLibrary);
		
				Video FindVideo =  TempQueue(videoTitle, rating);
				ArrayQueue<Video> TempQueue = new ArrayQueue<>();
				while(!queue.isEmpty())
					if(videoTitle.equals(FindVideo))
						System.out.println("Video found " + theVideoLibrary.first());
						theVideoLibrary.dequeue();
					TempQueue.enqueue(theVideoLibrary.dequeue());
				theVideoLibrary = TempQueue;

		// ADD CODE HERE
		/*
		 * The steps involved in this are: 
		 * 1. Check to see that the queue isn't empty, display an error message if it is. 
		 * 2. Ask user for video details and create a new video 
		 * 3. Using a loop, compare the new video against the video at the front of the queue, 
		 *     if its the same video then display it otherwise remove it. 
               Keep looping until either the video is found or the end of the queue is
		 *     reached and a message saying that the video could not be found is displayed
		 */
	}//end viewASpecificVideo

	// This is the main method code.
	public static void main(String[] args) {

		new VideoLibrary();

	}// end main
} // end VideoLibrary
