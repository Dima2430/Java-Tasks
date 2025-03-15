package medium;

public class VideoLengthinSeconds {
    public static int videoLengthInSeconds(String time) {
          if (time == null || time.isEmpty()) return -1;
        String[] parts = time.trim().split(":");
        if (parts.length > 3 || parts.length < 1) return -1;
        try {
             int hours = 0, minutes = 0, seconds = 0;
           if (parts.length == 3) {
               hours = Integer.parseInt(parts[0]);
               minutes = Integer.parseInt(parts[1]);
               seconds = Integer.parseInt(parts[2]);
           } else if (parts.length == 2) {
             minutes = Integer.parseInt(parts[0]);
               seconds = Integer.parseInt(parts[1]);
           } else if(parts.length == 1) {
             seconds = Integer.parseInt(parts[0]);
         } else {
             return -1;
         }
            if (hours < 0 || minutes < 0 || seconds < 0 || seconds > 59 || minutes > 59) {
                return -1;
            }

            return hours * 3600 + minutes * 60 + seconds;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(videoLengthInSeconds("01:13:56")); // 4436
        System.out.println(videoLengthInSeconds("13:56"));    // 836
        System.out.println(videoLengthInSeconds("45"));       // 45
        System.out.println(videoLengthInSeconds("99:99"));    // -1
        System.out.println(videoLengthInSeconds("1:3:9"));     // 3789
        System.out.println(videoLengthInSeconds("  05:05  ")); // 305
        System.out.println(videoLengthInSeconds("abc"));      // -1
        System.out.println(videoLengthInSeconds(null));       // -1
    }
}
