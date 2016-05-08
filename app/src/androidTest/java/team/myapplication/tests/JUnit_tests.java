

import android.test.ActivityInstrumentationTestCase2;

import team.myapplication.MainActivity;
/**
 * Created by Zhuyupei on 5/8/16.
 */

public class JUnit_tests extends ActivityInstrumentationTestCase2<MainActivity> {
     MainActivity mainActivity;
     public JUnit_tests(){
         super(MainActivity.class);
     }

    public void test_first(){
        mainActivity = getActivity();
        assertEquals(20,20);
    }
}
