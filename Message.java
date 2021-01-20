package message;

public class Message {
Text text;
Image image;
Video video;
Audio audio;
public Message() {
	super();
	this.text = new Text();
	this.image = new Image();
	this.audio = new Audio();
	this.video = new Video();
	
}
}
