package Task061300;


import Task061300.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        ImageReader result;
        if (imageType instanceof ImageTypes) {
            switch (imageType) {
                case JPG:
                    result = new JpgReader();
                    break;
                case BMP:
                    result = new BmpReader();
                    break;
                case PNG:
                    result = new PngReader();
                    break;
                default:
                    throw new IllegalArgumentException("Неизвестный тип картинки");
            }
            return result;
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
