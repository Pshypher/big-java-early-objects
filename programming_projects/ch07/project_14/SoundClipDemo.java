public class SoundClipDemo
{
    public static void main(String[] args)
    {
        SoundClip clip = new SoundClip();
        clip.pick();
        clip.show();    

        int[] samples = clip.getSampleValues();

        // In this example, we don't need the sample rate.
        // If you do, call clip.getSampleRate();

        // Introduce echo after 0.2 seconds        
        // get the number of samples after 0.2 seconds
        int j = (int) (clip.getSampleRate() * 0.2);
        for (int i = 0; i < samples.length; i++)
        {
            if (i > j)
            {
                int k = i - j;
                samples[i] = Math.min(samples[i] + samples[j], 32767);
            }
        }
      
      clip.show();
   }
}
