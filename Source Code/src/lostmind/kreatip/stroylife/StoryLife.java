package lostmind.kreatip.stroylife;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class StoryLife extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_story_life);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.story_life, menu);
		return true;
	}

}
