package viewpager.myapplication;

/**
 * Created by Admin on 28-Jan-18.
 */

public class face {
    private String mColor;
    private int faceId;
    private String name;

    public face(String mColor, int faceId, String name) {
        this.mColor = mColor;
        this.faceId = faceId;
        this.name = name;
    }

    public String getColor() {
        return mColor;
    }

    public int getFaceId() {
        return faceId;
    }

    public String getName() {
        return name;
    }
}
