/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v3.remoteWl;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	public void undo() {
		stereo.off();
		stereo.setCD();
		stereo.setVolume(0);
	}
}
