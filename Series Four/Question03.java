import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Question03 {
    public static void main(String[] args) throws Exception {
        BufferedImage image = ImageIO.read(new File("image.bmp"));
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                // change brightness of the image 50% lighter
                int red = (int) (c.getRed() * 1.5);
                int green = (int) (c.getGreen() * 1.5);
                int blue = (int) (c.getBlue() * 1.5);
                red = (red > 255) ? 255 : red;
                green = (green > 255) ? 255 : green;
                blue = (blue > 255) ? 255 : blue;
                Color newColor = new Color(red, green, blue);
                image.setRGB(i, j, newColor.getRGB());
                // int red = (int) (c.getRed() * 0.299);
                // int green = (int) (c.getGreen() * 0.587);
                // int blue = (int) (c.getBlue() * 0.114);
                // Color newColor = new Color(red + green + blue, red + green + blue, red + green + blue);
                // image.setRGB(i, j, newColor.getRGB());
            }
        }
        File outputfile = new File("image2.bmp");
        ImageIO.write((RenderedImage) image, "bmp", outputfile);
    }
}