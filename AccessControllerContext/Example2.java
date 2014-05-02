
public class Example2{
	public static void main(String[] args){
		TextFileDisplayer tfd = new TextFileDisplayer("/Users/dinghui/Project/question.txt");
		Friend friend = new Friend(tfd, true);
		Stranger stranger = new Stranger(tfd, true);
		stranger.doYourThing();
	}
}
