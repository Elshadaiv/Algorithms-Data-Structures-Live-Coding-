/*
 * Video class - this describes the structure and behaviour
 * of a video
 * 
 * Student Name :
 * Student Number : 
 * Date :  
 */

package application;

public class Video {
    private String videoTitle;
    private String rating;
    
    
    public Video() {
      this.videoTitle = "";
      this.rating = "";
    }
    
       
    public Video (String t, String r) {
    	
    	this.videoTitle = t;
    	this.rating = r;
    	
    	/*if(rating.equals( "Novice" || "expert"))
    	{
    		System.out.println("This rating is not avaliable");
    	}
    	else 
    	{
    		return this.r;
    	}*/
    	
       // ADD CODE HERE
       //1. Update the videoTitle to the parameter value
       //2. If the parameter value for rating is incorrect
       // (i.e. not "novice" or "expert"), then set the rating 
       //to Error otherwise set it to the parameter value
    }		
    
    //getter methods
    public String getTitle() {
        return this.videoTitle; 
    }
    
    public String getRating() {
        return this.rating;
    }
   
       
    // setter methods
    public void setTitle (String t) {
        t = this.videoTitle;
    }
    
    public void setRating (String r) {
        r = this.rating;
    }
    
    // generate a string representation of a video
    public String toString() {
        // ADD CODE HERE
      return "The Title of this Video is :" + this.videoTitle + "and the rating of this is : " + this.rating ; 
      //delete this line when you have added the correct code 
    }
    
    //ADD AN equals() METHOD HERE
    public boolean equals(Object o)
    {
    	
    	Video v = (Video)o;
    	
    	if(this.videoTitle.equalsIgnoreCase( v.getTitle()) && this.rating.equalsIgnoreCase(v.getRating()))
	return true;
    	
    		else 

    			return false;
}
    
}// end Video


