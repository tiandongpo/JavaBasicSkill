import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AudioApplet extends Applet implements ActionListener,ItemListener
{
	List audioList;
	String audioNames[]={"1.wav","2.wav","3.wav","4.wav","5.wav","6.wav","7.wav","8.wav"};
	Button btn_play,btn_stop,btn_loop;
	AudioClip myaudio;
	int k;
	
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER));
		audioList = new List(4,false);
		audioList.addActionListener(this);
		audioList.addItemListener(this);
		for(int i=0;i<audioNames.length;i++)
			audioList.add(audioNames[i]);
		add(audioList);
		
		btn_play = new Button("²¥·ÅÉùÒô");
		btn_play.addActionListener(this);
		add(btn_play);
		btn_play.setEnabled(false);
		
		btn_stop = new Button("Í£Ö¹²¥·Å");
		btn_stop.addActionListener(this);
		add(btn_stop);
		btn_stop.setEnabled(false);
		
		btn_loop = new Button("Ñ­»·²¥·Å");
		btn_loop.addActionListener(this);
		add(btn_loop);
		btn_loop.setEnabled(false);
	
	
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		k = audioList.getSelectedIndex();
		myaudio = getAudioClip(getDocumentBase(),audioNames[k]);
		System.out.println(getDocumentBase());
		btn_play.setEnabled(true);
		btn_loop.setEnabled(true);
		repaint();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn_play)
		{
			myaudio.play();
			btn_stop.setEnabled(true);
		}
		else if(e.getSource()==btn_loop)
		{
			myaudio.loop();
			btn_stop.setEnabled(true);
		}
		else if(e.getSource() ==btn_stop)
		{
			myaudio.stop();
			btn_stop.setEnabled(false);
		}
		repaint();
	}
	

}
