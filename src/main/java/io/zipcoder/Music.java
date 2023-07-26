package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int targetIndex = 0;
        for (int i = 0; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                targetIndex = i;
            }
        }

        int clockwiseSteps = (targetIndex - startIndex + playList.length) % playList.length;
        int counterclockwiseSteps = (startIndex - targetIndex + playList.length) % playList.length;

        return Math.min(clockwiseSteps, counterclockwiseSteps);
    }
}
