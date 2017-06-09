import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int ukScore=0;
	public BowlingGame(){}
	
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		//to be implemented
		if (frames.size() < 10)
			frames.add(frame);
		else
			throw new BowlingException("Igra je zavrsena");
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		
	}
	public Frame getBonus()
	{
		return bonus;
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		for (int i = 0; i < frames.size(); i++) {

			
			if (i != 0) {
				if (frames.get(i - 1).isStrike())
					frames.get(i - 1).setFrameScore(frames.get(i - 1).score() + frames.get(i).score());
				else if (frames.get(i - 1).isSpare())
					frames.get(i - 1).setFrameScore(frames.get(i - 1).score() + frames.get(i).getFirstThrow());
			}

			ukScore += frames.get(i).score();
		}
		
		/*if (bonus != null) {
			if (frames.get(9).isSpare())
				ukScore += bonus.getFirstThrow();
			else if (frames.get(9).isStrike())
				ukScore += bonus.score();
		}*/
		return ukScore;
		
	}


	public List<Frame> getFrames() {
		return frames;
	}


	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
	
	
}
