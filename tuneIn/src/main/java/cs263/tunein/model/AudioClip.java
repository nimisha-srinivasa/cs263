package cs263.tunein.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.blobstore.*;

@XmlRootElement
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
public class AudioClip {
  private String keyname;	
  private String title;
  private String ownerId;	//actually refers to a Key
  private String audio; 	//actually refers to a BlobKey
  private String image;		//actually refers to a BlobKey
  private Date date;

  public AudioClip(){

  }

  public AudioClip(String keyname, String title, String ownerId, String audio, String image, Date date){
  	this.keyname = keyname;
  	this.title = title;
  	this.ownerId = ownerId;
  	this.audio = audio;
  	this.image = image;
  	this.date = date;
  }

	public String getKeyname() {
		return keyname;
	}
	
	public void setKeyname(String keyname) {
		this.keyname = keyname;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	public String getAudio() {
		return audio;
	}
	
	public void setAudio(String audio) {
		this.audio = audio;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
  
} 