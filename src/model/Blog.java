package model;
// Type your code

import java.time.LocalDate;
public class Blog
{
	String title;
	int description;
	LocalDate postedOn;
	public Blog(String title,int description,LocalDate postedOn)
	{
		this.title=title;
		this.description=description;
		this.postedOn=postedOn;
	}
	 
	public void setTitle(String title)
	{
		this.title=title;
	}
      public String getTitle()
      {
    	     return title;
      }
      public void setDescription(int  description)
  	{
  		this.description=description;
  	}
        public int  getDescription()
        {
      	     return   description;
        }
        public void setLocalDate(LocalDate postedOn)
    	{
    		this.postedOn =postedOn;
    	}
          public LocalDate getLocalDate()
          {
        	     return postedOn;
          }
	}
