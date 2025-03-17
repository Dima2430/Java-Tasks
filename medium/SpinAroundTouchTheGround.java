package medium;
public class SpinAroundTouchTheGround {
    public static int spinAroundTouchTheGround(String[] arr) {
        int rot = 0;
        for (String string : arr) {
            String[] parts = new String[2];
            String str = string.trim().toLowerCase();
            int angle = 90;
            if (str.split(" ").length == 2) {
                parts = str.split(" ");
                str = parts[0];
                try {
                     angle = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    continue;
                }
            }
            if (str.equals("right")) {
              rot += angle;
            } else if (str.equals("left")) {
                rot -= angle;
            } 
        }
        return Math.abs(rot) / 360;
    }
    public static void main(String[] args) {
        System.out.println(spinAroundTouchTheGround(new String[]{"left 180", "right", "right", "left", "left", "right ninety", "spin 360", "left 45", "right 9O"}
));
    }
}
