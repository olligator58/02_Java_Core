package Task061300;

import Task061300.common.ImageReader;
import Task061300.common.ImageTypes;

/*
Factory method pattern
*/

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.BMP);
    }
}
