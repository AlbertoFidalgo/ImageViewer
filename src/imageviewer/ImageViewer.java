package imageviewer;

import controller.MainFrame;
import java.io.File;
import model.Image;
import persistance.FileImageLoader;

public class ImageViewer {

    public static void main(String[] args) {
        File file = new File("capibaras");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
        
    }
    
}
